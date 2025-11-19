//factory pattern demo

public class PizzaFactory {
    public static void main(String[] args) {
        PizzaDemo pizzaDemo = new PizzaDemo();
        Pizza pizza = pizzaDemo.createPizza("veg");
        pizza.prepare();
        }
}
interface Pizza{
   public void prepare();
}
class CheezPizza implements Pizza {
     public void prepare() {
        System.out.println("Cheez pizza is prepared");
    }
}
class VegPizza implements Pizza {
    public void prepare() {
        System.out.println("Veg pizza is prepared");
    }
}
class ChickenPizza implements Pizza {
    public void prepare() {
        System.out.println("Chicken ");
    }
}
class PizzaDemo {
     public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type=="chicken") {
            pizza = new ChickenPizza();
        } else if(type=="veg") {
            pizza = new VegPizza();
        } else if(type == "cheez") {
            pizza = new CheezPizza();
        }
        return pizza;
    }
}