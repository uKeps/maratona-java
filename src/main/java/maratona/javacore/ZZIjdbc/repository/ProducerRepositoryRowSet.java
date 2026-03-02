package maratona.javacore.ZZIjdbc.repository;

import maratona.javacore.ZZIjdbc.Listener.CustomRowSetListener;
import maratona.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratona.javacore.ZZIjdbc.domain.Producer;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?";
        List<Producer> producers = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1,String.format("%%%s%%", name));
            jrs.execute();
            while (jrs.next()) {
                Producer producer = Producer.builder()
                        .idproducer(jrs.getInt("idproducer"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }

//    public static void updateJdbcRowSet(Producer producer) {
//        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`idproducer` = ?)";
//        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
//            jrs.setCommand(sql);
//            jrs.setString(1,producer.getName());
//            jrs.setInt(1,producer.getIdproducer());
//            jrs.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM anime_store.producer WHERE (`idproducer` = ?)";
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1,producer.getIdproducer());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE (`idproducer` = ?)";
        try (CachedRowSet crs = ConnectionFactory.getCachedRowSet();
        Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1,producer.getIdproducer());
            crs.execute(conn);
            if (!crs.next()) return;
            crs.updateString("name", producer.getName());
            crs.updateRow();
            TimeUnit.SECONDS.sleep(10);
            crs.acceptChanges();
        } catch (SQLException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
