package java_lang.java_standard_procedure.Ex12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate=@DateTime(yymmdd="230309", hhmmss="112233"))
public class EX12_8_Annotation {
    public static void main(String[] args) {
        Class<EX12_8_Annotation> cls = EX12_8_Annotation.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println(anno.testedBy());
        System.out.println(anno.testDate().yymmdd());
        System.out.println(anno.testDate().hhmmss());

        for(String str : anno.testTools())
            System.out.println("testTools="+str);

        System.out.println();

        Annotation[] Arr = cls.getAnnotations();

        for (Annotation a : Arr)
            System.out.println(a);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo{
    int count() default 1;
    String testedBy();
    String[] testTools() default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime{
    String yymmdd();
    String hhmmss();
}

enum TestType { FIRST, FINAL}