public class Optional {
    public static void main(String[] args) {
        String str ="a";

        java.util.Optional<String> optVal = java.util.Optional.of(str);
        String str1 = optVal.orElse("");
        System.out.println("str = " + str1);

        java.util.Optional<String> optVal2 = java.util.Optional.of("abcd");
        System.out.println("optVal2 = " + optVal2);

    }
}
