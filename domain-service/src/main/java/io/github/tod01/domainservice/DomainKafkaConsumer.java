package io.github.tod01.domainservice;

import io.github.tod01.domaincrawler.Domain;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class DomainKafkaConsumer {

    /**
     * We consume the messages. As It is a Consumer method, we don't have to send anything back.
     * @return
     */

    @Bean
    public Consumer<KStream<String, Domain>> domainService() {
        return kstream -> kstream.foreach((key, domain) -> {
            System.out.printf(String.format("Domain consumed [%s] Inactive [%s]", domain.getDomain(), domain.isDead()) + "\n");
        });
    }
}
