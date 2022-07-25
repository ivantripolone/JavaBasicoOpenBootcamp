package clases;

public class SmartWacht extends SmartDivice {
    private double pulgadas;
    private String conectividad;
    public SmartWacht(String color, String marca, String modelo, double pulgadas, String conectividad)
    {
        super(color,marca,modelo);
        this.pulgadas = pulgadas;
        this.conectividad = conectividad;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }
}
