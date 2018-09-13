import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexLookat {
    private static final String Regex = "foo";
    private static final String Input = "foofoofoo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String args[]){
        pattern = Pattern.compile(Regex);
        matcher = pattern.matcher(Input);

        System.out.println("Current REGEX is: "+Regex);
        System.out.println("Current INPUT is: "+Input);

        System.out.println("lookingAt(): "+matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());




    }
}
