package Methods;

public class CheckIfItsEven {
    static void isEven (int num){
        boolean even;
        if (num % 2== 0){
            even = true;
            System.out.println(even);
        }else{
            even = false;
            System.out.println(even);
        }
    }

    public static void main(String[] args) {
        isEven(15);
    }
}
