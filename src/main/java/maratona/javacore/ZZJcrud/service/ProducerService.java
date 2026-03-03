package maratona.javacore.ZZJcrud.service;

import maratona.javacore.ZZJcrud.domain.Producer;
import maratona.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all: ");
        String name = SCANNER.nextLine();ProducerRepository.findByName(name)
                .forEach(p->System.out.printf("[%d] - %s%n", p.getIdproducer(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type the id of the producer you want to delete: ");
        int idproducer = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(idproducer);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer you want to save: ");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }
}
