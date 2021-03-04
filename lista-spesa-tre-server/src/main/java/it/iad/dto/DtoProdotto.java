package it.iad.dto;

public class DtoProdotto {

    private String prodotto;
    
    private int id;

    public DtoProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    public DtoProdotto() {
    }
    
    public String getProdotto() {
        return prodotto;
    }

    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
