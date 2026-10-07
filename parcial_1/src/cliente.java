import javax.swing.*;

public class cliente {

    private String documento;
    private String nombreCompleto;
    private String telefono;
    private String email;
    private String paisProcedencia;

    private proyecto[] listProyectos;

    public cliente(String documento, String nombreCompleto, String telefono, String email,
                   String paisProcedencia) {

        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
        this.paisProcedencia = paisProcedencia;

        listProyectos = new proyecto[10];
    }

    public boolean asignarProyectoCliente(proyecto proyectoEncontrado) {
        for (int i = 0; i < listProyectos.length; i++) {
            if (listProyectos[i] == null) {
                listProyectos[i] = proyectoEncontrado;
                return true;
            }
        }
        return false;
    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public proyecto[] getListProyectos() {
        return listProyectos;
    }

    public void setListProyectos(proyecto[] listProyectos) {
        this.listProyectos = listProyectos;
    }

}