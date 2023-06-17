package java_lang.effectivejava.chapter04.item22;

import static java_lang.effectivejava.chapter04.item22.PhysicalConstants.AVOGADROS_NUMBER;

public class Test {
    double atoms(double mols) {
        return AVOGADROS_NUMBER * mols;
    }
    // PhysicalConstants를 빈번히 사용한다면 정적 임포트가 값어치를 한다.
}
