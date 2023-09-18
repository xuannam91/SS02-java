package ra.bt01;

import java.util.Scanner;

public class Main {
//    Tính tổng các số chẵn trong một khoảng số
public static void main(String[] args) {
    System.out.println("Nhập số bắt đầu ");
    int batdau = new Scanner(System.in).nextInt();
    System.out.println("Nhập số kết thúc ");
    int ketthuc = new Scanner(System.in).nextInt();
    int tong = 0;
    for (int i = batdau; i <= ketthuc; i++ ){
        if(i % 2 == 0){
            tong += i;
        }
    }
    System.out.println("Các số chẵn "+ tong);
}
}
