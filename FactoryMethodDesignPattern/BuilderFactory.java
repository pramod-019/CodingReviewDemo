package FactoryMethodDesignPattern;

public class BuilderFactory {
   public Builder creatBuilder(String catagory){
    if(catagory == null || catagory.isEmpty())
         return null;
     switch (catagory) {
     case "vegetarian":
         return new Vegetarian();
     case "non-vegetarian":
         return new NonVegetarian();
         default:
          throw new IllegalArgumentException("Unknown channel "+catagory);
     }

  }

}
