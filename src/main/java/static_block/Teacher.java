package static_block;

public class Teacher {

    static int id;
    static String name;

    //it is static block
    //it is single static block, you could use multiple static block. multiple that means one or more.
    static {
        id = 101;
        name = "Abdur Rahim";
    }
    
    static void display(){
        System.out.println("ID   : "+id);
        System.out.println("Name : "+name);
    }
    
    //-----------------------------------------------
    //-----------------------------------------------
    public static void main(String[] args){
        
        Teacher.display();
    }
    
}
