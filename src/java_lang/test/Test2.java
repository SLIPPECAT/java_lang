package java_lang.test;

class Test2 {
    private static void swap(Integer a, Integer b){
        Integer temp = a;
        System.out.println(a);
        System.out.println(b);
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        System.out.println("a => " + a);
        System.out.println("b => " + b);

        swap(a, b);

        System.out.println("---------swap---------");

        System.out.println("a => " + a);
        System.out.println("b => " + b);
    }
}
