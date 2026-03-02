package maratona.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratona.javacore.ZZIjdbc.domain.Producer;
import maratona.javacore.ZZIjdbc.repository.ProducerRepositoryRowSet;
import maratona.javacore.ZZIjdbc.service.ProducerServiceRowSet;

import java.util.List;


@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().idproducer(1).name("MAD").build();

        ProducerServiceRowSet.updateJdbcRowSet(producerToUpdate);
        log.info("------------------");
        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
        log.info(producers);

    }
}
