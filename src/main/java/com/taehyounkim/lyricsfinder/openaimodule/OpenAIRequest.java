package com.taehyounkim.lyricsfinder.openaimodule;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.ai.openai.api.OpenAiApi;

public class OpenAIRequest {
	private static OpenAIRequest manager = null;
	private OpenAiApi api;
	private OpenAiChatOptions option;
	private OpenAiChatClient client;
	private String answer;
	public OpenAIRequest(String apiKey) {
		if (manager != null) {
			return;
		}
		api = new OpenAiApi(apiKey);
		option = OpenAiChatOptions.builder().withModel("gpt-3.5-turbo")
				.withTemperature(0.4f)
				.withMaxTokens(200)
				.build();
		client = new OpenAiChatClient(api, option);
	}
	public static OpenAIRequest getManager(String apiKey) {
		if (manager != null) return manager;
		else {
			manager = new OpenAIRequest(apiKey);
			return manager;
		}
	}
	
	public OpenAIRequest request(String question) {
		
		ChatResponse response = client.call(new Prompt(question));
		answer = response.getResults().toString();
		return this;
	}
	public String getAnswerString() {
		return answer;
	}
}
