package it.iad.dto;

import it.iad.jpademo.model.Prodotto;

public class DtoProdotto {

    private Prodotto prodotto;

    public DtoProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public DtoProdotto() {
    }
    
    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }
}
