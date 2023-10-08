
 class RemoteTvControl {
    private static RemoteTvControl obj;

    private RemoteTvControl(){
     System.out.println("RemoteTvControl instance");
    }
   // Create the instance of class with synchronized method.
    public static synchronized RemoteTvControl gRemoteTvControl(){
          // lazy instantiation-> it will created when request time.
         if(obj == null){
            obj = new RemoteTvControl(); // It will be created at request time
         }
        return obj;
    } 
     // tv on by remote control
    public void getTvON(){
        System.out.println("TV IS TURNS ON");
    }

     public void getTvOFF(){
        System.out.println("TV IS TURNS OFF");
    }

      public void getSetUpBoxON(){
        System.out.println("SETUP BOX TURNS ON");
    }

     public void getSetUpBoxOFF(){
         System.out.println("SETUP BOX TURNS OFF");
    }

}

class RemoteControl{

    public static void main(String[] args){
        RemoteTvControl sLazyInstance = RemoteTvControl.gRemoteTvControl();
        sLazyInstance.getSetUpBoxON();
        sLazyInstance.getTvON();
        try{
          Thread.sleep(1000);
        }catch(Exception e){e.printStackTrace();}
      
        sLazyInstance.getSetUpBoxOFF();
        sLazyInstance.getTvOFF();
    }
}

