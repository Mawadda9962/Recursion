public class BunnyEars2 {
    public int bunnyEars(int n){
        if (n == 0){ //Base Class
            return 0;
        }
        return 2 + bunnyEars(n-1); //recursive Base

    }

}
