public class StrCount {
    public int strCount(String str, String sub){ //Creating a method

        if (str.length() < sub.length()){ //Base Case
            return 0;
        }
       if (str.substring(0,2) == sub){
           return 1 + strCount(str.substring(sub.length()),sub);
       }else {
           return strCount(str.substring(1),sub);
       }

    }
}
