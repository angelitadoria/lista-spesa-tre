package it.iad.jpademo.controller;

import it.iad.dto.DtoProdotto;
import it.iad.jpademo.model.Prodotto;
import it.iad.jpademo.service.ListaSpesaService;
import java.util.ArrayList;
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
    public DtoProdotto add(@RequestBody DtoProdotto dtoProdotto) {
        System.out.println("Siamo nel controller add");
        Prodotto prodotto = new Prodotto(dtoProdotto.getProdotto());
        ArrayList lista = (ArrayList) listaSpesaService.add(prodotto);
        lista.forEach(d -> System.out.println(d.toString()));

        return new DtoProdotto(dtoProdotto.getProdotto());

    }

    @RequestMapping("/removeAll")
    public void removeAll() {
        System.out.println("Siamo nel rimuovi");
        listaSpesaService.removeAll();
    }

}
