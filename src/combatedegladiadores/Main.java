package combatedegladiadores;
import java.util.Scanner;
public class Main {
    public static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {
        String nombre="";
        int fuerza=0;
        int dañoAtaque=0;
        int opcion=0;
        //Pedimos los datos 
        System.out.println("»***Primer Gladiador***«");
        System.out.print("Escriba el nombre del gladiador: ");
        nombre=leer.nextLine();
       
        do{
            System.out.print("Teclee el valor de la fuerza de "+nombre+" (entre 1 y 5): ");
            fuerza=Integer.parseInt(leer.nextLine());
        }while(fuerza<1||fuerza>5);
        //primer objeto gladiador
        Gladiador g1=new Gladiador();
        g1.setNombre(nombre);
        g1.setFuerza(fuerza);
        System.out.println();
        
        System.out.println("»***Segundo Gladiador***«");
        System.out.print("Escriba el nombre del gladiador: ");
        nombre=leer.nextLine();
      
        do{
            System.out.print("Teclee el valor de la fuerza de "+nombre+" (entre 1 y 5): ");
            fuerza=Integer.parseInt(leer.nextLine());
        }while(fuerza<1||fuerza>5);
        // segundo objeto gladiador
        Gladiador g2=new Gladiador();
        g2.setNombre(nombre);
        g2.setFuerza(fuerza);
    
        do{
            System.out.println("░░MENU DE COMBATE░░");
            System.out.println("1.-Ataca "+g1.getNombre()+" Gladiador#1");
            System.out.println("2.-Ataca "+g2.getNombre()+" Gladiador#2");
            System.out.println("Teclee su opcion: ");
            opcion=Integer.parseInt(leer.nextLine());
        switch(opcion){
        case 1://daño de ataque del gladiador 1 sobre el 2
            dañoAtaque=g1.Atacar();
            System.out.println(g1.getNombre()+" Ataco a "+g2.getNombre()+" con un daño de: "+dañoAtaque);
        //parametros de daño del ataque al gladiador 2
            g2.recibirDaño(dañoAtaque);
            if(g2.getEstado().equals(" DERROTADO"));
            System.out.println(g2.getNombre()+" ha sido DERROTADO y "+g1.getNombre()+" es el VENCEDOR");
            break;
        case 2:
            dañoAtaque=g2.Atacar();
            System.out.println(g2.getNombre()+" Ataco a "+g1.getNombre()+" con un daño de: "+dañoAtaque);
        
            g1.recibirDaño(dañoAtaque);
            if(g1.getEstado().equals(" DERROTADO"));
            System.out.println(g1.getNombre()+" ha sido DERROTADO y "+g2.getNombre()+" es el VENCEDOR");
            break;
        }
        
        System.out.println();
        System.out.println(g1.getNombre()+" tiene una energia de "+g1.getEnergia());
        System.out.println(g2.getNombre()+" tiene una energia de "+g2.getEnergia());
        System.out.println();
        
        }while(g1.getEstado().equals(" En guardia")&& g2.getEstado().equals(" En guardia"));
        System.out.println("»»»FIN DEL COMBATE«««");
        
    }
    
}
