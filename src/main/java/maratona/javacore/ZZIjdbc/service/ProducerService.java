package maratona.javacore.ZZIjdbc.service;

import maratona.javacore.ZZIjdbc.domain.Producer;
import maratona.javacore.ZZIjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int idproducer){
        if (idproducer <= 0){
            throw new IllegalArgumentException("Id producer must be greater than zero");
        }
        ProducerRepository.delete(idproducer);
    }
}
