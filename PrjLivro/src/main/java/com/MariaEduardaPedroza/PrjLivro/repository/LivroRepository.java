package com.MariaEduardaPedroza.PrjLivro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MariaEduardaPedroza.PrjLivro.entities.Livro;
import com.senai.MariaEduardaPedrozaMartins.PrjGame.entities.Jogo;

public interface LivroRepository extends JpaRepository <Livro, Long>{

}
