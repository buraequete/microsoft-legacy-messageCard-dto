package com.buraequete.microsoft.legacy.action;

import static lombok.AccessLevel.PRIVATE;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Setter;

@Data
public class InvokeAddInCommandAction implements Action {

	public static final String INVOKEADDINCOMMAND_ACTION_TYPE = "InvokeAddInCommand";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = INVOKEADDINCOMMAND_ACTION_TYPE;

	private String name;
	private String addInId;
	private String desktopCommandId;
	private Object initializationContext;
}