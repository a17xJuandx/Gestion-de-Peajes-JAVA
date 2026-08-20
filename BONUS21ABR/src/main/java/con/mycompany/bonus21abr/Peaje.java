/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package con.mycompany.bonus21abr;

import java.util.ArrayList;

/**
 *
 * @author a17x_
 */
public class Peaje {
    private String nombre, ubicacion;
    private int totalCarros=0;
    private int totalMotos=0;
    private int totalCamiones=0;
    private int totalPeaje=0;
    public ArrayList<Vehiculo> vehiculos;

    public Peaje(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        vehiculos = new ArrayList();
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    public int calcularPeaje(Vehiculo vehiculo){
        if(vehiculo instanceof Carro){
            totalCarros++;
            totalPeaje += Carro.getValorPeaje();
            return Carro.getValorPeaje();
        }
        else if(vehiculo instanceof Moto){
            totalMotos++;
            totalPeaje += Moto.getValorPeaje();
            return Moto.getValorPeaje();
        }
        else if(vehiculo instanceof Camion){
            totalCamiones++;
            Camion camion = (Camion) vehiculo;
            totalPeaje += Camion.getValorPeaje() * camion.getNumEjes();
            return Camion.getValorPeaje()* camion.getNumEjes();
        
        }
        else{
            return -1;
        }
    }
    public void imprimir(){
        totalMotos=0;
        totalCarros=0;
        totalCamiones=0;
        for (int i =0; i<vehiculos.size();i++){
            if(vehiculos.get(i) instanceof Moto){
            totalMotos++;
            }
            else if(vehiculos.get(i) instanceof Carro){
            totalCarros++;
            }
            else if(vehiculos.get(i) instanceof Camion){
            totalCamiones++;
            }
        }
        System.out.println("Nombre peaje: " + nombre);
        System.out.println("Ubicacion peaje: "+ubicacion);
        System.out.println("Total Motos: "+totalMotos);
        System.out.println("Total Carros: "+totalCarros);
        System.out.println("Total Camiones: "+totalCamiones);
        int totalvehiculos = totalMotos+totalCarros+totalCamiones;
        System.out.println("Total vehiculos: "+totalvehiculos);
        System.out.println("Total peaje: "+totalPeaje);
                                                            
    }
     
        
                 
}
