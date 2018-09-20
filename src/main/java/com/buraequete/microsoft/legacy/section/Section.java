package com.buraequete.microsoft.legacy.section;

import com.buraequete.microsoft.legacy.action.Action;
import java.util.List;
import lombok.Data;

@Data
public class Section {

	private String title;
	private Boolean startGroup;
	private String activityTitle;
	private String activitySubtitle;
	private String activityImage;
	private String activityText;
	private String heroImage;
	private String text;
	private List<Fact> facts;
	private List<Image> images;
	private List<Action> potentialAction;
}