package com.buraequete.microsoft.legacy.action;

import static lombok.AccessLevel.PRIVATE;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Setter;

@Data
public class TransactionAction implements Action {

	public static final String TRANSACTION_ACTION_TYPE = "Transaction";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = TRANSACTION_ACTION_TYPE;

	private String name;
	private Boolean isPrimaryAction;
	private String merchantId;
	private String displayId;
	private Object productContext;
}