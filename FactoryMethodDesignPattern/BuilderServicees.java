package FactoryMethodDesignPattern;

public class BuilderServicees {
    public static void main(String[] args) {
        
        BuilderFactory builderFactory = new BuilderFactory();
        Builder builder = builderFactory.creatBuilder("non-vegetarian");
        builder.getFoods();
    }
    
}
