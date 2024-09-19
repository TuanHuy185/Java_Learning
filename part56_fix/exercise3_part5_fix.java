package part56_fix;

public class exercise3_part5_fix {
    public static void main(String[] args) {
        String str = "   ja  Va ";
        str=str.replaceAll("\\s", "");
        String result = "";
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char position = charArray[i];
            if (Character.isUpperCase(position)) {
                charArray[i] = Character.toLowerCase(position);
            } else if (Character.isLowerCase(position)) {
                charArray[i] = Character.toUpperCase(position);
            }
        }

        result = new String(charArray);
        System.out.println(result);
    }

}
