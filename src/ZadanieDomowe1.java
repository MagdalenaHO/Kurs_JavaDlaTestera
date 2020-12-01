public class ZadanieDomowe1 {
    public static void main(String[] args) {

        int firstNumber = 21;
        int secondNumber =22;
        int thirdNumber = 15;
        int forthNumber = 16;

        System.out.println((firstNumber+secondNumber)%2==0);        System.out.println((thirdNumber+forthNumber)%2==0);

        if ((firstNumber+secondNumber)%2==0 && (thirdNumber+forthNumber)%2==0){
            System.out.println("All numbers are even");
        }else {
            System.out.println("All numbers are odd");
        }
    }
}

