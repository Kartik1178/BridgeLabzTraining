import java.time.LocalDate;
import java.util.*;

/*
 * InsurancePolicySystem
 * Manages policies using HashMap, LinkedHashMap and TreeMap (sorted by expiry).
 */
class InsurancePolicySystem {

    static class Policy {
        String number, holder;
        LocalDate expiry;
        Policy(String n,String h,LocalDate e){number=n;holder=h;expiry=e;}
        public String toString(){return number+"-"+holder+"-"+expiry;}
    }

    HashMap<String,Policy> hashMap = new HashMap<>();
    LinkedHashMap<String,Policy> linkedMap = new LinkedHashMap<>();
    TreeMap<LocalDate,Policy> treeMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy p){
        hashMap.put(p.number,p);
        linkedMap.put(p.number,p);
        treeMap.put(p.expiry,p);
    }

    // Retrieve by number
    public Policy getPolicy(String num){
        return hashMap.get(num);
    }

    // Policies expiring in 30 days
    public List<Policy> expiringSoon(){
        List<Policy> list=new ArrayList<>();
        LocalDate now=LocalDate.now();
        for(Policy p:hashMap.values()){
            if(!p.expiry.isBefore(now) && p.expiry.isBefore(now.plusDays(30)))
                list.add(p);
        }
        return list;
    }

    // Policies by holder
    public List<Policy> byHolder(String holder){
        List<Policy> list=new ArrayList<>();
        for(Policy p:hashMap.values()){
            if(p.holder.equals(holder)) list.add(p);
        }
        return list;
    }

    // Remove expired policies
    public void removeExpired(){
        LocalDate now=LocalDate.now();
        hashMap.values().removeIf(p->p.expiry.isBefore(now));
    }

    // Main method
    public static void main(String[] args) {
        InsurancePolicySystem sys=new InsurancePolicySystem();
        sys.addPolicy(new Policy("P1","Alice",LocalDate.now().plusDays(10)));
        sys.addPolicy(new Policy("P2","Bob",LocalDate.now().plusDays(40)));
        System.out.println(sys.expiringSoon());
    }
}