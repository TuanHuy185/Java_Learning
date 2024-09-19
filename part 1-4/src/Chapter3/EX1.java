package Chapter3;

public class EX1 {
    public static void main(String[] args) {
        int height=5;
        String result="";
        for(int i=1;i<=height;i++){
            String shape="";
            if(i%2==0) shape=i+"+".repeat(i);
            else shape=i+"-".repeat(i);
            result+= shape+"\n";
        }
        System.out.print(result);
    }
}
