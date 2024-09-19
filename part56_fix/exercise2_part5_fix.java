package part56_fix;

public class exercise2_part5_fix {
    public static void main(String[] args) {
        String strBuilderObj = "ab239JA2VAc1de";

        strBuilderObj = strBuilderObj.substring(0,1) + strBuilderObj.substring(2,strBuilderObj.length()-2)
                        +strBuilderObj.substring(strBuilderObj.length()-1);

        strBuilderObj = strBuilderObj.replaceAll("\\d", "");

        int lenStr=strBuilderObj.length();
        lenStr=(lenStr%2==0)?lenStr:lenStr+1;
        int middleIndex = lenStr / 2;
        strBuilderObj = strBuilderObj.substring(0, middleIndex) + "ZendVN.com" + strBuilderObj.substring(middleIndex);

        System.out.println(strBuilderObj);

    }
}
