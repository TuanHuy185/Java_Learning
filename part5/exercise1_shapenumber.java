package part5;

public class exercise1_shapenumber {
    public static void main(String[] args) {
        int height=5;
        String shape="";
        String result="";
        int countNumber=1;
        for (int i=1;i<=height;i++){
            String repeatNumber=String.valueOf(i).repeat(countNumber);
            countNumber+=2;
            shape="-".repeat(height-i)+repeatNumber+"-".repeat(height-i);
            result+=shape+"\n";
        }
        System.out.println(result);
    }
}
