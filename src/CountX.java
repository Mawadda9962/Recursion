public class CountX {
    public int countX(String str){
        if (str.length() == 0){
            return 0; //Base Case

        }
        char firstChar = str.charAt(0); //Checking the first character
        String remaining = str.substring(1); //Getting the remaining substring

        if (firstChar == 'x'){
            return  1 + countX(str.substring(1));

        }

    }

}
