package static_method_restriction;

public class Teacher {
    //এখানে ২টি class use করা হয়েছে।। এই class-এ method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।

    //it is non-static method
    void display1() {
        //display2();
        System.out.println("Non static mathod printed.");
    }

    //it is static method
    static void display2() {
        //display1();
        System.out.println("static mathod printed.");
    }

    /*
    Restrictions of static method
    static method can't use non static member.
    non-static method can use static member.
    "this" & "super" keyword can't be used here.
    
    non-static method
    restriction aren't done on non-static method./non-static method এ restriction হয় না।।
    non-static method থেকে static method কে call করা যাবে।।
    
    static method
    restriction are done on static method./static method এ restriction হয়।।
    static method থেকে non-static method কে call করা যাবে না।।
     */
}
