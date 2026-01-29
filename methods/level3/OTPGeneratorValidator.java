package Level3;

/*
 * Generates OTPs and verifies
 * their uniqueness.
 */
public class OTPGeneratorValidator {

    // Generates OTPs
    static int[] generateOTP() {
        int[] otp = new int[10];
        for (int i = 0; i < otp.length; i++)
            otp[i] = 100000 + (int)(Math.random() * 900000);
        return otp;
    }

    // Verifies OTP uniqueness
    static boolean verifyOTP(int[] otp) {
        for (int i = 0; i < otp.length; i++)
            for (int j = i + 1; j < otp.length; j++)
                if (otp[i] == otp[j]) return false;
        return true;
    }

    // Program entry point
    public static void main(String[] args) {
        int[] otp = generateOTP();
        System.out.println("OTPs unique: " + verifyOTP(otp));
    }
}
