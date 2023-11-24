package day5;

import java.util.HashMap;

public class HashMapStudy {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Kim");
        hashMap.put(2, "Yang");
        hashMap.put(3, "Park");
        hashMap.put(4, "Lee");

        String getStr1 = hashMap.get(1);
        String getStr2 = hashMap.get(2);

        System.out.println("getStr1 = " + getStr1);
        System.out.println("getStr2 = " + getStr2);

        boolean contain = hashMap.containsKey(3);
        int size = hashMap.size();

        System.out.println("contain = " + contain);
        System.out.println("size = " + size);

        String remove = hashMap.remove(2);
        System.out.println("remove = " + remove);
        System.out.println(hashMap.get(2));

        hashMap.replace(3, "Park", "Jung");
        System.out.println(hashMap.get(3));
    }
}
