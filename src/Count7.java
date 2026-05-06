public class Count7 {
    public int count7(int n){ //Creating a method name
        if(n == 0){
            return 0;//Base Case
        }
        int lastDigit = n % 10; // Getting the last digit using
        int removeDigit = n / 10; //Removing the last digit

        if(lastDigit == 7){ //Check if the last digit is equal to 7
            return 1 + count7(n/10);
        }else{
            return 1 + count7(n/10);//
        }

    }
}
