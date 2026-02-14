class UnionAndIntersection{
    static <T> Set<T> findUnion(Set<T> set1, Set<T> set2){
        Set<T> union=newHashSet<>(set1);
        union.addAll(set2);
        return union;
    }
static <T> Set<T> findInntersection(Set<T>set1,Set<T>set2){
        Set<T> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;

}

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> union = findUnion(set1, set2);
        Set<Integer> intersection = findIntersection(set1, set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }


}