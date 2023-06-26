/*Segunda parte:
 - Crear una clase coche.
 - Dentro de la clase coche, una variable numérica que almacene
   el número de puertas que tiene.
 - Una función que incremente el número de puertas que tiene el coche.
 - Crear un objeto miCoche en el main y añadirle una puerta.
 - Mostrar el número de puertas que tiene el objeto.
*/
public class Main {
    public static void main(String[] args) {

        Coche miCoche=new Coche();//creacion de nuevo obj miCoche
        miCoche.incrementoPuertas(2);//llamado de funcion incrementoPuertas del obj miCoche
        System.out.println(miCoche.numPuertas);//visualizacion de var numPuertas del obj miCoche
        miCoche.incrementoPuertas(3);
        System.out.println(miCoche.numPuertas);
    }
}
class Coche{ //creacion de clase Coche
    int numPuertas=0; //variable que muestra num de puertas de coche

    public int incrementoPuertas(int nPuertas){ //funcion que adiciona numero de puertas a coche
        return  numPuertas= numPuertas+nPuertas;
    }
}