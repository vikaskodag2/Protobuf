package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    public WebClient webClient() {
        final int size = 16 * 1024 * 1024;
        final ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(size))
                .build();
        return WebClient.builder()
                .exchangeStrategies(strategies)
                .baseUrl("http://localhost:9001/authors")
                .build();
    }

//    @Bean
//    public ObjectMapper objectMapper() {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
//        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        objectMapper.configure(SerializationFeature.FAIL_ON_SELF_REFERENCES, false);
//
//        return objectMapper;
//    }

//    @Bean
//    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
//        return o -> {
//            o.serializerByType(Message.class, new JsonSerializer<Object>() {
//                @Override
//                public void serialize(Message value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
//                    gen.writeRawValue(JsonFormat.printer().print(value));
//                }
//            });
//        };
//    }

}
