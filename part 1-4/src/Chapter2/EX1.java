package Chapter2;

public class EX1 {
    public static void main(String[] args) {
        int height=5;
        String result="";
        for(int i=1;i<=5;i++){
            result+="+".repeat(i)+"\n";
        }
        System.out.print(result);
    }
}
