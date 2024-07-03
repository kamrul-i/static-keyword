package static_variable;

public class Test {
    public static void main(String[] args){
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।
        
        Students_count s1 = new Students_count();
        s1.totalStudent();
        
        Students_count s2 = new Students_count();
        s2.totalStudent();
        
        Students_count s3 = new Students_count();
        s3.totalStudent();
        
        Students_count s4 = new Students_count();
        s4.totalStudent();
    }
}
