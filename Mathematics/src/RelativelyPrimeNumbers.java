import java.util.Scanner;

/****************************************************************
 * -----Relatively Prime Pairs------
 * You are given a set of all integers from l to r inclusive, l<r , (r−l+1)≤3⋅105 and (r−l) is always odd.
 *
 * You want to split these numbers into exactly (r−l+1)/2 pairs in such a way that for each pair (i,j) the greatest common divisor of i and j
 * is equal to 1. Each number should appear in exactly one of the pairs.
 * Print the resulting pairs or output that no solution exists.
 * If there are multiple solutions, print any of them.
 *
 * Date - 21 Feb 2024
 *
 */


public class RelativelyPrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long l = sc.nextLong();
        Long r = sc.nextLong();
        System.out.println("YES");
        for (Long i = l; i < r; i += 2)
            System.out.println(Long.toString(i) + ' ' +
                    Long.toString(i+1));
    }
}
