package Interpreter;

import java.util.regex.Pattern;

/**
 * @author DiiD
 */
public class Log {
    public static void log(String format, Object... args) {
        int len = format.length();
        int argIndex = 0;
        StringBuilder sb = new StringBuilder(len + 20);
        char last = '\0';
        for (int i = 0; i < len; i++) {
            char ch = format.charAt(i);
            if (ch == '}') {
                if (last == '{') {
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(args[argIndex]);
                    argIndex++;
                } else {
                    sb.append(ch);
                }
            } else {
                sb.append(ch);
            }
            last = ch;
        }
        System.out.println(sb.toString());
    }
}
