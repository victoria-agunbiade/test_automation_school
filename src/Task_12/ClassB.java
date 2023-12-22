package Task_12;

import Task_12.ClassA;
public class ClassB {
    public static void main(String[] args) {
        ClassB task = new ClassB();
        task.classB();
    }
    private void classB() {
        System.out.println("Class B");
        ClassB task = new ClassB();
        task.classB();
    }
}
