package ra.th01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Giải phương trình bậc nhất.
        System.out.println("Giải phương trình bậc nhất: a*x + b = c");
        System.out.println("Hãy nhập vào giá trị a");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Hãy nhập vào giá trị b");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("Hãy nhập vào giá trị c");
        double c = new Scanner(System.in).nextDouble();

        if(a != 0){ // nếu a khác 0
            double x = (c-b)/a; // phương trình có nghiệm duy nhất
            System.out.println("Nghiệm duy nhất "+ x);
        }else { // a == 0
            if(b == c){
                System.out.println("Phương trình vô số nghiệm");
            }else { // b != c
                System.out.println("Phương tình vô nghiệm");
            }
        }
    }
}
