package com.buraequete.microsoft.legacy.action;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class Target {

	private OperatingSystem os;
	private String uri;

	@AllArgsConstructor
	public enum OperatingSystem {
		DEFAULT("default"), WINDOWS("windows"), IOS("iOS"), ANDROID("android");

		@Getter(onMethod = @__({@JsonValue}))
		private String value;
	}
}