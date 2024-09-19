package part7;

public class exercise1_pass_basic {
    public static void main(String[] args) {
        String str = "luutruonghailan";
        String key = "3633";
        String result = "";
        String[] arrName = new String[key.length()];
        int indexBegin=0;

        for(int i=0;i<key.length();i++){
            int length = Integer.parseInt(String.valueOf(key.charAt(i)));
            int indexEnd = indexBegin + length;
            String temp = str.substring(indexBegin, indexEnd);
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
