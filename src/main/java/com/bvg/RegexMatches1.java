package com.bvg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches1 {

	
private static final String REGEX="foo";
private static final String INPUT="foooooooooooooooo";
private static Pattern pattern;
private static Matcher matcher;

public static void main(String[] args) {
	pattern=Pattern.compile(REGEX);
	setMatcher(pattern.matcher(INPUT));
	
	System.out.println("current REGEX is:"+REGEX);
	System.out.println("current INPUT is:"+INPUT);
	}

public static Matcher getMatcher() {
	return matcher;
}

public static void setMatcher(Matcher matcher) {
	RegexMatches1.matcher = matcher;
}

}
