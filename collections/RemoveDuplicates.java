class RemoveDuplicate{
    static <T> List<T>  removeDuplicates(List<T> list){
        List<T> res=new ArrayList<>();
        for(T item:list){
            if(!res.contains(item)){
                res.add(item);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(input);
        System.out.println(result);
    }



}