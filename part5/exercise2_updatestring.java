package part5;

import java.util.StringTokenizer;

public class exercise2_updatestring {
    public static void main(String[] args) {
        StringBuilder strBuilderObj= new StringBuilder("ab239JA2VAc1de");
            strBuilderObj.deleteCharAt(1).deleteCharAt(strBuilderObj.length()-2);
            for(int i=0;i<strBuilderObj.length();){
                if(Character.isDigit(strBuilderObj.charAt(i))){
                    strBuilderObj.deleteCharAt(i);
                }else i++;
            }
            int lenStr=strBuilderObj.length();
            lenStr=(lenStr%2==0)?lenStr:lenStr+1;
            strBuilderObj.insert(strBuilderObj.length()/2,"ZendVN.com");
            System.out.println(strBuilderObj);
    }
}
