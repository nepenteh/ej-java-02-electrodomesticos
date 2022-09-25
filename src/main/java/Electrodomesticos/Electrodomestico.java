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
public class Electrodomestico {
    protected String tipo;
    protected String marca;
    protected double potencia;

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + " kW" + '}';
    }
    
    public double getConsumo(int horas) {
        return potencia * horas;
    }
    
    public double getCosteConsumo(int horas, double costeHora) {
        return getConsumo(horas) * costeHora;
    }
    
}
