public class CountAbc {
    public int countAbc(String str){ //Creating a new method

        if (str.length() < 3){ //Base Case
            return 0;
        }
        String first3 = str.substring(0 ,3);
        String firstC3 = str.substring(0, 3);//Checking if the first 3 characters form "abc"

        if (first3.equals("abc") || firstC3.equals("aba")) {
            return 1 + countAbc(str.substring(1)); //Match found, count it and recurse

        }else {
            return countAbc(str.substring(1)); //No match, just recurse
        }

    }

}
