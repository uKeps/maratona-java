package maratona.javacore.ZZIjdbc.service;

import maratona.javacore.ZZIjdbc.domain.Producer;
import maratona.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(Integer idproducer){
        requireValidId(idproducer);
        ProducerRepository.delete(idproducer);
    }

    public static void update(Producer producer){
        requireValidId(producer.getIdproducer());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }

    private static void requireValidId(Integer idproducer){
        if (idproducer == null || idproducer <= 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
