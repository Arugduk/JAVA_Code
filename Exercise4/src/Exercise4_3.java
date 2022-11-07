public class Exercise4_3 {
    public static boolean isPrime(int x){
        for(int i=2;i<=Math.sqrt(x);i++)
            if(x%i==0&&x!=2)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("THE all twin primes less than 1000:");
        int count=0;
        for(int i=2;i<=998;i++){
            if(isPrime(i)&&isPrime(i+2)) {
                System.out.print("(" + i + "," + (i + 2) + ")  ");
                count++;
                if(count%6==0)
                System.out.print("\n");
            }
        }
    }
}
