package Chapter2;

public class EX2 {
    public static void main(String[] args) {
        int height=5;
        String result="";
        for(int i=1;i<=height;i++){
            if(i%2==0) result+="=".repeat(i)+"\n";
            else result+="+".repeat(i)+"\n";
        }
        System.out.print(result);
    }
}
