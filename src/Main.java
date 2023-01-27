public class Main {
    public static void main(String[] args) {

        int firstNumber = 220;
        int secondNumber = 289;
        int firstTotal = 0;
        int secondTotal = 0;

        for(int i=1 ; i<firstNumber ; i++){
            if (firstNumber%i==0){
                firstTotal += i;
            }
        }
        for(int i=1 ; i<secondNumber ; i++){
            if (secondNumber%i==0){
                secondTotal += i;
            }
        }
        if((firstTotal==secondNumber)&&(secondTotal==firstNumber)){
            System.out.println(firstNumber + " ile " + secondNumber + " arkadas sayilardir");
        }
        else{
            System.out.println(firstNumber + " ile " + secondNumber + " arkadas sayi değillerdir.");
        }
    }
}