package com.buraequete.microsoft.legacy.action.input;

import static lombok.AccessLevel.PRIVATE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MultichoiceInput implements Input {

	public static final String MULTICHOICE_INPUT_TYPE = "MultichoiceInput";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = MULTICHOICE_INPUT_TYPE;

	private String id;
	private Boolean isRequired;
	private String title;
	private String value;
	private List<Choice> choices;
	private Boolean isMultiSelect;
	private Style style;

	@AllArgsConstructor
	public enum Style {
		NORMAL("normal"), EXPANDED("expanded");

		@Getter(onMethod = @__({@JsonValue}))
		private String value;
	}
}