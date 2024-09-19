package Chapter4;

import java.util.Arrays;

public class EX3 {
    public static void main(String[] args) {
        String[] arrString={"Zend 2","PHP","Java","Javascript"};
        int[] arrInt = new int[arrString.length];
        for (int i=0;i<arrString.length;i++){
            arrInt[i]=arrString[i].length();
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
