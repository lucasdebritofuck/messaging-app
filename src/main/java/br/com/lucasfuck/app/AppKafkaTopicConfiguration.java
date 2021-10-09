package br.com.lucasfuck.app;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class AppKafkaTopicConfiguration {

    @Bean
    public NewTopic topicFuck() {
        return TopicBuilder.name("lucas")
                .partitions(1)
                .build();
    }
}
