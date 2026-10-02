public class ConVoDigSpa {
    public static void main(String args[]) {
        int consonants = 0;
        int vowels = 0;
        int space = 0;
        int digits = 0;
        String str = "My Name is Hardik Pandey 440022";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                space++;
            } else if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(space);
        System.out.println(digits);
    }

}
