package StreamAPI.io.akash.Unit3Excercise;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        Thread t=new Thread(() -> printMessage());
        t.start();

        //Method Reference
        Thread t1=new Thread(MethodReferenceExample1::printMessage); //()->method()
        //MethodReferenceExample1::printMessage === () -> printMessage()
        t1.start();
    }
    public static void printMessage(){
        System.out.println("Hello");
    }
}
