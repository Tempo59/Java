class Test {
    public static void main(String[] args) {
        int a = 3, b = 4;
        int result = (++a)/3+(b--)*2-(a--)%6+(b++)*3-(b--);
        System.out.println("result=" + result + ", a=" + a + ", b=" + b);

    }
}
