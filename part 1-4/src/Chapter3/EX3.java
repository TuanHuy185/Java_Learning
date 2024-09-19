package Chapter3;

public class EX3 {
    public static void main(String[] args) {
        int[] arrInt = {0, 2, 3, 5, 6};
        int number = 4;
        boolean check = false;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == number) {
                check = true;
                break;
            }
        }
        if(check) System.out.println("Tồn tại");
        else System.out.println("Không tồn tại");
    }
}

