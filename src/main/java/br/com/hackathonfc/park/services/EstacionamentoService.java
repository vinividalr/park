package br.com.hackathonfc.park.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hackathonfc.park.domain.Estacionamento;
import br.com.hackathonfc.park.repositories.EstacionamentoRepository;

@Service
public class EstacionamentoService {
	
	@Autowired
	private EstacionamentoRepository repository;
	
	public List<Estacionamento> findAll() {
		return repository.findAll();
	}
	
	public Estacionamento findById(Integer id) {
		Optional<Estacionamento> obj = repository.findById(id);
		return obj.get();
	}
}
