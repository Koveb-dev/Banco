package banco;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author koveb
 */
public class Credencial {
    private int numero;
    private Date fecha_vencimiento;
    private int codigo;
    private Persona persona; //esto es colaboracion. Donde una clase se convierte en un tipo de atributo.

    public Credencial() {
    }

    public Credencial(int numero, Date fecha_vencimiento, int codigo, Persona persona) {
        this.numero = numero;
        this.fecha_vencimiento = fecha_vencimiento;
        this.codigo = codigo;
        this.persona = persona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Credencial{" + "numero=" + numero + ", fecha_vencimiento=" + fecha_vencimiento + ", codigo=" + codigo + ", persona=" + persona + '}';
    }
    
    public void imprimir(){
        System.out.println("NUMERO: " + numero);
        System.out.println("FECHA DE VENCIMIENTO: " + new SimpleDateFormat("d-M-y").format(fecha_vencimiento));
        System.out.println("CODIGO: " +  codigo);
        //modo 1 para llamar atributos de una clase e imprimirlas:
        //System.out.println("PERSONA: " + persona);
        //System.out.println("NOMBRE PERSONA: " + persona.getNombre());
        //System.out.println("RUT" + persona.getRut());
        
        //modo 2: para llamar a todos
        
        persona.imprimir();
    }
    
}
