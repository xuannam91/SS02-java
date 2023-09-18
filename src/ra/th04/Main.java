package ra.th04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Tính chỉ số cân nặng cơ thể
        System.out.println("Hiển thị chỉ số BMI");
        System.out.println("Nhập chiều cao (m)");
        double chieucao = new Scanner(System.in).nextDouble();
        System.out.println("Nhập câ nặng (kg)");
        double kg = new Scanner(System.in).nextDouble();
        double bmi = kg/(chieucao * chieucao);
        if(bmi >= 30.0){
            System.out.println(" Bạn quá khổ");
        } else if (bmi >= 25.0) {
            System.out.println(" Bạn đang thừa cân");
        } else if (bmi >= 18.5) {
            System.out.println(" Bạn cân đối");
        }else {
            System.out.println(" Bạn quá gầy");
        }

    }
}
