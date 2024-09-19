package part6;

public class exercise3_countId {
    public static void main(String[] args) {
        String id="69";
        String str="78, 60,62,68,69,69,73,85,66 ,69,65,74,63,67 ,65,64,68,73,75,69,73,169";
        String newStr=str.replaceAll("[\\s]","");
        String[] arrId=newStr.split(",");
        int countId=0;
        for(String c:arrId){
            if(c.equals(id)) countId++;
        }
        System.out.println(countId);
    }
}
