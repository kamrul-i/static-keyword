package static_variable;

public class Students_count {
    //এখানে ২টি class use করা হয়েছে।। এই class-এ variable & method declare করে, অন্য class থেকে তাকে call করা হয়েছে।।

    static int count = 0; //it is static variable

    //it is constructor, it is same as the class name.
    Students_count() {
        count++;
    }

    //it is method
    void totalStudent() {
        System.out.println("Total student : " + count);
    }

}
