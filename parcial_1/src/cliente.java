import javax.swing.*;

public class cliente(){

    private String documento;
    private String nombreCompleto;
    private String telefono;
    private String email;
    private String paisProcedencia;

    private proyecto[] listProyectos;

    public cliente(String documento, String nombreCompleto , String telefono , String email ,
                   String paisProcedencia){

        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
        this.paisProcedencia = paisProcedencia;

        listProyectos = new proyecto[10];
    }

    public String getDocumento() {return documento;}
    public void setDocumento(String documento) {return documento;}

    public String getNombreCompleto() {return nombreCompleto;}
    public void setNombreCompleto(String nombreCompleto) {return nombreCompleto;}

    public String getTelefono() {return Telefono;}
    public void setTelefono(String telefono) {return telefono;}

    
}