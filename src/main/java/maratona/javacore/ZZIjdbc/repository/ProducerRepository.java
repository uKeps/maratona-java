package maratona.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratona.javacore.ZZIjdbc.conn.ConnectionFactory;
import maratona.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'",producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}' in the database", producer.getName(), e);
        }
    }

    public static void delete(int idproducer) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`idproducer` = '%d');".formatted(idproducer);
        try(Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows affected '{}'",idproducer, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}' in the database", idproducer, e);
        }
    }
}
