public class ChangePi {
    public String changePi(String str){
        if (str.length() == 0){ //base Case
            return "";
        }


        if (str.startsWith("pi")){ //Checking if the string starts with "pi"
            return "3.14" +changePi(str.substring(2));
        }else{
            str.charAt(0);
        }

    }

}
