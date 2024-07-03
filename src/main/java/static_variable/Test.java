package static_variable;

public class Test {

    public static void main(String[] args) {

        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।
        
        //non-static is related with object.
        //non-static have to create the object and then declare it.
        Student student = new Student();  //this line name is object create.
        System.out.println("Name : " + student.name);

        //"static" is related with class, not object.
        //"static" has to declare by class name.
        System.out.println("Institute name : " + Student.institute_name);
    }

    /*
    Why use "static keyword" ?
    "static" keyword is used form memory management. it makes the program more efficient by saving memory.
        
    static keyword can't be declared as local variable.
    "static" keyword can be used before variable.
    "static" keyword can be used before method.
    "static" keyword can be used before block.
     */
}
