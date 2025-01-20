interface IMember {
    void callBack();
}

class Customer implements IMember {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void callBack() {
        System.out.println(name + " accepted the offer invite");
    }
}

public class Store {
    //Array will hold references to objects of classes that will implement IMember interface
    IMember[] mem = new IMember[100];
    int count = 0;

    //m must be  an instance of a class that implements IMember interface
    void register(IMember m) {
        mem[count++] = m;
    }
    
    void informMembersOffer() {
        for (int i = 0; i < count; i++) {
            mem[i].callBack();
        }
    }
    
}
