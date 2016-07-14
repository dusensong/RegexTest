package cn.dss.regextest;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatcherDemo {

//    private static final String REGEX = "\\bdog\\b";
//    private static final String INPUT = "dog dog dog doggie dogg";
    
    private static final String REGEX = "http://www.joyme.com/profile.*";
    private static final String INPUT = "http://www.joyme.com/profile/sync/qq/bind?rurl=http%3A%2F%2Fwww.joyme.com%2F";

    public static void main(String[] args) {
       Pattern p = Pattern.compile(REGEX);
       Matcher m = p.matcher(INPUT);   // 获得一个匹配器对象
       int count = 0;
       while(m.find()) {
           count++;
           System.out.println("Match number "+count);
           System.out.println("start(): "+m.start());
           System.out.println("end(): "+m.end());
       }
    }
}