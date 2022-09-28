package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();
        sList.add("aa");
        sList.add("bb");
        sList.add("cc");
        System.out.println("sList = " + sList);

        Stream<String> stream = sList.stream();
        //스트림 생성
        stream.forEach(s -> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.println(s));

//        for (String s : sList){
//            System.out.println(s);
//        }

    }
}
