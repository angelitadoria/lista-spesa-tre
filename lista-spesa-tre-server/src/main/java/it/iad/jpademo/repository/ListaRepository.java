package it.iad.jpademo.repository;

import it.iad.jpademo.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaRepository
        extends JpaRepository<Prodotto, Integer> {
}
