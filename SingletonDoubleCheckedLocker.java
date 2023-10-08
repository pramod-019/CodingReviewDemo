class SingletonDoubleCheckedLocker{

public static SingletonDoubleCheckedLocker singleton;

 private SingletonDoubleCheckedLocker(){
 
    System.out.println("Singlton instance");

 }

 public static SingletonDoubleCheckedLocker instance(){ // if use synchronized here this take excuting time 100x ms.
     if(singleton == null) {
      synchronized(SingletonDoubleCheckedLocker.class) {// double checked locker 
         if(singleton == null)
          singleton = new SingletonDoubleCheckedLocker();
      }
       
     }
     return singleton;
 }

 public void getUserName(){
    System.out.println("Name is -> Pramod Rai");
}

 public void getUserAge(){
    System.out.println("Age is -> 29");
}

}

class CallFirst{
 public static void main(String[]args){

     Thread thread1 = new Thread(new Runnable() {

      @Override
      public void run() {
          System.out.println("Thread 1");
      }
      
     });

      Thread thread2 = new Thread(new Runnable() {

      @Override
      public void run() {
          System.out.println("Thread 2");
      }
      
     });

      Thread thread3 = new Thread(new Runnable() {

      @Override
      public void run() {
          SingletonDoubleCheckedLocker singleton = SingletonDoubleCheckedLocker.instance();
          singleton.getUserName();
          singleton.getUserAge();
      }
      
     });

     thread1.start();
     thread2.start();
     thread3.start();

   //  Singleton a = Singleton.instance();
   //  Singleton b = Singleton.instance();
   //  Singleton c = Singleton.instance();

   //  System.out.printf("Singleton of a", a.hashCode());
   //  System.out.printf("\nSingleton of b", b.hashCode());
   //  System.out.printf("\nSingleton of c", c.hashCode());

   //  if(a==b && a==c){
   //  System.out.printf("\nAll objects are same");
   //  }else{
   //     System.out.printf("\nAll objects are not same");  
   //  }
  
   }
 }