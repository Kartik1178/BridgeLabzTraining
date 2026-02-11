class ConcatenateStrings{
    static String concatenateStrings(String[] s){
        StringBuffer sb=new StringBuffer();
        for(String str:s){
            sb.append(str);
        }

        return sb.toString();
    }




}