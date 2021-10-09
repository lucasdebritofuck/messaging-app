package br.com.lucasfuck.app;

import br.com.lucasfuck.app.producer.TesteProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Teste implements CommandLineRunner {

    @Autowired
    private TesteProducer testeProducer;

    @Override
    public void run(String... args) throws Exception {
        testeProducer.addTesteTopic();
    }
}
