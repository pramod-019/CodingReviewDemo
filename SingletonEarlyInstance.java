
class SingletonEarlyInstance{
     
    // Early, instace will be created at classloading time.  
    private static SingletonEarlyInstance obj = new SingletonEarlyInstance();

    // It will prevent the instantiate the class from out of class
    private SingletonEarlyInstance(){
      System.out.println("SingletonEarlyInstance");
    }

    // it is global point or acces this method and return the obj fron out classs
    public static SingletonEarlyInstance getSingletonEarlyInstance(){
          return obj;
    }

    public void getUserName(){
        System.out.println("Name is -> Pramod Rai");
    }

     public void getUserAge(){
        System.out.println("Age is -> 29");
    }

}

class A {
    public static void main(String[] args){
         SingletonEarlyInstance sInstance = SingletonEarlyInstance.getSingletonEarlyInstance();

               sInstance.getUserName();
               sInstance.getUserAge();
    }
}