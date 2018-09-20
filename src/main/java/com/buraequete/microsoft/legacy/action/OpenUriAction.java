package com.buraequete.microsoft.legacy.action;

import static lombok.AccessLevel.PRIVATE;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;
import lombok.Setter;

@Data
public class OpenUriAction implements Action {

	public static final String OPENURI_ACTION_TYPE = "OpenUri";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = OPENURI_ACTION_TYPE;

	private String name;
	private List<Target> targets;
}