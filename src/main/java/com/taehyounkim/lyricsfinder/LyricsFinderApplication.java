package com.taehyounkim.lyricsfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taehyounkim.lyricsfinder.openaimodule.OpenAIRequest;

@SpringBootApplication
public class LyricsFinderApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyricsFinderApplication.class, args);
    }

}
