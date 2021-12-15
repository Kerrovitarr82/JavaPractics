package Practic.src.ru.mirea.task24;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    private static String S;
    private static boolean bool;

    private static String IPADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        S = s.next();
        bool= validate(S);
        if(bool == true) {
            System.out.println("Строка является IP адресом");
        }
        else {
            System.out.println("Строка не является IP адресом");
        }
    }

    public static boolean validate( String ip){
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
