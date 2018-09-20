package com.buraequete.microsoft.legacy.action;

import static lombok.AccessLevel.PRIVATE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class HttpPostAction implements Action {

	public static final String HTTPPOST_ACTION_TYPE = "HttpPOST";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = HTTPPOST_ACTION_TYPE;

	private String name;
	private String target;
	private List<Header> headers;
	private String body;
	private BodyContentType bodyContentType;

	@AllArgsConstructor
	public enum BodyContentType {
		APPLICATION_JSON("application/json"), APPLICATION_FORM("application/x-www-form-urlencoded");

		@Getter(onMethod = @__({@JsonValue}))
		private String value;
	}
}