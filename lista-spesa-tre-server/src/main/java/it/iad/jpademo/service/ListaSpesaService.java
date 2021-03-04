package it.iad.jpademo.service;

import it.iad.jpademo.model.Prodotto;
import java.util.List;

public interface ListaSpesaService {

    public List<Prodotto> add(Prodotto prodotto);

    public List<Prodotto> removeAll();
    
    public List<Prodotto> displayList();
    
    public List<Prodotto> remove(int id);
}
