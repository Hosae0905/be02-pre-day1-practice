package day5;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionPractice {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(111);
        arrayList.add("111");

        System.out.println(arrayList);

//        ArrayList<Integer> list = new ArrayList<>();  // 타입이 다르면 처리하기 힘들기 때문에 제네릭으로 타입을 지정해줘야 한다.
//        list.add("111");


        HashMap hashMap = new HashMap();
        hashMap.put(1, "1번");
        hashMap.put(1, "2번");
        hashMap.put(2, "3번");
        hashMap.put(3, "4번");

        System.out.println(hashMap);
    }
}
