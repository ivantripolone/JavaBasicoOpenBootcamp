package Tests;

import Clases.Coche;
import Clases.CocheCrud;
import Clases.CocheCrudImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class CocheCrudTestsCase {
    private CocheCrud cocheCrudImpl;
    private Coche unCoche;
    private Coche otroCoche;

    @BeforeTest
    public void setupCocheCrudTests(){
        cocheCrudImpl = new CocheCrudImpl();
        unCoche = new Coche("Fiat", "Uno", "2020");
        otroCoche = new Coche("Ford", "Falcon","1968");
    }

    public void siAgrego2CochesElNumeroDeCochesAumentaA2(){
        cocheCrudImpl.save(unCoche);
        cocheCrudImpl.save(otroCoche);
        int cantCochesGuardados = cocheCrudImpl.findAll().size();

        assert cantCochesGuardados == 2;

        cocheCrudImpl.delete(unCoche);
        cocheCrudImpl.delete(otroCoche);
    }

    public void siEliminoUnCocheElNumeroDeCochesDismiyeEn1(){
        cocheCrudImpl.save(unCoche);
        cocheCrudImpl.save(otroCoche);
        int cantCochesGuardados;
        cocheCrudImpl.delete(otroCoche);
        cantCochesGuardados = cocheCrudImpl.findAll().size();
        assert cantCochesGuardados == 1;
        assert cocheCrudImpl.findAll().get(0) == unCoche;
    }

}
