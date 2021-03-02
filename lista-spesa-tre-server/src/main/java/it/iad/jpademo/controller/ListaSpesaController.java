package it.iad.jpademo.controller;


import it.iad.jpademo.service.ListaSpesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ListaSpesaController {

    @Autowired
    private ListaSpesaService listaSpesaService;

    
    @RequestMapping("/add")
    public void add() {
        
    }
    
    @RequestMapping("/removeAll")
    public void removeAll(){}

}
