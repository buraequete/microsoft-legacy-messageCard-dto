package com.buraequete.microsoft.legacy.action.input;

import com.buraequete.microsoft.legacy.Base;

public interface Input extends Base {

	String getId();
	Boolean getIsRequired();
	String getTitle();
	String getValue();
}