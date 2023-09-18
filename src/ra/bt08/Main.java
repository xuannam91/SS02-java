package ra.bt08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Xác thực dữ liệu sử dụng vòng lặp.
        while (true){
            System.out.println("Nhập cạnh A");
            int a = sc.nextInt();
            System.out.println("Nhập cạnh B");
            int b = sc.nextInt();
            System.out.println("Nhập cạnh C");
            int c = sc.nextInt();
            if(a > 0 && b > 0 && c > 0 && a+b >c && a+c > b && b+c >a){
                int chuViTamGiac = a + b + c;
                System.out.println("Chu vi hình tam giác đó: " + chuViTamGiac);
                int nuaChuVi = chuViTamGiac/2;
                double dienTichTamGiac = Math.sqrt(nuaChuVi *(nuaChuVi- a)*(nuaChuVi- b)*(nuaChuVi- c));
                System.out.println("Diện tích hình tam giác đó: " + dienTichTamGiac);
                break;

            }else {
                System.out.println("Vui lòng nhập lại");
            }

        }
    }
}
