package Practice;

public class arrayWhichIsDevisibleTo5 {
    public static void main(String[] args) {
        int numbers[] = new int[]{12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 150) {
                break;
            }
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }


        }
        }







