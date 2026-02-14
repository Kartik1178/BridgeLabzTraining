import java.util.*;
class CheckSets{
    public static <T>  boolean checkSets(Set<T>set1,Set<T>set2){
        if(set1.equals(set2)){
            return true;
        }
        return false;

    }
public static void main(String[]args){
        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3));

    Set<Integer> set2=new HashSet<>(Arrays.asList(1,2,3));
    System.out.println(checkSets(set1,set2));
    }

}