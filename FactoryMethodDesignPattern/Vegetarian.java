package FactoryMethodDesignPattern;

public class Vegetarian implements Builder {
 
    @Override
    public void getFoods() {
        System.out.println("\nWELCOME TO INDIAN VEG RESTAURANT");
        System.out.println("\nIndian veg foods: ->");
        System.out.println("\nVeg Burger = Rs. 150"+"\nVeg Pizza = Rs. 220"+
        "\nVeg Noodles = Rs. 190"+"\nVeg Biryani = Rs. 270"+"\nVeg Cutlet = Rs. 200\n");
    }
}
