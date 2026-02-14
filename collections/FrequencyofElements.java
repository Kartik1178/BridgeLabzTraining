import java.util.*
class FindFrequency{
    public static Map<String,Integer> findFrequency(List<String> list){
        Map<String,Int> hashMap=new HashMap<>();
        for(String item:list){
            if(hashMap.containsKey(item)) {
                hashMap.put(map.get(item) + 1);
            }
            else{
                hashMap.put(item,1);
            }
        }
return hashMap;


    }
    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = countFrequency(input);

        System.out.println(result);
    }


}