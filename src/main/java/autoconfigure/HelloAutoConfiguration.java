package autoconfigure;



import autoconfigure.core.Boss;
import autoconfigure.core.HelloProperties;
import autoconfigure.core.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnProperty(prefix = "hello.person",name = "person-name",matchIfMissing = false)
    public Person boss(HelloProperties helloProperties) {
        return new Boss(helloProperties.getPerson().getPersonName(),helloProperties.getPerson().getPersonAge(),
                helloProperties.isEnabled());
    }
}
