package Clases;

import java.util.List;

public interface CocheCrud {
     void save(Coche c);
     List<Coche> findAll();
     void delete(Coche c);

}
