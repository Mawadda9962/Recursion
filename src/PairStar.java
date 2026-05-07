public class PairStar {
    public String pairStar(String str){ //Creating a method
        if (str.length() == 0 || str.length() ==1){ //Base Case
            return str;
        }
         char firstChar = str.charAt(0);

        if (str.charAt(0) == str.charAt(1)){ //Checking the first char and next char
            return str.charAt(0) + "*" + str.charAt(1);
        }else{
            return
        }
    }
}
