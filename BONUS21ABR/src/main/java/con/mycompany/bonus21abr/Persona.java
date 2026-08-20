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
public class Persona {
    private String nombre;
    private String apellidos;
    private String numeroDocumento;
    private String fechaNacimiento;
    private ArrayList<Vehiculo> vehiculosAsignados;

   
    public Persona(String nombre, String apellidos, String numeroDocumento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.vehiculosAsignados = new ArrayList<>();
    }

  
    public void asignarVehiculo(Vehiculo vehiculo) {
        this.vehiculosAsignados.add(vehiculo);
        System.out.println("Vehiculo con placa " + vehiculo.getPlaca() + " asignado a " + this.nombre);
    }

 
    public void desasignarVehiculo(Vehiculo vehiculo) {
        if (vehiculosAsignados.contains(vehiculo)) {
            vehiculosAsignados.remove(vehiculo);
            System.out.println("Vehiculo removido con éxito.");
        } else {
            System.out.println("Error: La persona no tiene ese vehiculo asignado.");
        }
    }

    
    public void mostrarGastoTotalPeajes(Peaje peaje) {
        double totalGeneral = 0;
        System.out.println("Reporte de peajes para: " + this.nombre + " " + this.apellidos);
        
        for (Vehiculo v : vehiculosAsignados) {
            
            int costo = peaje.calcularPeaje(v);
            if (costo != -1) {
                System.out.println("Vehiculo [" + v.getPlaca() + "]: $" + costo);
                totalGeneral += costo;
            }
        }
        System.out.println("Total pagado por todos sus vehiculos: $" + totalGeneral);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Vehiculo> getVehiculosAsignados() {
        return vehiculosAsignados;
    }

    public void setVehiculosAsignados(ArrayList<Vehiculo> vehiculosAsignados) {
        this.vehiculosAsignados = vehiculosAsignados;
    }

    
   
}
