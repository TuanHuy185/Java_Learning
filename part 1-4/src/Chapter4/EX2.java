package Chapter4;

public class EX2 {
    public static void main(String[] args) {
        int height=5;
        String result="";
        String shape1="";
        for(int i=1;i<=height;i++){
            shape1+=i;
            String shape2=" ".repeat(height-i)+shape1;
            result+=shape2+"\n";
        }
        System.out.println(result);
    }
}
