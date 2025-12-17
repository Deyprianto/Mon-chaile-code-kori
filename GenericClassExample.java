

class Box<T> {

    T value;
    void set(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }
}
public class GenericClassExample {
    public static void main(String[] args) {

        Box<String> name = new Box<>();//string niye kaj korsi
        name.set("prianto");
        System.out.println("My name is : "+name.get() ); 

        Box<Integer> age = new Box<>();
        age.set(17);
        System.out.println("My age is "+age.get());

        Box<Boolean> bol = new Box<>();
        bol.set(false);
        System.out.println("I am a good person : "+bol.get());
        
    }
}
