package factory.pizzafm;

public class ChicagoStylePepperoniPzza extends Pizza {

    public ChicagoStylePepperoniPzza(){
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Black Olives");
        toppings.add("Eggplant");
        toppings.add("Spinach");
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

