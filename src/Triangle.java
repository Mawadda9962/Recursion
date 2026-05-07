public class Triangle {
    public int triangle(int n){
        if(n == 0){
            return 0; //Base Case
        }
        return n + triangle(n-1); //recursive Case
    }
}
