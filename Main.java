
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Corredor n1 = new Corredor();
        int correr,recarga;
        String opc = null;
        
        
       System.out.print("Indique la energia del corredor: ");
       n1.setEnergia(in.nextInt());
       do{
           System.out.println("\nDigite la cantidad de veces que correrá el competidor : ");
           correr = in.nextInt();
       
            System.out.println("\nEl competidor comenzara a correr en...");
            System.out.println("3...");
            System.out.println("2...");
            System.out.println("1...");
            for(int i=0;i<correr;i++){
                    n1.correr();
                    n1.verificarEnergia();
            }
            
            System.out.print("\n La energia del corredor es: "+n1.getEnergia()); 
            
            
            if(n1.getEnergia() == 0){
                System.out.println();
                n1.energiaCero();
                System.out.println("La energía se esta recargando...");
                System.out.println("Cuantas veces entrenará? dijite : "); recarga = in.nextInt();
                for(int i=0;i<recarga;i++){
                    n1.recargarEnergia(10);
                    n1.entrenar();
                }
                System.out.print("\nLa energia es: "+n1.getEnergia());
            }
           
            else{
                System.out.println("\nRecargando energia...");
                System.out.println("Indique cuantas veces quiere que el competidor entrene: "); recarga = in.nextInt();
                for(int i=0;i<recarga;i++){
                    n1.recargarEnergia(10);
                    n1.entrenar();
                }
                System.out.print("\nLa energia del corredor es: "+n1.getEnergia());
            }
            
            System.out.println("\n\nQuiere que el competidor vuelva a correr? (S/N)");
            opc = in.next();
            System.out.println("\n\n");
        }while("s".equals(opc) || "S".equals(opc) || "si".equals(opc) || "SI".equals(opc) || "Si".equals(opc));    
        
    }
    
}
