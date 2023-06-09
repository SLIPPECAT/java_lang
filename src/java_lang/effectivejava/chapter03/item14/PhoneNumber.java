package java_lang.effectivejava.chapter03.item14;

import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum){
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 999, "가입자 번호");
    }

    private static short rangeCheck(int val, int max, String arg){
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }
//    10% 성능 저하
//    public int compareTo(PhoneNumber pn) {
//        int result = Short.compare(areaCode, pn.areaCode);
//        if (result == 0) {
//            result = Short.compare(prefix, pn.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, pn.lineNum);
//        }
//        return result;
//    }

    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparing(pn -> pn.prefix)
                    .thenComparing(pn -> pn.lineNum);

    public int compareTo(PhoneNumber pn){
        return COMPARATOR.compare(this, pn);
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return false;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.areaCode == areaCode && pn.prefix == prefix;
    }

}
