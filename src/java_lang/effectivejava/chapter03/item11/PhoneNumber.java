package java_lang.effectivejava.chapter03.item11;

import java.util.Objects;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    private int hashCode; // 0로 초기화

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

    @Override
    public boolean equals(Object o){
        if (o == this)
            return false;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.areaCode == areaCode && pn.prefix == prefix;
    }

//    @Override
//    public int hashCode(){
//        int result = Short.hashCode(areaCode);
//        result = 31 * result + Short.hashCode(prefix);
//        result = 31 * result + Short.hashCode(lineNum);
//        return result;
//    }

//    @Override
//    public int hashCode(){
//        return Objects.hash(lineNum, prefix, areaCode);
//    }

    @Override
    public int hashCode(){
        int result = hashCode;
        if (result == 0) {
            result = Short.hashCode(areaCode);
            result = 31 * result + Short.hashCode(prefix);
            result = 31 * result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }

}
