package part7;

public class excercise2_pass_adv {
    public static void main(String[] args) {
        String input = "2c+)1o!@(*&!y@&chi&^c!@#o3co$23%%^nd$#$!uo5ng";
        String inputNoSpecial = input.replaceAll("\\W","");
        String inputNumber = inputNoSpecial.replaceAll("\\D","");
        String inputChar = inputNoSpecial.replaceAll("\\d","");
        String result = "";
        String[] arrName = new String[inputNumber.length()];
        int indexBegin = 0;

        for(int i=0;i<inputNumber.length();i++){
            int length = Integer.parseInt(String.valueOf(inputNumber.charAt(i)));
            int indexEnd = indexBegin + length;
            String temp = inputChar.substring(indexBegin, indexEnd);
            temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
            arrName[i] = temp;
            indexBegin = indexEnd;
        }

        for (int i=0;i<arrName.length;i++){
            result+=arrName[i]+" ";
        }

        System.out.println(result);
    }
}
