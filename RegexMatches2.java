import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMatches2 {

    private static final String Regex = "cat";
    private static final String Inpur = "cat cat cat cattie cat";

    public static void main(String args[]){
        Pattern p = Pattern.compile(Regex);
        Matcher r = p.matcher(Inpur);
        int count = 0;

        while(r.find()){
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+r.start());
            System.out.println("end(): "+r.end());
        }
    }
}
