package ejemploobjetoatributo;

/**
 *
 * @author mmartinezcosta
 */
public class Direccion {
   
        private String eMail;
        private String telefono;
    
   public Direccion(){
        
    }
   public Direccion (String eMail, String telf){
       this.eMail=eMail;
       telefono=telf;
   } 
    
   // Métodos de acceso
   
   public void setEmail(String eMail){
       this.eMail=eMail;  
   }
   public String getEmail(){
       return eMail;
   }
   
   public void setTelefono(String telf){
       telefono=telf;
   }
   public String getTelefono(){
       return telefono;
   }
           
}
