package maratona.javacore.ZZJcrud.repository;


import lombok.extern.log4j.Log4j2;
import maratona.javacore.ZZJcrud.conn.ConnectionFactory;
import maratona.javacore.ZZJcrud.domain.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding Producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer
                        .builder()
                        .idproducer(rs.getInt("idproducer"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        // Use a parameter placeholder (?) and set the value with wildcards to avoid SQL injection
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static void delete(int idproducer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, idproducer)) {
            ps.execute();
            log.info("Deleted producer '{}' from the database ", idproducer);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}' in the database", idproducer, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, Integer idproducer) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`idproducer` = ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idproducer);
        return ps;
    }
}
