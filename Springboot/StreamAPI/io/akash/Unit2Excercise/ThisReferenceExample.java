package StreamAPI.io.akash.Unit2Excercise;

public class ThisReferenceExample {
    public String toString() {
        return "This is the main ThisReferenceExample class instance";
    }

    public void execute(){
        System.out.println("\nInside execute()");
        doProcess(10, i->{
            System.out.println("Value of i is "+i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        System.out.println(thisReferenceExample);
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is "+i);
                System.out.println(this);
            }

            public String toString() {
                return "This is the anonymous inner class";
            }
        });

        System.out.println("\nLambda Expression");
        thisReferenceExample.doProcess(10, i->{
            System.out.println("Value of i is "+i);
           // System.out.println(this); //Give Error
        });
        thisReferenceExample.execute();
    }
    public void doProcess(int i, Process p) {
        p.process(i);
    }
}
