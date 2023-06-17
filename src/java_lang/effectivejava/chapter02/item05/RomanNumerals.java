package java_lang.effectivejava.chapter02.item05;

public class RomanNumerals {

//    private static final Pattern ROMAN = Pattern.compile(
//            "^(?=.)M*(C[MD]|D?C{0,3})"
//                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
//
//    static boolean isRomanNumeral(String s){
//        return ROMAN.matcher(s).matches();
//    }

    static boolean isRomanNumeral(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    public static void main(String[] args) {
        String s = "류준영";
        String r = "XL";

        System.out.println(isRomanNumeral(s));
        System.out.println(isRomanNumeral(r));
    }

    private static long sum() {
        Long sum = 0L;
        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;

        }
        return sum;
    }
}
