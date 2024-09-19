package part6;

public class exercise2_removechar {
    public static void main(String[] args) {
        String str="ab@#AB69C!}+21";
        System.out.println("Input: "+str);
        String strNumber=str.replaceAll("\\D","");
        String strCharacter=str.replaceAll("[\\W\\d]","");
        String strSpecial=str.replaceAll("\\w","");
        System.out.println("Chuỗi số: "+strNumber);
        System.out.println("Chuỗi chữ: "+strCharacter);
        System.out.println("Chuỗi đặc biệt: "+strSpecial);
    }
}
