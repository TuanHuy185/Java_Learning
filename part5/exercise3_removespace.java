package part5;

public class exercise3_removespace {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("   ja  Va ");
        for (int i = 0; i < str.length(); ) {
            char position = str.charAt(i);
            if (Character.isSpaceChar(position)) {
                str.deleteCharAt(i);
            } else {
                if (Character.isUpperCase(position)) {
                    str.setCharAt(i, Character.toLowerCase(position));
                } else if (Character.isLowerCase(position)) {
                    str.setCharAt(i, Character.toUpperCase(position));
                }
                i++;
            }
        }
        System.out.println(str);
    }
}
