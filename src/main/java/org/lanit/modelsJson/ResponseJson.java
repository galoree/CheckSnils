package org.lanit.modelsJson;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"message", "snils"})
public class ResponseJson {

	@JsonProperty("message")
	private String message;

	@JsonProperty("snils")
	private String snils;

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setSnils(String snils){
		this.snils = snils;
	}

	public String getSnils(){
		return snils;
	}
}