package static_method;

public class Teacher {
    //এখানে ২টি class use করা হয়েছে।। এই class-এ method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।

    //it is non-static method
    void display1() {
        System.out.println("Non static mathod printed.");
    }

    //it is static method
    static void display2() {
        System.out.println("static method printed.");
    }

}
