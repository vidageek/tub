package br.com.caelum.tubaina.parser;

import java.util.regex.Pattern;

public class RegexTag implements Tag {
	private String replacement;

	private Pattern regex;

	public RegexTag(String regex, String replacement) {
		this.regex = Pattern.compile(regex);
		this.replacement = replacement;
	}

	public String parse(String string, String empty) {
		return regex.matcher(string).replaceAll(replacement);
	}

	@Override
	public String toString() {
		return String.format("[regex %s %s]", regex, replacement);
	}
}
