package com.buraequete.microsoft.legacy.action.input;

import static lombok.AccessLevel.PRIVATE;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Setter;

@Data
public class DateInput implements Input {

	public static final String DATE_INPUT_TYPE = "DateInput";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = DATE_INPUT_TYPE;

	private String id;
	private Boolean isRequired;
	private String title;
	private String value;
	private Boolean includeTime;
}