package part5;

public class exercise4_fileinfo {
    public static void main(String[] args) {
        String str="C:/Program Files/Java/jdk-21/bin/java.exe";
        String[] newStr= str.split("/");
        String NameAndExtense=newStr[newStr.length-1];
        String[] result=NameAndExtense.split("\\.");
        System.out.println("Name: "+result[0]);
        System.out.println("Extension: "+result[1]);
    }
}
