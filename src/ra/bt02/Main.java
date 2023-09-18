package ra.bt02;

public class Main {
    public static void main(String[] args) {
//        Vẽ hình bằng sao
//        hình chữ nhật

//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 7; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }


//        hình tam giác

//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }



//        Hình tam giác ngược

        for (int i = 0; i < 5; i++){
            for (int j = 5; j > 0; j--){
                if(j > i){
                System.out.print("*");
                }
            }
            System.out.println();

        }

    }
}
