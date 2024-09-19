package Chapter2;

import java.text.DecimalFormat;

public class Ex4 {
    public static void main(String[] args) {
        int yourWeight = 84;
        int yourHeight = 178;
        double height = (double) yourHeight / 100;
        double BMI = (double) yourWeight / Math.pow(height, 2);

        DecimalFormat formatter = new DecimalFormat("#.#");
        String formattedBMI = formatter.format(BMI);

        String result = "";
        if (BMI < 18.5)
            result = " Thiếu cân";
        else if (BMI >= 18.5 && BMI < 25)
            result = " Bình thường";
        else if (BMI >= 25 && BMI < 30)
            result = " Thừa cân";
        else
            result = " Béo phì";
        System.out.println("BMI: " + formattedBMI + result);
    }
}
