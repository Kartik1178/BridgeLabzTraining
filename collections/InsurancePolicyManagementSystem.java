import java.util.LocalDate;
import java.util.*;

class Policy{
   private int policyId;
   private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premiumAmount;
    public Policy(String policyNumber, String policyholderName,
                  LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyholderName() { return policyholderName; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if (!(obj instanceof Policy)) {
        return false;

        }
        Policy other=(Policy)obj;
        return policyNumber.equals(obj.policyNumber);
        }
        public int hashCode{
        return policyNumber.hashCode();
    }
    public String toString() {
        return "Policy{" +
                "Number='" + policyNumber + '\'' +
                ", Name='" + policyholderName + '\'' +
                ", Expiry=" + expiryDate +
                ", Coverage='" + coverageType + '\'' +
                ", Premium=" + premiumAmount +

    }
}

class ExpiryDateComparator implements Comparator<Policy>{
  public int compare(Policy p1,Policy p2){
      int cmp = p1.getExpiryDate().compareTo(p2.getExpiryDate());
      if (cmp == 0) {
          return p1.getPolicyNumber().compareTo(p2.getPolicyNumber());
      }
      return cmp;
  }
}