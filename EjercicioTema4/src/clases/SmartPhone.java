package clases;

public class SmartPhone extends SmartDivice {
    private double ram;
    private String sistema;
    public SmartPhone(String color, String marca, String modelo, double ram, String sistema) {
        super(color,marca,modelo);
        this.ram = ram;
        this.sistema = sistema;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
}
