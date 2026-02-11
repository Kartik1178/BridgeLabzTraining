class ReverseString{
    static String reverseString(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        String reversed=sb.toString();
        return reversed;
    }
public static void main(String[] args){
        System.out.println(reverseString("hello"));

}


}