package part6;

import java.util.Arrays;

public class exercise4_maxTime {
    public static void main(String[] args) {
        String str="ProgramFiles/127/Java/12/bin/190/angular/50";
        String[] newStr=str.split("\\/");
        System.out.println(Arrays.toString(newStr));
        int max=Integer.parseInt(newStr[1]);
        String strName="";
        String strTime="";
        for(int i=1;i<newStr.length;){
            if(Integer.parseInt(newStr[i])>max) {
                max = Integer.parseInt(newStr[i]);
                strName=newStr[i-1];
                strTime=newStr[i];
            }
            i+=2;
        }
        System.out.println("Name: "+ strName);
        System.out.println("Name: "+ strTime);
    }
}
