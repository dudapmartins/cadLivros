package com.MariaEduardaPedroza.PrjLivro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MariaEduardaPedroza.PrjLivro.entities.Livro;
import com.MariaEduardaPedroza.PrjLivro.repository.LivroRepository;





@Service
public class LivroService {
	
	
	private final LivroRepository livroRepository;
	@Autowired
		public LivroService(LivroRepository livroRepository) {
			this.livroRepository = livroRepository;
		}

		public Livro saveLivro(Livro livro) {
			return livroRepository.save(livro);
		}

		public Livro getLivroById(Long id) {
			return livroRepository.findById(id).orElse(null);

		}

		public List<Livro> getAllLivro() {
			return livroRepository.findAll();
		}

		public void deleteLivro(Long id) {
			livroRepository.deleteById(id);
		}

		
		public Livro updateLivro(Long id, Livro novoLivro) {
			Optional<Livro> livroOptional = livroRepository.findById(id);
			if (livroOptional.isPresent()) {
				Livro livroExistente = livroOptional.get();
				livroExistente.setIsbn(novoLivro.getIsbn());
				livroExistente.setDescricao(novoLivro.getDescricao());
				return livroRepository.save(livroExistente);
			} else {
				return null;
			}
		}




}
