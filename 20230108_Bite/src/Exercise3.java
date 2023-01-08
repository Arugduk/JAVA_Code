public class Exercise3 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum > i) {
                int sum1 = 0;
                for (int j = 1; j < sum; j++) {
                    if (sum % j == 0) {
                        sum1 += j;
                    }
                }
                if (sum1 == i)
                    System.out.println(i + " " + sum);
            }
        }
    }
}
