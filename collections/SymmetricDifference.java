import java.util.*;
class SymmetricDifference{
    public static <T> Set<T> findSymmetricDifference(Set<T>set1,Set<T>set2){
        Set<T> union=new HashSet<>(set1);
        union.addAll(set2);
        Set<T> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        union.removeAll(intersection);
        return union;
    }
public static void main(String[] args){
        Set set1=new HashSet<>(Arrays.asList(1,2,3,4));
    Set set2=new HashSet<>(Arrays.asList(4,6,5));
    System.out.println(findSymmetricDifference(set1,set2));

}

}