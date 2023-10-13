// Now added README file.
 class RemoteControlTv {
    private static RemoteControlTv obj;

    private RemoteControlTv(){
     System.out.println("RemoteTvControl instance");
    }
   // Create the instance of class with synchronized method.
    public static synchronized RemoteControlTv gRemoteTvControl(){
          // lazy instantiation-> it will created when request time.
         if(obj == null){
            obj = new RemoteControlTv(); // It will be created at request time
         }
        return obj;
    } 
     // tv on by remote controls
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
        RemoteControlTv sLazyInstance = RemoteControlTv.gRemoteTvControl();
        sLazyInstance.getSetUpBoxON();
        sLazyInstance.getTvON();
        try{
          Thread.sleep(1000);
        }catch(Exception e){e.printStackTrace();}
      
        sLazyInstance.getSetUpBoxOFF();
        sLazyInstance.getTvOFF();
    }
}

