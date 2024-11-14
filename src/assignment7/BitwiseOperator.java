package assignment7;

public class BitwiseOperator {

    public static void main(String[] args) {
        int num1 = 12; // Binary: 1100
        int num2 = 10; // Binary: 1010

        // Bitwise AND operation
        int andResult = num1 & num2; // Binary: 1000 (Decimal: 8)
        System.out.println(num1 + " & " + num2 + " = " + andResult);

        // Bitwise OR operation
        int orResult = num1 | num2; // Binary: 1110 (Decimal: 14)
        System.out.println(num1 + " | " + num2 + " = " + orResult);

        // Bitwise XOR operation
        int xorResult = num1 ^ num2; // Binary: 0110 (Decimal: 6)
        System.out.println(num1 + " ^ " + num2 + " = " + xorResult);
    }
}
