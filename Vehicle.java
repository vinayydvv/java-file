abstract class Vehicle{
    abstract void start();
}

class car extends Vehicle{
   
    void start() {

        System.out.println("car starts with Key");
    }
}

class scootar extends Vehicle{
    void start(){
        System.err.println("Scootar Starts with kick");
    }

    public static void main(String [] args) {

        car c = new car();
        c.start();

        scootar s = new scootar();
        s.start();
      }
}

