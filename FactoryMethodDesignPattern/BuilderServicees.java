package FactoryMethodDesignPattern;
// This is client side classes
public class BuilderServicees {
    public static void main(String[] args) {
        
        BuilderFactory builderFactory = new BuilderFactory();
        Builder builder = builderFactory.creatBuilder("non-vegetarian");
        builder.getFoods();
    }
    
}
