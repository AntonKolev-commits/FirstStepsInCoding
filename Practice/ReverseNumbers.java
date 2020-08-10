package Practice;

public class ReverseNumbers {
    public static void main(String[] args) {
        int num[] = new int[] { 10,20,30,50,70 };
        System.out.println("reversing an array:");
        for(int i = 0; i < num.length / 2; i++){
            int temp = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }}
