package ra.bt05;

public class Main {
    public static void main(String[] args) {
// Tìm số nguyên dương nhỏ nhất chia hết cho 5,7 và 11
        int number = 1;
        while (true){
            if(number % 5 == 0 && number % 7 == 0 && number % 11 == 0){
                System.out.println(number + " chia hết cho 5,7, và 11");
                break;
            }
            number ++;
        }
    }
}
