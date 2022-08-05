package Clases;

import java.util.ArrayList;
import java.util.List;

public class CocheCrudImpl implements CocheCrud {
    private List<Coche> list;

    public CocheCrudImpl() {
        this.list = new ArrayList<Coche>();
    }

    @Override
    public void save(Coche c) {
        list.add(c);
    }

    @Override
    public List<Coche> findAll() {
        return list;
    }

    @Override
    public void delete(Coche c) {
        list.remove(c);
    }
}
