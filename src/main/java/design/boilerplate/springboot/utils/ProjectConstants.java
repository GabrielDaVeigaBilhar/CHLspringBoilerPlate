package design.boilerplate.springboot.utils;

import java.util.Locale;

public final class ProjectConstants {

	// FIXME : Customize project constants for your application.

	public static final String DEFAULT_ENCODING = "UTF-8";

	public static final String PROJECT_BASE_PACKAGE = "design.boilerplate.springboot";

	public static final Locale ENGLISH_LOCALE = new Locale.Builder().setLanguage("en").setRegion("US").build();

	private ProjectConstants() {

		throw new UnsupportedOperationException();
	}

}
