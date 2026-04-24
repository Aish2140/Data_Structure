package PatternProgram;

class Parent {
    static void show() {
        System.out.println("Parent static");
    }

    void display() {
        System.out.println("Parent instance");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static");
    }

    void display() {
        System.out.println("Child instance");
    }
}








class Parent01 {
int a = 10; // parent instance variable
}
class Child01 extends Parent01 {
int a = 20; // child declares same variable name
public void readBooks() {
System.out.println(a + " hello"); // prints 20 hello
}
}
// Child's a = 20 hides Parent's a = 10
// Parent's a still exists but is hidden by child's a




public class Main {
    public static void main(String[] args) {
        Parent01 c1=new Child01();   
        System.out.println(c1.a);
    }
}