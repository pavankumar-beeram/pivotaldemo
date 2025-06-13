package com.pivot;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DemoService {

    private final WebClient webClient;

    @Autowired
    public DemoService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    public String getDummyData() {
        return webClient.get()
                .uri("/todos/1")
                .retrieve()
                .bodyToMono(String.class)
                .block(); 
    }
}
