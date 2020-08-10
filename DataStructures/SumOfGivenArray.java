package DataStructures;

public class SumOfGivenArray {
    public static void main(String[] args) {
        int nums[] = new int[]{20,30,10,40};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        System.out.println(sum);
    }
}
