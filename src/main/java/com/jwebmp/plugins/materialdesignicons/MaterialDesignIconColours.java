package com.jwebmp.plugins.materialdesignicons;

import com.jwebmp.core.base.interfaces.ICssClassName;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

public enum MaterialDesignIconColours
		implements ICssClassName
{
	Dark("md-light"),
	Light("md-dark"),
	;
	private String value;

	MaterialDesignIconColours(String value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "md-" + name().toLowerCase()
		                     .replace(CHAR_UNDERSCORE, CHAR_DASH)
		                     .replace("\\$", "");
	}
}
