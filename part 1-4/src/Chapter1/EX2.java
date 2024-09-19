package Chapter1;

public class EX2 {
    public static void main(String[] args) {
        int num=-9;
        String str1="dương";
        String str2="lẻ";
        if(num<0) str1="âm";
        if(num % 2 == 0) str2="chẵn";
        System.out.println("nguyên "+str1+" "+str2);
    }
}
