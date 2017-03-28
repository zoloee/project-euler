//import java.util.Scanner;
//
///**
// * Created by zoloe on 2017. 03. 08..
// */
//public class StdinArray {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a;
//        int sum=0;
//        a = in.nextInt();
//        in.nextLine();
//        int[] array = new int[a];
//        Scanner numScanner = new Scanner(in.nextLine());
//        for (int i = 0; i < a; i++){
//            if (numScanner.hasNextInt()) {
//                array[i] = numScanner.nextInt();
//                sum += array[i];
//            } else {
//                System.out.println("You didn't provide enough numbers");
//                break;
//            }
//        }
//        System.out.println(sum);
//    }
//}
//
