package it.iad.jpademo.controller;

import it.iad.dto.DtoList;
import it.iad.dto.DtoProdotto;
import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.service.ListaSpesaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ListaSpesaController {

    @Autowired
    private ListaSpesaService listaSpesaService;

    @RequestMapping("/add")
    @ResponseBody
    public DtoList add(@RequestBody DtoProdotto dtoProdotto) {
        System.out.println("Aggiunto nuovo prodotto");
        Prodotto prodotto = dtoProdotto.getProdotto();
        List<Prodotto> lista = listaSpesaService.add(prodotto);
        if (lista != null) {
            lista.forEach(d -> System.out.println(d.toString()));
        }
        return new DtoList(lista);
    }

    @RequestMapping("/removeAll")
    public DtoList removeAll() {
        System.out.println("Lista rimossa");
        return new DtoList(listaSpesaService.removeAll());
    }

    @RequestMapping("/displayList")
    public DtoList displayList() {
        return new DtoList(listaSpesaService.displayList());
    }
    
    @RequestMapping("/remove")
    @ResponseBody
    public DtoList remove(@RequestBody DtoProdotto dtoProdotto) {
        System.out.println("Rimosso articolo");
        return new DtoList(listaSpesaService.remove(dtoProdotto.getProdotto().getId()));
    }
}
