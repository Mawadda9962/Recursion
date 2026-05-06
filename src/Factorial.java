public class Factorial {
    public static void main(String[] args){

    }

    public static int factorial(int n){
        if(n == 1){
            return 1; //base case
        }else {
            return factorial(n-1) * n; //Recursive Case
        }
    }
}
