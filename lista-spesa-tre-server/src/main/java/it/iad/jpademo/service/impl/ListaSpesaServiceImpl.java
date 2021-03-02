package it.iad.jpademo.service.impl;


import it.iad.jpademo.repository.PersonaRepository;
import it.iad.jpademo.service.ListaSpesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaSpesaServiceImpl implements ListaSpesaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public void add() {
       
    }
    
    @Override
    public void removeAll(){}
    
    
}
