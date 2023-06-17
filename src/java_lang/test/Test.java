package java_lang.test;

class Test {
    private static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a => " + a);
        System.out.println("b => " + b);

        swap(a, b);
        a = 2;
        b = 1;
        System.out.println("---------swap---------");

        System.out.println("a => " + a);
        System.out.println("b => " + b);
    }
}
