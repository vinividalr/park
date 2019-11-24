package br.com.hackathonfc.park.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hackathonfc.park.domain.Estacionamento;
import br.com.hackathonfc.park.services.EstacionamentoService;

@RestController
@RequestMapping(value="/Estacionamentos")
public class EstacionamentoResource {
	
	@Autowired
	private EstacionamentoService service;

	@GetMapping
	public ResponseEntity<List<Estacionamento>> findAll() {	
		List<Estacionamento> lista = service.findAll();		
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Estacionamento> findById(@PathVariable Integer id) {	
		Estacionamento obj = service.findById(id);		
		return ResponseEntity.ok().body(obj);
	}
}
