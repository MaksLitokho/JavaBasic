class HW01 {
    public static void main(String[] args) {
        // task 1
        int a = 14;
        int b = 6;
		int c = (a + b) * 2;
		int d = a * b;
		System.out.println("Perimeter = " + c);
		System.out.println("Area = " + d);
        
        // 2
        a = 7;
        b = 5;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %f\n", a, b, (float)a / b);
    }
}