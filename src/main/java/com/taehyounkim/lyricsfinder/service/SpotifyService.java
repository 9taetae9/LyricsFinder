package com.taehyounkim.lyricsfinder.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SpotifyService {

    private final WebClient webClient;

    public SpotifyService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> searchTracks(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/v1/search")
                        .queryParam("q", query)
                        .queryParam("type", "track")
                        .build())
                .retrieve()
                .bodyToMono(String.class);
    }
}