package bloc6;

import java.util.Arrays;

public class p7 {

    public static void main(String[] args) {

        p7_employees[] treballadors = new p7_employees[5];
        p7_departaments[] departaments = new p7_departaments[3];
        
        emplenaTreballadors(treballadors);
        emplenaDepartaments(departaments);
        
    }
     public static void emplenaTreballadors( p7_employees[] workers){
         workers[0] = new p7_employees("Pepe",23,"625458965","Comptable");
         workers[1] = new p7_employees("Lluis",25,"625458965","Comptable");
         workers[2] = new p7_employees("Maria",27,"626458965","Direcció");
         workers[0] = new p7_employees("Pepe",23,"625458965","Comptable");
         workers[0] = new p7_employees("Pepe",23,"625458965","Comptable");
     }
    
     public static void emplenaDepartaments( p7_departaments[] departaments){
         
     }    
    
}
