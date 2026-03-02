package maratona.javacore.ZZIjdbc.service;

import maratona.javacore.ZZIjdbc.domain.Producer;
import maratona.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void saveTransaction(List<Producer> producers){
        ProducerRepository.saveTransaction(producers);
    }

    public static void delete(Integer idproducer){
        requireValidId(idproducer);
        ProducerRepository.delete(idproducer);
    }

    public static void update(Producer producer){
        requireValidId(producer.getIdproducer());
        ProducerRepository.update(producer);
    }

    public static void updatePreparedStatement(Producer producer){
        requireValidId(producer.getIdproducer());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }
    public static List<Producer> findByNameAndUpdateToUpperCase(String name){
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }
    public static List<Producer> findByNameAndInsertWhenNotFound(String name){
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }
    public static List<Producer> findByNamePreparedStatement(String name){
        return ProducerRepository.findByNamePreparedStatement(name);
    }
    public static List<Producer> findByNameCallableStatement(String name){
        return ProducerRepository.findByNameCallableStatement(name);
    }
    public static void findByNameAndDelete(String name){
        ProducerRepository.findByNameAndDelete(name);
    }

    public static void showProducerMetadata(){
        ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetadata(){
        ProducerRepository.showDriverMetaData();
    }
    public static void showTypeScrollWorking(){
        ProducerRepository.showTypeScrollWorking();
    }

    private static void requireValidId(Integer idproducer){
        if (idproducer == null || idproducer <= 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
