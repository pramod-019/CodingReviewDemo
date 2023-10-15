package FactoryMethodDesignPattern;

public class NonVegetarian implements Builder {

    @Override
    public void getFoods() {
        System.out.println("\nWELCOME TO INDIAN NON-VEG RESTAURANT");
        System.out.println("\nIndian non-veg foods: ->");
          System.out.println("\nNon-Veg Burger = Rs. 230"+"\nNon-Veg Pizza = Rs. 260"+
          "\nNon-Veg Noodles = Rs. 300"+"\nNon-Veg Biryani = Rs. 550"+"\nNon-Veg Cutlet = Rs. 330\n");
        
    }
    
}
