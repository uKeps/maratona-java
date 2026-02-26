package maratona.javacore.ZZIjdbc.domain;

import java.util.Objects;

public class Producer {
    private Integer idproducer;
    private String name;

    public static final class ProducerBuilder {
        private Integer idproducer;
        private String name;

        private ProducerBuilder() {
        }

        public static ProducerBuilder builder() {
            return new ProducerBuilder();
        }

        public ProducerBuilder idproducer(Integer idproducer) {
            this.idproducer = idproducer;
            return this;
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            Producer producer = new Producer();
            producer.name = this.name;
            producer.idproducer = this.idproducer;
            return producer;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return Objects.equals(idproducer, producer.idproducer) && Objects.equals(name, producer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idproducer, name);
    }

    public Integer getIdproducer() {
        return idproducer;
    }

    public String getName() {
        return name;
    }
}
