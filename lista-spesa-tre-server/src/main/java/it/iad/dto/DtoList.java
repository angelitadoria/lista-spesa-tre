package it.iad.dto;

import it.iad.jpademo.model.Prodotto;
import java.util.List;

public class DtoList {

    List<Prodotto> prodotti;

    public DtoList() {
    }

    public DtoList(List prodotti) {
        this.prodotti = prodotti;
    }

    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }
}
