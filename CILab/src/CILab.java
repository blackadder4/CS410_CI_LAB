public class CILab implements CILabInterface {
    private String myString;
    private char[] char_arr;
    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {

        myString = string;
        char_arr = myString.toCharArray();
    }

    //get all caps
    private  boolean all_caps(){
        boolean ret = true;
        for(int I = 0; I < char_arr.length; I++){
            if(!Character.isUpperCase(char_arr[I])){
                ret = false;  // if character is not upper case then you ret false;
            }
        }
        return ret;
    }
    private boolean no_caps(){
        boolean ret = true;
        for(int I = 0; I < char_arr.length; I++){
            if(!Character.isLowerCase(char_arr[I])){
                ret = false;  // if character is not upper case then you ret false;
            }
        }
        return ret;
    }
    private boolean first_cap(){
        boolean ret = false;
        if(Character.isUpperCase(char_arr[0])){
            ret = true;
        }
        if((char_arr.length > 1)){
            // if first is indeed cap, run a check on a sub array
            for(int I = 1; I < char_arr.length; I++){
                if(Character.isUpperCase(char_arr[I])){
                    ret = false;  // if character is not upper case then you ret false;
                }
            }
        }
        return ret;
    }
    @Override
    public boolean detectCapitalUse() {
        if(myString.length() == 0){
            return false;
        }
        if(all_caps() || no_caps() || first_cap()){
            return true;
        }
        return false;
    }

}

