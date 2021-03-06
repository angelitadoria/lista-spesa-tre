package it.iad.jpademo.service.impl;

import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.repository.ListaRepository;
import it.iad.jpademo.service.ListaSpesaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaSpesaServiceImpl implements ListaSpesaService {

    @Autowired
    ListaRepository listaRepository;

    @Override
    public List<Prodotto> add(Prodotto prodotto) {
        listaRepository.save(prodotto);
        return displayList();
    }

    @Override
    public List <Prodotto> removeAll() {
        listaRepository.deleteAllInBatch();
        return displayList();
    }

    @Override
    public List<Prodotto> displayList() {
        return listaRepository.findAll();
    }

    @Override
    public List<Prodotto> remove(int id) {
        listaRepository.deleteById(id);
        return displayList();
    }
}
