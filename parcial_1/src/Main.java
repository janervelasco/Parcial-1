import javax.swing.*;

public class Main {
    private static empresa miEmpresa;
    public static void main(String[] args) {

         miEmpresa = new empresa("DevPlus S.A.S", "900123456", "Calle 10", "1234567", "www.devplus.com");

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
    private static void registrarCliente() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento: ");
        String nombreCompleto = JOptionPane.showInputDialog("ingrese el nombre completo: ");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono: ");
        String email = JOptionPane.showInputDialog("ingrese su email del cliente");
        String pais = JOptionPane.showInputDialog("ingrese pais de procedencia del cliente");

        boolean resultado = miEmpresa.agregarCliente(documento, nombreCompleto, telefono, email,
                pais);
        if (resultado) {
            JOptionPane.showMessageDialog(null,"registro exitoso");
        }
        else {
            JOptionPane.showMessageDialog(null, "no se hizo el registro");
       }
    }

}
