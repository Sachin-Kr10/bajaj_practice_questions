public class MethodOver {
    public static void main(String[] args) {
        Student s = new Student();
        s.info("Sachin", 101);
        s.info("tejas", 102, "hp");
    }
}
class Student {
    void info(String name, int rollNo) {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    void info(String name, int rollNo, String address) {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Address: " + address);
    }
}