import java.util.*;

public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;

        for (int i = 1 ; i <= num; i++) {
            int sum = getSum(i);

            if (num == i + sum) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }

    public static int getSum(int num) {
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}