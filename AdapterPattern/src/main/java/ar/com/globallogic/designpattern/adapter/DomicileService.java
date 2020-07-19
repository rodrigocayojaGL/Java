package ar.com.globallogic.designpattern.adapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DomicileService {
    private List<Domicile> list;

    public DomicileService(){
        this.list = new ArrayList<>();
    }

    public List<Domicile> getList() {
        return list;
    }

    public void add(Domicile elem){
        this.list.add(elem);
    }
}
