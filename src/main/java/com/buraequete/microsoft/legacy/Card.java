package com.buraequete.microsoft.legacy;

import static lombok.AccessLevel.PRIVATE;

import com.buraequete.microsoft.legacy.action.Action;
import com.buraequete.microsoft.legacy.section.Section;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;
import lombok.Setter;

@Data
public class Card {

	public static final String CARD_TYPE = "MessageCard";
	public static final String CARD_CONTEXT = "http://schema.org/extensions";

	@Setter(PRIVATE)
	@JsonProperty("@type")
	private String type = CARD_TYPE;

	@Setter(PRIVATE)
	@JsonProperty("@context")
	private String context = CARD_CONTEXT;

	private String correlationId;
	private List<String> expectedActors;
	private String originator;
	private String summary;
	private String themeColor;
	private Boolean hideOriginalBody;
	private String title;
	private String text;

	private List<Section> sections;
	private List<Action> potentialAction;
}
