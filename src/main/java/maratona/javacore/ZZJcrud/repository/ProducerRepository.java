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
import java.util.Optional;

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

    public static Optional<Producer> findById(Integer idproducer) {
        log.info("Finding Producer by id '{}'", idproducer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, idproducer);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();

            return Optional.of(Producer
                    .builder()
                    .idproducer(rs.getInt("idproducer"))
                    .name(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer idproducer) throws SQLException {
        // Use a parameter placeholder (?) and set the value with wildcards to avoid SQL injection
        String sql = "SELECT * FROM anime_store.producer where idproducer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idproducer);
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

    public static void save(Producer producer) {
        log.info("Saving producer '{}'", producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}' in the database", producer.getIdproducer(), e);
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer '{}'", producer.getIdproducer());
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = CreatePreparedStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}' in the database", producer.getIdproducer(), e);
        }
    }

    private static PreparedStatement CreatePreparedStatementUpdate(Connection conn,Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`idproducer` = ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getIdproducer());
        return ps;
    }
}
