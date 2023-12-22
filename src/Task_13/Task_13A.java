package Task_13;

public class Task_13A {
    String name;
    int price;
    boolean isAvailable;

    public Task_13A(String brand) {
        name = brand;
    }
    public Task_13A(String brand, int Amount) {
        price = Amount;
    }
    public Task_13A(String brand, int Amount, boolean PhoneisAvailable) {
        isAvailable = PhoneisAvailable;
    }
    public void printPhone(){
        System.out.println();
    }
}
