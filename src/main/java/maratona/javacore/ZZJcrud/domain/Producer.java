package maratona.javacore.ZZJcrud.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer idproducer;
    String name;
}
