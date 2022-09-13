import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicRegex {
    public boolean Bai1(String testRegex){
        Pattern pattern = Pattern.compile("(^pq)*");
        Matcher matcher = pattern.matcher(testRegex);
        return matcher.matches();
    }
    public boolean Bai2(String testRegex){
        Pattern pattern = Pattern.compile("([a-z]_|_[a-z]|[a-z])+");
        Matcher matcher = pattern.matcher(testRegex);
        return matcher.matches();
    }
    public boolean Bai3(String testRegex){
        Pattern pattern = Pattern.compile("(\\w_)+");
        Matcher matcher = pattern.matcher(testRegex);
        return matcher.matches();
    }
    public boolean Bai4(String testRegex){
        Pattern pattern = Pattern.compile("(^5\\w*)");
        Matcher matcher = pattern.matcher(testRegex);
        return matcher.matches();
    }
}
