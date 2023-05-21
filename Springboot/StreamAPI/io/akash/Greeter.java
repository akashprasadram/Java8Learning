package StreamAPI.io.akash;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        //System.out.println("Main method()....");

        /*doubleNumberFuction=(int a)->a*2;
        addFunction=(int a,int b)->a+b;
        safeDivisionFunction=(int a,int b)->{
            if(b==0) return 0;
            return a/b;
        };
        StringLengthCountFunction=(String s)->s.length();*/

        /*MyLambda myLambdaFunction = () -> System.out.println("Hello World!!!");
        MyAdd addFunction=(int a,int b)-> a + b;*/

        //This is an instance of the class that is implementing Greeting interface
        Greeter greeter=new Greeter();
        Greeting helloWorldGreeting=new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        //Lambda Greeting (This is a Lambda expression of type greeting interface)
        Greeting myLambdaFunction1= () -> System.out.println("Lambda -> Hello  World !!!");
        myLambdaFunction1.perform();

        //InnerClass Greeting
        Greeting innerClassGreeting=new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inside class -> Hello World !!!");
            }
        };
        innerClassGreeting.perform();

        //Also greet method doesn't care about lambda or inner class
        System.out.println("\nCalling greet() method using lambda and inner class");
        greeter.greet(myLambdaFunction1);
        greeter.greet(innerClassGreeting);
        greeter.greet(()-> System.out.println("Direct -> Hello World!!!"));
    }
}
/*
interface MyLambda{
    void foo();
}

interface MyAdd{
    int add(int x,int y);
}*/