package org.lanit.modelsJson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestJson {

	@JsonProperty("snils")
	private String snils;

	public void setSnils(String snils){
		this.snils = snils;
	}

	public String getSnils(){
		return snils;
	}
}