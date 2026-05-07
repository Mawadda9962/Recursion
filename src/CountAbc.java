public class CountAbc {
    public int countAbc(String str){ //Creating a new method

        if (str.length() < 0){ //Base Case
            return 0;
        }
        String first3 = str.substring(0 ,3); //Checking if the first 3 characters form "abc"
        int count = 0;

        if (first3.equals("abc") || first3.equals("aba")) {
            count++;



        }




    }

}
