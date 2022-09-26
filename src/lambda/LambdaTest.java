package lambda;

interface PrintString{
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        PrintString lambda = str -> System.out.println(str);
        //람다식으로 구현부
        lambda.showString("hi");

        showMyString(lambda);
        PrintString str = returnPrint();
        str.showString("hi");
    }

    public static void showMyString(PrintString a){
        a.showString("assdaasd");
    }

    public static PrintString returnPrint(){
        return str -> System.out.println(str + " world");
    }
}
