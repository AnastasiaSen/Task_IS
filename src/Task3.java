import java.util.*;

public class Task3 {
    public static long hexToDecConvert(String input){
        String[] hexDigits = {"0", "1", "2", "3","4","5","6","7","8","9","A","B","C","D","E","F"};
        List<String> hexDigitsList = Arrays.asList(hexDigits);
        input = input.toUpperCase();
        int res = 0;

        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int dig = hexDigitsList.indexOf(String.valueOf(c));
            res = res*16 +dig;
        }
        return res;
    }
}
