package Chapter3;

public class EX4 {
    public static void main(String[] args) {
        int[] arrInt={1,2,4,8,0};
        int number=0;
        boolean check=false;
        for(int i=0;i<arrInt.length-1;i++){
            if(arrInt[i]+arrInt[i+1]==number){
                check = true;
            break;
        }
    }
        if(check) System.out.println("Tồn tại");
        else System.out.println("Không tồn tại");
}
}
