package java_lang.effectivejava.chapter03.item13;

import java.util.Map;

public class HashTable implements Cloneable {
        private Map.Entry[] buckets;

        private static class Entry {
            final Object key;
            Object value;
            Entry next;

            Entry(Object key, Object value, Entry next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }

            // 이 엔트리가 가리키는 연결 리스트를 재귀적으로 복사
            // 재귀 호출 대신 반복자로 설정
            Entry deepCopy() {
                Entry result = new Entry(key, value, next);
                for (Entry p = result; p.next != null; p = p.next)
                    p.next = new Entry(p.next.key, p.next.value, p.next.next);
                return result;
            }
        }
//        @Override
//        public HashTable clone(){
//            try{
//                HashTable result = (HashTable) super.clone();
//                result.buckets = (Map.Entry[]) new Entry[buckets.length];
//                for (int i = 0; i < buckets.length; i++)
//                    if (buckets[i] != null)
//                        result.buckets[i] = buckets[i].deepCopy();
//                return result;
//            } catch (CloneNotSupportedException e){
//                throw new AssertionError();
//            }
    }



    // 잘못된 clone 메서드 - 가변 상태를 공유한다.
//    @Override
//    public HashTable clone(){
//            try{
//                HashTable result = (HashTable) super.clone();
//                result.buckets = buckets.clone();
//                return result;
//            } catch (CloneNotSupportedException e){
//                throw new AssertionError();
//        }
//    }
