package upcastingdowncastingoverrideoverload;

public class denemeclass {


    public static void main(String[] args) {


        superclass sp = new superclass();
sp.method();

        childclass cs=new childclass();
        cs.method();
        cs.method(5);



        superclass downcasting=new childclass();

downcasting.method();

downcasting.notoverriden();

        childclass upcasting= (childclass) new forupcasting();
        System.out.println("upcasting.number = " + upcasting.number);
        System.out.println("upcasting.name = " + upcasting.name);


    }
}
