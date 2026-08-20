/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package con.mycompany.bonus21abr;

/**
 *
 * @author a17x_
 */
public class BONUS21ABR {

    public static void main(String[] args) {
        Peaje peaje = new Peaje("Don cangrejo","Fondo de Bikini");
        Carro carro1 = new Carro("RTS-784");
        Carro carro2 = new Carro("FHR-023");
        peaje.agregarVehiculo(carro2);
        peaje.calcularPeaje(carro2);
        Camion camion1 = new Camion("FGH-354",2);
        peaje.agregarVehiculo(camion1);
        peaje.calcularPeaje(camion1);
        Moto moto1 = new Moto("HFH-324");
        peaje.agregarVehiculo(moto1);
        peaje.calcularPeaje(moto1);
        peaje.imprimir();
        Peaje peaje2 = new Peaje("Balde de carnada","Fondo de Bikini");
        peaje2.agregarVehiculo(carro1);
        peaje2.calcularPeaje(carro1);
        peaje2.imprimir();
        Persona usuario = new Persona("Pedro", "Mancilla", "123456", "28/09/1978");
        usuario.asignarVehiculo(carro1);
        usuario.asignarVehiculo(carro2);
        usuario.mostrarGastoTotalPeajes(peaje);
    }
}
