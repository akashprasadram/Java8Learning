package StreamAPI.io.akash;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        myThread.run();

        //Using Lambda
        Thread myLambdaThread=new Thread(()-> System.out.println("Printed inside Lambda Runnable"));
        myLambdaThread.run();
    }
}
