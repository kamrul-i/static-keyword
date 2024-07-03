package static_variable;

public class Student {
    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable declare করে, অন্য class থেকে তাকে call করা হয়েছে।।

    //it is non-static variable
    String name = "Kamrul islam";

    //it is static variable
    static String institute_name = " Jamia al-safa";

    /*
    Why use "static keyword" ?
    "static" keyword is used form memory management. it makes the program more efficient by saving memory.
        
    static keyword can't be declared as local variable.
    "static" keyword can be used before variable.
    "static" keyword can be used before method.
    "static" keyword can be used before block.
    
    
    static method is related with class, not object.
    non-static method is related with object.
    
    "static_method" has to declare by class name.
    non-static methods have to create the object and then declare it.
     */
}
