class Nested {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 15;

        if(A > B && A > C) {
            System.out.println("A is Greater");
        } else if(B > A && B > C) {
            System.out.println("B is Greater");
        } else {
            System.out.println("C is Greater");
        }
    }
}
