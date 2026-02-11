import java.util.HashSet;
class RemoveDuplicates{
    static String removeDuplicates(String s){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> hs=new HashSet<>();
        for(char i:s.toCharArray()){
         if(!hs.contains(i)){
             hs.add(i);
             sb.append(i);

         }
        }
    return sb.toString();
    }
    public static void main(String[] args) {
        String result = removeDuplicates("programming");
        System.out.println(result);
    }



}