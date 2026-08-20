/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package con.mycompany.bonus21abr;

/**
 *
 * @author a17x_
 */
public class Camion extends Vehiculo{
    private static int valorPeaje = 5000;
    private int numEjes;

    public Camion(String placa, int numEjes) {
        super(placa);
        this.numEjes = numEjes;
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Camion.valorPeaje = valorPeaje;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    public void imprimir(){
        System.out.println("Placa: "+super.getPlaca());
        System.out.println("Numero de ejes: "+numEjes);
        System.out.println("Valor peaje: "+valorPeaje*getNumEjes());
    }
}
   
