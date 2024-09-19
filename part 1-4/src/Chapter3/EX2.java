package Chapter3;

public class EX2 {
    public static void main(String[] args) {
        int[] arrInt={1,2,4,8,0};
        int totalNum=0,totalChan=0,totalLe=0;
        for(int i=0;i<arrInt.length;i++){
            totalNum+=arrInt[i];
            if(i%2==0) totalChan+=arrInt[i];
            else totalLe+=arrInt[i];
        }
        System.out.println("Tổng phần tử: "+totalNum);
        System.out.println("Tổng phần chẵn: "+totalChan);
        System.out.println("Tổng phần lẻ: "+totalLe);

    }
}
