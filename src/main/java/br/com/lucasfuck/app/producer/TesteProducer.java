package br.com.lucasfuck.app.producer;

import br.com.lucasfuck.messaging.topic.TopicProvider;
import org.springframework.stereotype.Component;

@Component
public class TesteProducer {

    private final TopicProvider topicProvider;

    public TesteProducer(TopicProvider topicProvider) {
        this.topicProvider = topicProvider;
    }

    public void addTesteTopic() {
        topicProvider.create("fuck");
    }
}
