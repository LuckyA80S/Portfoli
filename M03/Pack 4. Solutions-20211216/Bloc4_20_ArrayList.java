/*
20. Dissenyar un programa que permeti calcular les gratificacions que hi ha que pagar als empleats d’una empresa amb motiu de celebrar els seus 20 anys de funcionament. 
Es tindrà que llegir el nom i número d’anys que cada treballador porta en l’empresa, finalitzant la lectura de dades a l’introduir un nom igual a “FI”. 
Tenint en compte la següent informació:

    Anys treballats en l’empresa       Gratificació en € 
    Més de 3 i menys de 10                      300
    Entre 10 i 15                               400
    Més de 15                                   700

Finalment es desitja escriure el total de gratificacions abonades.

*/

// Creado por Sergio Lillo

package bloc4;

import bloc4.Bloc4_20o;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Bloc4_20_ArrayList {

    public static void main(String[] args) {
    BufferedReader in = new BufferedReader( new InputStreamReader (System.in));
    //ArrayList <String> empleados = new ArrayList();
    String nombre = "";
    int anyos = 0;
    int contador=0;
    //Bloc4_20o empleado[] = null;
    
    ArrayList <Bloc4_20o> lista = new ArrayList();
    
try{
//empleado = new Bloc4_20o [3];
    
    while(nombre != "fin")
    {
        if(nombre.equals("fin"))
        {
           lista.remove(contador);          
           break;           
        }
        else
        {
            System.out.println("Escriba el nombre de un empleado: ");
            nombre = in.readLine();
            System.out.println("Escriba cuantos años lleva en la empresa: ");
            anyos = Integer.parseInt(in.readLine());
            lista.add(new Bloc4_20o(nombre,anyos)); 
            //empleado[i] = new Bloc4_20o(nombre,anyos); 
            contador++;
        }
    }
    
    }catch(Exception e){
    }
    
    System.out.println("\nHas agregado " + contador + " empleados\n");

    for(Bloc4_20o empleado1 : lista){
                    
            if(empleado1.obtenerAnyos() <= 3)
            {
                System.out.println("-Nombre: "+empleado1.obtenerNombre()+"\n-Edad: " + empleado1.obtenerAnyos()+ "\n-Gratificación: 0 euros\n");
            }

            if(empleado1.obtenerAnyos() > 3 && (empleado1.obtenerAnyos() <= 10))
            {
               System.out.println("-Nombre: "+empleado1.obtenerNombre()+"\n-Edad: " + empleado1.obtenerAnyos()+ "\n-Gratificación: 300 euros\n");
            }

            if(empleado1.obtenerAnyos() >= 10 && (empleado1.obtenerAnyos() <= 15))
            {
               System.out.println("-Nombre: "+empleado1.obtenerNombre()+"\n-Edad: " + empleado1.obtenerAnyos()+ "\n-Gratificación: 400 euros\n");
            }

            if(empleado1.obtenerAnyos() > 15)
            {
               System.out.println("-Nombre: "+empleado1.obtenerNombre()+"\n-Edad: " + empleado1.obtenerAnyos()+ "\n-Gratificación: 700 euros\n");
            }
           }
}
}