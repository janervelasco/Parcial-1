import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Creamos la instancia de la empresa con datos iniciales
        empresa miEmpresa = new empresa("DevPlus S.A.S", "900123456", "Calle 10", "1234567", "www.devplus.com");
int option = 0;
   do {
option = Integer.parseInt(JOptionPane.showInputDialog("Este es el menu de la empresa DevPlus" +
        "\n Seleccione una opcion: " +
        "\n 1. Registrar cliente." +
        "\n 2. Registar desarrollador." +
        "\n 3. Registrar proyecto." +
        "\n 4. Registrar servicio adicional." +
        "\n 5. Calcular ingresos totales." +
        "\n 0. Salir del sistema"));


        switch (option) {


        case 1:
registrarCliente();
               break;


                       case 2:
String mensaje = nuevaVeterinaria.mostrarListaMascotas();
               JOptionPane.showMessageDialog(null, mensaje);
               break;


                       case 3:
solicitarIdMascota();
               break;


                       case 4:
solicitarInformacionActualizarMascota();
               break;


                       case 5:
solicitarInformacionEliminarMascota();
               break;


                       case 0:
                       JOptionPane.showMessageDialog(null, "El programa finalizo");
               break;


default:
        JOptionPane.showMessageDialog(null, "La opcion no es valida");
               break;
                       }


                       } while (option != 0);
        }


//Registrar la informacion del cliente
private static void registrarCliente(){
    String documento = JOptionPane.showImputDialog("Ingrese el documento: ");
    String nombreCompleto = JOptionPane.showImputDialog("ingrese el nombre completo: ");
    String telefono = JOptionPane.showImputDialog("Ingrese el telefono: ");

