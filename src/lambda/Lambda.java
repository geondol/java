package lambda;

public class Lambda {
    public static void main(String[] args) {

        MyNumber maxNum = (x, y) -> (x >= y) ? x:y;
        //람다식 구현부
        int max = maxNum.getMaxNumber(10,20);
        System.out.println("max = " + max);

        StringConcatImpl st = new StringConcatImpl();
        st.makeString("안녕","난 건형이야");
        //객체지향 방식

        StringConcat con = (s1, s2) -> System.out.println(s1 + ", " + s2);
        //람다식 구현부
        con.makeString("안녕","난 건돌이야");
        //인터페이스 메소드 실행

        StringConcat con2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + ", " + s2);
            }
            //구현부
        };

        con2.makeString("hi","hello");

    }
}
