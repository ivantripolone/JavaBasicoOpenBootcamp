package test;
import clases.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class DivicesTests {
    private SmartDivice unSmartDivice;
    private SmartPhone unSmartPhone;
    private SmartWacht unSmartWacht;

    @BeforeTest
    public void setupDiviceTests(){

        unSmartDivice = new SmartDivice();
        unSmartPhone = new SmartPhone("Azul", "Samsung", "S6", 3, "Android");
        unSmartWacht = new SmartWacht("Negro", "Xiaomi", "Mi Band 6",3.5, "Bluetooth");
    }

    public void unSmartDiviceSabeDeSusCaracteristicasBasicas(){
        unSmartDivice.setColor("rojo");
        unSmartDivice.setMarca("Motorola");
        unSmartDivice.setModelo("e6");

        assert unSmartDivice.getColor() == "rojo";
        assert unSmartDivice.getMarca() == "Motorola";
        assert unSmartDivice.getModelo() == "e6";

    }

    public void unSmartPhoneSabeCuantaRamTiene(){
       assert  unSmartPhone.getRam() == 3;
       unSmartPhone.setRam(4);
       assert  unSmartPhone.getRam() == 4;

    }

    public void unSmartPhoneSabeCualEsSuSO(){
        assert  unSmartPhone.getSistema() == "Android";
        unSmartPhone.setSistema("Ios");
        assert  unSmartPhone.getSistema() == "Ios";
    }

    public void unSmartWachtSabeCuantasPulgadasTiene(){
        assert  unSmartWacht.getPulgadas() == 3.5;
        unSmartWacht.setPulgadas(4.5);
        assert unSmartWacht.getPulgadas() == 4.5;
    }

    public void unSmartWachtSabeSuConectividad(){
        assert  unSmartWacht.getConectividad() == "Bluetooth";
        unSmartWacht.setConectividad("Bluetooth 3.0");
        assert  unSmartWacht.getConectividad() == "Bluetooth 3.0";
    }

}
