package banco;

import java.awt.font.TextAttribute;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author koveb
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        //Aqui va el desarrollo:
        //vamos a crear objetos:
        
        
        Persona p1 = null ; //objeto p1 de la clase Persona no inicializado.
        Persona p2 = null; //objeto p2 de la clase Persona inicializado nulo.
        Persona p3 = new Persona(); //objeto p3 de la clase Persona instanciado.
        Persona p4 = new Persona(16666666, "Lucifer",new Date());
        
        Credencial  c1 = new Credencial(123,new Date(),12,p4);
        Credencial c2 = new Credencial(456,new Date(),24,p4);
        
        //CICLOS:
        
        //while(true){
         //   break;
        //}
        
        //do{
            //continue
         //   break;
       // }while(true);
        
        //for x(int x =0; x <10; x++){
         //   break;
    //}}
    Scanner input = new Scanner(System.in);
    Persona p = null ;
  do{
      System.out.println("MENÚ");
      System.out.println("1. CREAR PERSONA");
      System.out.println("2. CREAR CREDENCIAL");
      System.out.println("3. SALIR");
      System.out.print("Ingrese una opción: ");
      int  opc = input.nextInt();
      if(opc == 1){
          System.out.print("Ingrese rut: ");
          int rut = input.nextInt();
          System.out.print("Ingrese nombre: ");
          String nombre = input.next();
          System.out.print("Ingrese fecha nacimiento(dia-mes-año): ");
          String fecha_nac = input.next();
          p = new Persona(rut,nombre,new SimpleDateFormat("d-M-y").parse(fecha_nac));
          System.out.println("PERSONA CREADA CON ÉXITO!\n");
          p.imprimir();
      }else if(opc==2){
          if(p!=null){
          System.out.print("Ingrese el numero de la credencial: ");
          int numero = input.nextInt();
          System.out.print("Ingrese el nombre la fecha de la credencial (d-M-y): ");
          String fecha_vec = input.next();
          System.out.print("Ingrese el cdoigo cvv: ");
          int codigo = input.nextInt();
          Credencial c = new Credencial(numero,new SimpleDateFormat("d-M-y").parse(fecha_vec),codigo,p);
          System.out.println("CREDENCIAL CREADA CON ÉXITO!\n");
          c.imprimir();
          }else{
              System.err.println("ERROR! debe crear una persona!!");;
      }
          
      }else if(opc == 3){
          System.out.println("GRACIAS DIOS!");
          break;
      }else{
          System.err.println("ERROR! OPCIÓN INCORRECTA!");
      }
      
  }while(true);

  
  }
}
