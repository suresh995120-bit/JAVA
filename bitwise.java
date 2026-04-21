public class bitwise {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // Bitwise AND
        System.out.println("Bitwise AND (a & b): " + (a & b)); // Output: 1 (0001 in binary)

        // Bitwise OR
        System.out.println("Bitwise OR (a | b): " + (a | b)); // Output: 7 (0111 in binary)

        // Bitwise XOR
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b)); // Output: 6 (0110 in binary)

        // Bitwise NOT
        System.out.println("Bitwise NOT (~a): " + (~a)); // Output: -6 (in two's complement)
        // Bitwise Left Shift
        System.out.println("Bitwise Left Shift (a << 1): " + (a << 1)); // Output: 10 (1010 in binary)
        // Bitwise Right Shift
        System.out.println("Bitwise Right Shift (a >> 1): " + (a >> 1)); // Output: 2 (0010 in binary)

    }
}
