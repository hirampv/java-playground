public class HelloWorld {
    public static void main(String[] args) { 
        System.out.println("Hello world!");
        //System.out.println(args[0]);


        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1 == string2);
        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());
    }
}