package maratona.javacore.ZZIjdbc.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public final class Producer {
    private final Integer idproducer;
    private final String name;
}
