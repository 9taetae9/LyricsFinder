package com.taehyounkim.lyricsfinder.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taehyounkim.lyricsfinder.openaimodule.OpenAIRequest;

@RestController
public class OpenAiController {
	@Value("${spring.ai.openai.api-key}")
	private String apikey;
	
	@GetMapping(value = "/test")
    public ResponseEntity<String> test() {
		var openaimanager = OpenAIRequest.getManager(apikey);
		String res = openaimanager.request("hi").getAnswerString();
		return ResponseEntity.ok(res);
    	
    }
}
