import javax.swing.*;



public class Desarollador() {

    private String codigo;
    private String equipoTrabajo;
    private String nivel;
    private int maxProyectosSimultaneos;
    private double tarifaPorDia;
    private String estado;


    public Desarollador(String codigo, String equipoTrabajo, String nivel, int maxProyectosSimultaneos,
                        double tarifaPorDia, String estado) {
        this.codigo = codigo;
        this.equipoTrabajo = equipoTrabajo;
        this.nivel = nivel;
        this.maxProyectosSimultaneos = maxProyectosSimultaneos;
        this.tarifaPorDia = tarifaPorDia;
        this.estado = estado;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    public String getEquipoTrabajo() {
        return equipoTrabajo;
    }

    public void setEquipoTrabajo(String equipoTrabajo) {
        this.equipoTrabajo = equipoTrabajo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getMaxProyectosSimultaneos() {
        return maxProyectosSimultaneos;
    }

    public void setMaxProyectosSimultaneos(int maxProyectosSimultaneos) {
        this.maxProyectosSimultaneos = maxProyectosSimultaneos;
    }

    public double getTarifaPorDia() {
        return tarifaPorDia;
    }

    public void setTarifaPorDia(double tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

