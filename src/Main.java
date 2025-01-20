/*
* Interface are only used purely to achieve polymorphism.
* An interface will contain only abstract methods,
* We do not write the abstract keyword before the methods
* Interface methods are always public hence we do not include the public keywords before the method
* Interfaces are defined with interface keyword before the class name, and we do not include the class keyword
* A subclass then implements and interface through the implement keyword
* While classes are extended interfaces are implemented
* They do not have any properties or concrete methods that can be shared to a subclass unlike abstract classes
* Interfaces are useful in the place where we have an abstract class with all abstract method i.e. no concrete method
* Therefore, Interfaces can be defined as abstract classes with all abstract methods
* A subclass can only extend one class but can implement multiple interfaces
* We can have object references of interfaces, but we cannot create an object of an interface
* Rules of interfaces:
*   1. Interfaces can have variables. The variable name should be capital letters. The variable is always final and static
*   2. Interfaces can have static methods with method bodies
*   3. Static interface members can be accessed directly using dot notation e.g. InterfaceName.method() / InterfaceName.variable()
*   4. One interface can extend another interface
*   5. Default methods are also allowed in Interfaces - default methods are important to update existing interfaces
*   6. A class can implement multiple interfaces
 */
public class Main {
    public static void main(String[] args) {

        InterfaceExample ex = new SubClass();
        ex.methodOne();
        ex.methodTwo();

        //We can create a smartphone objects
        Smartphone samsung = new Smartphone();
        samsung.videoCalls();

        //We can refer to the smartphone as a phone - creating an object reference of the superclass
        Phone phone = samsung;
        phone.call();

        //We can refer to the smartphone as a camera - creating an object reference of the camera interface
        ICamera cam = samsung;
        cam.recordVideo();

        //We can refer to the smartphone as a music player - creating an object reference of the music player interface
        IMusicPlayer mus = samsung;
        mus.playMusic();

        //Store object
        Store s1 = new Store();
        Customer cust1 = new Customer("James");
        Customer cust2 = new Customer("Smith");
        s1.register(cust1);
        s1.register(cust2);
        s1.informMembersOffer();
    }
}