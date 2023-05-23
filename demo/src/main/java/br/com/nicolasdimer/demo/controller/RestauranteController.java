package br.com.nicolasdimer.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.nicolasdimer.demo.model.Restaurante;
import br.com.nicolasdimer.demo.service.RestauranteService;


@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {
    private RestauranteService service = new RestauranteService();

    @GetMapping
    public List<Restaurante>findAll(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Restaurante restaurante) {
        try {
            return new ResponseEntity<>(service.save(restaurante), HttpStatus.CREATED);
        } catch (IllegalArgumentException ia) {
            return new ResponseEntity<>(ia.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Object> edit(@RequestBody Restaurante restaurante) {
        try {
            return new ResponseEntity<>(service.edit(restaurante), HttpStatus.CREATED);
        } catch (IllegalArgumentException ia) {
            return new ResponseEntity<>(ia.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public void delete(@RequestParam String nome_restaurante){
        try {
            service.delete(nome_restaurante);
        } catch (Exception e){

        }
    }
}