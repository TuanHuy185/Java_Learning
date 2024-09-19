package Chapter4;

import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        sc.nextLine();
        sc.close();
        int language=number/10;
        int day=number%10;
        String result="";
        String[] dayVietNam = {"Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy", "Chủ Nhật"};
        String[] dayAmerica = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (language == 1 && day >= 2 && day <= 8) {
            result = dayVietNam[day - 2];
        } else if (language == 2 && day >= 2 && day <= 8) {
            result = dayAmerica[day - 2];
        } else {
            result = "Không giải mã được";
        }
        System.out.println(result);
    }
}
