package Chapter1;

public class Ex4 {
    public static void main(String[] args) {
        int totalLine=50;
        int timeDoing=4;
        int expense;
        if(totalLine<10) expense=1;
        else if(totalLine>10 && totalLine<20) expense=2;
        else expense=5;
        System.out.println(timeDoing*20-expense + "$");
    }
}
