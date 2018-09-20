package com.buraequete.microsoft.legacy.action.input;

import static lombok.AccessLevel.PRIVATE;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Setter;

@Data
public class TextInput implements Input {

	public static final String TEXT_INPUT_TYPE = "TextInput";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = TEXT_INPUT_TYPE;

	private String id;
	private Boolean isRequired;
	private String title;
	private String value;
	private Boolean isMultiline;
	private Integer maxLength;
}