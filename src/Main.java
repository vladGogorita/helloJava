public class Main {

    public static void main(String[] args) {
        Test1 test1Object = new Test1();

        System.out.println("Hello World!");
        System.out.println("Hello Again!");
        System.out.println(test1Object.getHelloMessage());
        test1Object.sayHelloMessage();

        int x = 7;
        //System.out.println(x++);
        //System.out.println(++x);


        System.out.println("The chosen month has a number of " + MonthPicker.pickMonth("November") + " days.");

    }
}
