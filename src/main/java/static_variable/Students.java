package static_variable;

public class Students {

    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable & method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।
    //these are instance variable
    String name;
    int id;
    static String institute_name = "jamia al-safa"; //it is static variable

    // n & i are local variable ---------------
    Students(String n, int i) {
        name = n;
        id = i;
    }

    //it is method -------------
    void displayInformation() {
        System.out.println("id             : " + id);
        System.out.println("Name           : " + name);
        System.out.println("Institute Name : " + institute_name);
        System.out.printf("\n");
    }

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
