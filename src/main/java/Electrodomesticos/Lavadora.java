/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electrodomesticos;

/**
 *
 * @author JoseManuel
 */
public class Lavadora extends Electrodomestico {
    
    private double precio;
    private boolean aguaCaliente;
    
    public Lavadora(String marca, double potencia) {
        super("Lavadora",marca,potencia);
        precio = 0;
        aguaCaliente = false;
    }
    
    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super("Lavadora",marca,potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "marca=" + marca + ", potencia=" + potencia +
                ", precio=" + precio + ", aguaCaliente=" + aguaCaliente + '}';
    }
    
    @Override
    public double getConsumo(int horas) {
        if(aguaCaliente) {
            return (potencia + potencia*0.20) * horas;
        } else {
            return potencia * horas;
        }
    }
    
}
