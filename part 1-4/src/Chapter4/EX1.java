package Chapter4;

public class EX1 {
    public static void main(String[] args) {
        int height=5;
        String result="";
        for(int i=1;i<=height;i++){
            String shape=" ".repeat(height-i)+String.valueOf(i).repeat(i);
            result+=shape+"\n";
        }
        System.out.println(result);
    }
}
