package part6;

public class exercise1_shapenumber {
    public static void main(String[] args) {
        int height=5;
        String shape="";
        String result="";
        String repeatNumberLeft="";
        String repeatNumberRight="";
        for (int i=1;i<=height;i++){
            String repeatNumber=repeatNumberLeft+String.valueOf(i)+repeatNumberRight;
            repeatNumberLeft+=String.valueOf(i);
            repeatNumberRight=String.valueOf(i)+repeatNumberRight;
            shape="-".repeat(height-i)+repeatNumber+"-".repeat(height-i);
            result+=shape+"\n";
        }
        System.out.println(result);
    }
}
