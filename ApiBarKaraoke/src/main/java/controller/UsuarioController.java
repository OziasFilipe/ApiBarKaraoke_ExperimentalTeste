package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.ModelDados;
import repostory.repostory;

@RestController
public class UsuarioController {
	
	  @Autowired
	    private repostory repository;

	    @GetMapping(path = "/api/usuario/{codigo}")
	    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
	        return repository.findById(codigo)
	                .map(record -> ResponseEntity.ok().body(record))
	                .orElse(ResponseEntity.notFound().build());
	    }

	    @PostMapping(path = "/api/usuario/salvar")
	    public ModelDados salvar(@RequestBody ModelDados usuario) {
	        return repository.save(usuario);
	    }

	}