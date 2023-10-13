class Emp{
    int eid;
    int salary;
    String ename;
    static String ceo;

    static {
        ceo = "Kaling Jocky";
         System.out.println("static");
    }

    public Emp(int i, int j, String string){
        eid = i;
        salary = j;
        ename = string;
        System.out.println("constructor");
    }

    void eProfiles(){
        System.out.println("Id"+"-"+eid+ " : "+"Name"+"-"+ename+" : "+"Salary"+"-"+salary+" : "+"CEO"+"-"+ceo);
    }
}

public class SExample {

    public static void main(String[] args) {
      
        Emp jocky = new Emp(201,2500,"Jelly");
    
        Emp rocky = new Emp(102,3300,"Toerg");

        jocky.eProfiles();
        rocky.eProfiles();

    }
}
