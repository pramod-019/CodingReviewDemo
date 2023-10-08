public class SingletonLazyInstance {
    private static SingletonLazyInstance obj;

    private SingletonLazyInstance(){
     System.out.println("SingletonLazyInstance");
    }
   // Create the instance of class with synchronized method.
    public static synchronized SingletonLazyInstance getLazyInstance(){

         if(obj == null){
            obj = new SingletonLazyInstance(); // It will be created at request time
         }

        return obj;
    } 

    public void getUserName(){
        System.out.println("Name is -> Pramod Rai");
    }

     public void getUserAge(){
        System.out.println("Age is -> 29");
    }

    

}

class Main{

    public static void main(String[] args){
        SingletonLazyInstance sLazyInstance = SingletonLazyInstance.getLazyInstance();
        sLazyInstance.getUserName();
        sLazyInstance.getUserAge();
    }
}
