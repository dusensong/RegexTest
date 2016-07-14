package cn.dss.regextest;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchesLooking {

//    private static final String REGEX = "foo";
//    private static final String INPUT = "fooooooooooooooooo";
    private static final String REGEX = "http://www.joyme.com/profile.*";
    private static final String INPUT = "http://www.joyme.com/profile/sync/qq/bind?rurl=http%3A%2F%2Fwww.joyme.com%2F";

    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
   
        // 初始化
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT);

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());
    }
}