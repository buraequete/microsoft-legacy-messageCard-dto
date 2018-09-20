package com.buraequete.microsoft.legacy.action;

import static lombok.AccessLevel.PRIVATE;

import com.buraequete.microsoft.legacy.action.input.Input;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;
import lombok.Setter;

@Data
public class ActionCardAction implements Action {

	public static final String ACTIONCARD_ACTION_TYPE = "ActionCard";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = ACTIONCARD_ACTION_TYPE;

	private String name;
	private List<Input> inputs;
	private List<Action> actions;
}