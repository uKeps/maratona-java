package maratona.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratona.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratona.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}' in the database", producer.getName(), e);
        }
    }

    public static void delete(int idproducer) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`idproducer` = '%d');".formatted(idproducer);
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows affected '{}'", idproducer, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}' in the database", idproducer, e);
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`idproducer` = '%d');\n".formatted(producer.getName(), producer.getIdproducer());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}', rows affected '{}'", producer.getIdproducer(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}' in the database", producer.getIdproducer(), e);
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all producers");
        return findByName("");
//        String sql = "SELECT idproducer, name FROM anime_store.producer;";
//        List<Producer> producers = new ArrayList<>();
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                Producer producer = Producer
//                        .builder()
//                        .idproducer(rs.getInt("idproducer"))
//                        .name(rs.getString("name"))
//                        .build();
//                producers.add(producer);
//            }
//        } catch (SQLException e) {
//            log.error("Error while trying to find all producer", e);
//        }
//        return producers;
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding producers by name");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .idproducer(rs.getInt("idproducer"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);
        }
        return producers;
    }
}
