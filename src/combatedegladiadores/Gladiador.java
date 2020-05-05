package combatedegladiadores;
        import java.util.Random;
public class Gladiador {
   
    private String nombre;
    private String estado="En guardia";
    private int energia=1000;
    private int fuerza;

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getEstado() {
        return estado;
    }

    
    public int getEnergia() {
        return energia;
    }

    
    public int getFuerza() {
        return fuerza;
    }

  
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

   
    //devuelve el valor del daño que provoca el ataque
    public int Atacar(){
    //objeto de tipo random
    Random rnd=new Random();
   
    int dañoTotal=0;
    dañoTotal=this.fuerza*rnd.nextInt(50);
    return dañoTotal;
    }
    //calcula el daño recibido
    public void recibirDaño(int dañoRecibido){
        //Se le resta a la energia el daño que recibe
        this.energia=this.energia-dañoRecibido;
        //Analizando el nivel de energia 
        if(this.energia<=0){
            this.estado="DERROTADO";
        }
    }
}