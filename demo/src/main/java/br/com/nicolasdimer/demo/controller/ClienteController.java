package br.com.nicolasdimer.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.nicolasdimer.demo.model.Cliente;
import br.com.nicolasdimer.demo.service.ClienteService;

@RestController
@RequestMapping ("/api/clientes")
public class ClienteController {
    private ClienteService service = new ClienteService();

    @GetMapping
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Cliente cliente) {
        try {
            return new ResponseEntity<>(service.save(cliente) , HttpStatus.CREATED);
        } catch (IllegalArgumentException ia) {
            return new ResponseEntity<>(ia.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Object> edit(@RequestBody Cliente cliente) {
        try {
            return new ResponseEntity<>(service.edit(cliente) , HttpStatus.CREATED);
        } catch (IllegalArgumentException ia) {
            return new ResponseEntity<>(ia.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping
    public void delete(@RequestParam String nome_cliente , String sobrenome_cliente) {
        try {
            service.delete(nome_cliente , sobrenome_cliente);
        } catch (Exception e) {
            //Gerar um log de erro
        }
    }
}
