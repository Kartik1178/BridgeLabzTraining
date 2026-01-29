import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int students = input.nextInt();
        System.out.println("Possible handshakes: " + (students * (students - 1) / 2.0));
    }
}
