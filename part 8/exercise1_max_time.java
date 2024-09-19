package part8;

import java.util.Arrays;

public class exercise1_max_time {
    public static void main(String[] args) {
        String inputId="abw=java;def=android;nfv=php;";
        String inputTime="abw=20;nfv=140;def=90";
        String[] arrId=inputId.split("[=;]");
        String[] arrTime=inputTime.split("[=;]");
        String courseId="";
        String courseName="";
        String courseTime="";

        int maxTime=Integer.parseInt(arrTime[1]);
        int indexMaxTime=0;
        for(int i=3;i<arrTime.length;i+=2){
            if (Integer.parseInt(arrTime[i])>maxTime) {
                indexMaxTime=i;
                maxTime=Integer.parseInt(arrTime[i]);
            }
        }
        courseTime=arrTime[indexMaxTime];
        courseId=arrTime[indexMaxTime-1];

        for (int i=0;i<arrId.length;i+=2){
            if(courseId.equals(arrId[i])) {
                courseName=arrId[i+1];
                break;
            }
        }

        System.out.println(courseId + "-" + courseName + "-" + courseTime);
    }
}
