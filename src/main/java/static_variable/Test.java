package static_variable;

public class Test {

    public static void main(String[] args) {
        //এখানে ২টি class use করা হয়েছে।। এই class থেকে অন্য class কে call করা হয়েছে।।
        
        Students s1 = new Students("Kamrul islam", 101);
        Students s2 = new Students("Islam uddin", 102);
        Students s3 = new Students("Rahim uddin", 103);
        Students s4 = new Students("jahidul islma", 104);

        s1.displayInformation();
        s2.displayInformation();
        s3.displayInformation();
        s4.displayInformation();
    }
    //"static" keyword is used form memory management. it makes the program more efficient by saving memory.
    //এখানে কোন object এর সাথে "jamia al-safa" কে add করা হয় নাই, শুধু name & id add করা হয়েছে।।
    //তবুও method সকল object এর সাথে "jamia al-safa" কে print করে দেখাবে, এটাই static এর সুবিধা।।

}
