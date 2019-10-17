package ejemploobjetoatributo;

/**
 *
 * @author mmartinezcosta
 */
public class Alumno {

        private String nome;
        private int nota;
        private Direccion dire=new Direccion();

    public Alumno(){
      // constructor por defecto  
    }

    // construtor con parametros
    public Alumno(String nome, int not, Direccion dir){
        this.nome=nome;
        nota=not;
        dire=dir;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setNota(int not){
        nota=not;
    }
    public int getNota(){
        return nota;
    }
    
    public void setDire(Direccion dir){
        dire=dir;
    }
    public Direccion getDire(){
        return dire;
    }
    
    public void amosar(){
        System.out.println("Nome: "+nome+"\n Nota: "+nota+"\n Email: "+dire.getEmail()+"\n Telefono: "+dire.getTelefono());
    }    
}
