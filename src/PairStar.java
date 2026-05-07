public class PairStar {
    public String pairStar(String str){ //Creating a method
        if (str.length() == 0 || str.length() ==1){ //Base Case
            return str;
        }
         char firstChar = str.charAt(0);
         char nextChar = str.charAt(1);

        if (firstChar == nextChar){ //Checking the first char and next char
            return firstChar + "*" + nextChar;
        }else{
            return firstChar + pairStar(str);
        }
    }
}
