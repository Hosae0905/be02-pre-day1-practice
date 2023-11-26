package day5;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1 + str2);

        String str3 = "abc.def#.ghi-";
        System.out.println("str3 = " + str3);

        String replace = str3.replace("-", "!");        // 저장이 필요함
        String replace1 = replace.replace(".", "!");
        String replace2 = replace1.replace("#", "!");

        System.out.println("replace2 = " + replace2);

        String str4 = "abc:def:ghi";
        String[] split = str4.split(":");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        
    }
}
