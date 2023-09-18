package ra.bt06_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tạo menu chức năng
        Scanner sc =  new Scanner(System.in);
        int choice;

        do {
            System.out.println("Hãy lựa chọn choice:");
            System.out.println("1: kiểm tra chẵn lẻ");
            System.out.println("2: kiểm tra số nguyên tố");
            System.out.println("3: kiểm tra một số có chia hết cho 3 không?");
            System.out.println("4: Tính chu vi và diện tích hình chữ nhật ");
            System.out.println("5: Tính chu vi và diện tích hình tam giác");
            System.out.println("6: Tính chu vi và diện tích hình tròn.");
            System.out.println("7: Chương trình thoát");

            choice = sc.nextInt();
            switch (choice){
                case 1: // kiểm tra chẵn lẻ của một số
                    System.out.println("Hãy nhập số cần kiểm tra chẵn lẻ");
                    int number1 = sc.nextInt();
                    if(number1 % 2 == 0){
                        System.out.println(number1 + " là số chẵn");
                    }else {
                        System.out.println(number1 + " là số lẻ");
                    }
                    break;
                case 2: // kiểm tra số nguyên tố
                    System.out.println("Hãy nhập số cần kiểm tra số nguyên tố");
                    int number2 = sc.nextInt();
                    if(number2 == 0){
                        System.out.println(number2 + " không phải là số nguyên tố");
                    }
                    if(number2 == 1){
                        System.out.println(number2 + " không phải là số nguyên tố");
                    }

                    for (int i = 2; i < Math.sqrt(number2); i++){
                        if(number2 % 2 == 0){
                            System.out.println(number2 + " không phải là số nguyên tố");
                        }else {
                            System.out.println(number2 + " là số nguyên tố");
                        }
                    }
                    break;
                case 3: // kiểm tra một số có chia hết cho 3 không?
                    System.out.println("Hãy nhập số cần kiểm tra chia hết cho 3");
                    int number3 = sc.nextInt();
                    if(number3 % 3 == 0){
                        System.out.println(number3 + " có chia hết cho 3");
                    }else {
                        System.out.println(number3 + " không chia hết cho 3");
                    }
                    break;
                case 4: // Tính chu vi và diện tích hình chữ nhật.
                    System.out.println("Tính chu vi và diện tích hình chữ nhật");
                    System.out.println("nhập chiều dài");
                    int chieuDai = sc.nextInt();
                    System.out.println("nhập chiều rộng");
                    int chieuRong = sc.nextInt();
                    int chuVi = (chieuDai + chieuRong)*2;
                    System.out.println("chu vi hình chữ nhật là: " + chuVi);
                    int dienTich = chieuDai * chieuRong;
                    System.out.println("Diện tích hình chữ nhật là: " + dienTich);
                    break;
                case 5: //Tính chu vi và diện tích hình tam giác.
                    System.out.println("Tính chu vi và diện tích hình tam giác");
                    System.out.println("nhập cạnh a");
                    int canhA = sc.nextInt();
                    System.out.println("nhập cạnh b");
                    int canhB = sc.nextInt();
                    System.out.println("nhập cạnh c");
                    int canhC = sc.nextInt();
                    int chuViTamGiac = canhA + canhB + canhC;
                    System.out.println("Chu vi hình tam giác đó: " + chuViTamGiac);
                    int nuaChuVi = chuViTamGiac/2;
                    double dienTichTamGiac = Math.sqrt(nuaChuVi *(nuaChuVi- canhA)*(nuaChuVi- canhB)*(nuaChuVi- canhC));
                    System.out.println("Diện tích hình tam giác đó: " + dienTichTamGiac);
                    break;
                case 6: // Tính chu vi và diện tích hình tròn.
                    System.out.println("Tính chu vi và diện tích hình tròn");
                    System.out.println("Nhập bán kính của hình tròn");
                    final double PI = 3.14;
                    int banKinh = sc.nextInt();
                    double chuViHinhTron = (banKinh*2) * PI;
                    System.out.println("Chu vi hình tròn " + chuViHinhTron);
                    double dienTichHinhTron = (banKinh * banKinh) * PI;
                    System.out.println("Diện tích hình tròn " + dienTichHinhTron);
                    break;
                case 7:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("nhập không đúng hợp lệ, yêu cầu nhập lại");

            }

        }while (choice != 7);

    }
}
