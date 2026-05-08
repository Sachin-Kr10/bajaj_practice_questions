public class OverrideMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.details();
    }
}

class Parent {
    void details(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    @Override
    void details(){
        System.out.println("This is childen class");
    }
}