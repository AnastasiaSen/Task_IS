public class Task2 {
    public static void Rot13(String str_in){
        System.out.println(str_in);
        String s = str_in;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'm') c += 13;
            else  if (c >= 'A' && c <= 'M') c += 13;
                else if (c >= 'n' && c <= 'z') c -= 13;
                    else if (c >= 'N' && c <= 'Z') c -= 13;
            System.out.print(c);
         }
         System.out.println();
    }
}
