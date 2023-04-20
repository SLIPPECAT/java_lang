package java_lang.java_standard_procedure.Ex11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16_HashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
//        map.put("myId", "1234");
//        System.out.println(map);
        map.put("asdf", "1111");
//        System.out.println(map);
//        map.put("asdf", "1234");;  // OK. 이미 존재하는 키 추가가능. 기존 값은 없어짐
//        System.out.println(map);

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("id와 password를 입력하세요.");
            System.out.println("id: ");;
            String id = s.nextLine().trim();

            System.out.println("password: ");;
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다.");
                continue;
            }if(!map.containsValue(password)){
                System.out.println("입력하신 password는 존재하지 않습니다.");
            }else{
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
