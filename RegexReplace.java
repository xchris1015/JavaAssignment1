import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexReplace {
    private static String Regex="dog";
    private static String Input="The dog says meow. " + "All dogs say meow.";
    private static String Replace="cat";

    public static void main(String[] args){
        System.out.println(Input);
        Pattern p = Pattern.compile(Regex);

        Matcher m = p.matcher(Input);
        Input= m.replaceAll(Replace);
        System.out.println(Input);
    }
}
