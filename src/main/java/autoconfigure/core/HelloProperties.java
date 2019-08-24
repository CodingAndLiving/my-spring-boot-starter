package autoconfigure.core;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = HelloProperties.HELLO_PREFIX)
@Data
public class HelloProperties {
    static final String HELLO_PREFIX = "hello";

    private Person person;
    private boolean enabled;

    @Data
    public static class Person {
        private String personName;
        private String personAge;
    }
}




