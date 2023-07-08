import java.util.*;

public class coinchanging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , i;
n=sc.nextInt();//no of coin of denominations
        int[] ar = new int[10];
        for (i = 0; i < n; i++)
          ar[i] = sc.nextInt();
        int target = sc.nextInt();
        int rem = 0, q = 0, sum = 0;
        while (target != 0) {
            if (ar[n - 1] <= target) {
                rem = target % ar[n - 1];
                q = target / ar[n - 1];
              //  System.out.println(q);
                sum += q;
                target = rem;
                n--;
            } else {
                n--;
            }
        }
        System.out.println(sum);
    }
}
