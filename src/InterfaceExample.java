public interface InterfaceExample {
    void methodOne();
    void methodTwo();
}

class SubClass implements InterfaceExample {
    @Override
    public void methodOne() {
        System.out.println("Method one of subclass");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method two of subclass");
    }

    public void methodThree() {
        System.out.println("Method three of subclass");
    }
}