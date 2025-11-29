public class MyString {
    public static void main(String[] args) {


        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
     
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {

        String lowerstr = "";
        for (int i = 0; i < str.length(); i ++){

            char lower = str.charAt(i);
            if (lower >= 'A' && lower <= 'Z') {
                lowerstr += (char) (lower + 32);
            }
            else {
                lowerstr += str.charAt(i);
            }
        }
        return lowerstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {


        for (int i = 0; i <= str1.length() - str2.length(); i ++){
                  
            int counter1 = 0;
            int index = i;
            for (int j = 0; j < str2.length(); j ++){
          
                if (str1.charAt(index) != str2.charAt(j)){
                    break;
                }
                index ++;
                counter1 ++;
            }
           if (counter1 == str2.length()){
            return true;
           } 
        }

        return false;

    }

}
