package maratona.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratona.javacore.ZZIjdbc.domain.Producer;
import maratona.javacore.ZZIjdbc.service.ProducerService;


@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().idproducer(1).name("MADHOUSE").build();
        //ProducerService.save(producer);
        //ProducerService.delete(4);
        // ProducerService.update(producerToUpdate);
        //List<Producer> producers = ProducerService.findAll();
        //List<Producer> producers = ProducerService.findByName("mad");
        // log.info(producers);
        //ProducerService.showProducerMetadata();
        //ProducerService.showDriverMetadata();
        ProducerService.showTypeScrollWorking();
    }
}
