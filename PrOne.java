/**
 * Created by zoloe on 2017. 03. 08..
 * https://projecteuler.net/problem=1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class PrOne {
    int sum = 0;
    int top = 999;

    public void createSum() {
        for (int i = top; i > 0; i--) {
            if ((i % 3 == 0 ) || (i % 5 == 0)){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public void createSum2() {
        sum = 0;
        top =1000;
        int byThree = 0;
        int byFive = 0;
        while ( byThree < top){
            if (!(byThree % 5 == 0)){
                sum = sum + byThree;
            }
            byThree = byThree+3;
        }
        while ( byFive < top){
            sum = sum + byFive;
            byFive = byFive + 5;
        }
        System.out.println(sum);
    }
}
