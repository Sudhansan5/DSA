package Test;

public class TestInterface implements Exam{
    public static void main(String[] args){
    Exam obj = new TestInterface();
    obj.show();
    }

    public void display(){
    System.out.println("Hi Kadduaaaaaaa");
  }
}

interface Exam{
     void display();

     default void show(){
        System.out.println("Inside interface");
     }
}
