import java.util.Scanner;

class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println(
                "Add: " + (a + b) +
                        ", Sub: " + (a - b) +
                        ", Mul: " + (a * b) +
                        ", Div: " + (a / b)
        );
    }
}
