package ejemploobjetoatributo;

import java.util.*;
/**
 *
 * @author mmartinezcosta
 */
public class EjemploObjetoAtributo {

    
    public static void main(String[] args) {
        Scanner alumno1=new Scanner(System.in);
        
        Alumno alum=new Alumno();
        alum.amosar();
        
        System.out.print("Nome: ");
        String nome=alumno1.nextLine();
        
        System.out.print("Nota: ");
        int nota=alumno1.nextInt();
        
        System.out.print("Email: ");
        String eMail=alumno1.next();
        
        System.out.print("Teléfono: ");
        String telefono=alumno1.next();
    
    Direccion d=new Direccion(eMail, telefono);
    Alumno alum2=new Alumno(nome, nota, d);
        alum2.amosar();
    
    
    
    }
    
}
