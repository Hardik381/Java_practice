public class CapitalizeFirstWord {
    public static void main(String args[]) {
        String str = "  hello   world my name is   khan  ";
        String[] newStr = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String s : newStr) {
            sb.append(Character.toUpperCase(s.charAt(0)));
            sb.append(s.substring(1));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
