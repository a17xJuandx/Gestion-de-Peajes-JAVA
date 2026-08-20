/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package con.mycompany.bonus21abr;

/**
 *
 * @author a17x_
 */
public class Carro extends Vehiculo{
    private static int valorPeaje = 10000;

    public Carro(String placa) {
        super(placa);
        
    }
    public static int getValorPeaje() {
        return valorPeaje;
    }
    public static void setValorPeaje(int valorPeaje) {
        Carro.valorPeaje = valorPeaje;
    }
    public void imprimir(){
        System.out.println("Placa: "+super.getPlaca());
        System.out.println("Valor peaje: "+valorPeaje);
    }
   
}
