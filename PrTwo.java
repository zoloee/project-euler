/**
 * Created by zoloe on 2017. 03. 08..
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class PrTwo {

    public int fibonacciRecursive(int n) {
//        System.out.println(n);
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
            }
        }
    }

    int sum = 0;
    int max = 4000000;
    int third;
    int second = 1;
    int first = 0;

    public void addEvenFibs(){
        while (third < max){
            if (third % 2 == 0){
                sum += third;
            }
            third = first + second;
            first = second;
            second = third;
        }
        System.out.println(sum);

    }


}
