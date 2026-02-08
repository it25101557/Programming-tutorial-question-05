class Calculator {

    int add(int x, int y) {
        return x + y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        int a = c.multiply(3, 4);
        int b = c.multiply(5, 7);
        int r1 = c.square(c.add(a, b));

        int r2 = c.square(c.add(4, 7)) + c.square(c.add(8, 3));

        System.out.println(r1);
        System.out.println(r2);
    }
}
