package static_method_restriction;

public class Test {
    public static void main(String[] args){
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।
        
        //non-static method is related with object.
        //non-static methods have to create the object and then declare it.
        Teacher teacher = new Teacher();    //this line name is object create.
        teacher.display1();

        //static is related with class, not object.
        //"static_method" has to declare by class name.
        Teacher.display2();
    }
}
