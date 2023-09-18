package ra.bt03_04;

public class Main {
    public static void main(String[] args) {
//        hiển thị các số nguyên tố nhỏ hơn 100
//        for (int i = 1; i <= 100; i++){
//            if(checkSnt(i)){
//                System.out.println("Các số nguyên tố " + i);
//            }
//        }

//        Hiển thị 20 số nguyên tố đầu tiên
        int snt = 0;
        int count = 1;
        while (count <= 20){
            if(checkSnt(snt)){
                System.out.println("Số nguyên tố " + count + " " + snt);
                count ++;
            }
            snt ++;
        }
    }

    public static boolean checkSnt(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;

    }
};
