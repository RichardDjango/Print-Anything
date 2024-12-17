class Person{
    public void drive(){
        System.out.println("Driving now........");
    }
}
class Car{
    public void Mercedez(Person p){
        p.drive();
    }
}

public class PrintAnything {
    public static void main(String[] args) {
        Car c = new Car();
        Person p = new Person();
        c.Mercedez(p);
    }
}
