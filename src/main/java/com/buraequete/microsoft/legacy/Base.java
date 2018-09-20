package com.buraequete.microsoft.legacy;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface Base {

	@JsonProperty("@type")
	String getType();
}
