package br.com.nicolasdimer.demo.service;

import java.util.List;

import br.com.nicolasdimer.demo.model.Endereco;
import br.com.nicolasdimer.demo.model.Restaurante;
import br.com.nicolasdimer.demo.repository.RestauranteRepository;

public class RestauranteService {
    Endereco endereco;

    private RestauranteRepository repository = new RestauranteRepository();

    public List<Restaurante> findAll(){
        return repository.findAll();
    }

    public Restaurante save (Restaurante restaurante) throws IllegalArgumentException{
        if (restaurante.getNome_restaurante() == null || restaurante.getNome_restaurante().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do RESTAURANTE não pode ficar em branco");
        }
        
        if (restaurante.getPlaceEndereco() == null || restaurante.getPlaceEndereco() != endereco.getRua() +", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + ", " + endereco.getEstado()) {
            throw new IllegalArgumentException("O ENDEREÇO inserido não é válido");
        }

        if (restaurante.getTelefone_restaurante() == null || restaurante.getTelefone_restaurante() != restaurante.getTelefone_restaurante()){
            throw new IllegalArgumentException("O TELEFONE inserido não é válido!");
        }

        return repository.save(restaurante);
    }

    public Restaurante edit (Restaurante restaurante){
        if (restaurante.getNome_restaurante() == null || restaurante.getNome_restaurante().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do RESTAURANTE não pode ficar em branco");
        }
        
        if (restaurante.getPlaceEndereco() == null || restaurante.getPlaceEndereco() != restaurante.getPlaceEndereco) {
            throw new IllegalArgumentException("O ENDEREÇO inserido não é válido");
        }
        if (restaurante.getTelefone_restaurante() == null || restaurante.validPhone() == false) {
            throw new IllegalArgumentException("O NÚMERO inserido não é válido" );
        }

        return repository.edit(restaurante);
    }

    public void delete(String nome_restaurante){
        if (nome_restaurante == null || nome_restaurante.trim().isEmpty()){
            throw new IllegalArgumentException("O NOME DO RESTAURANTE não pode ficar em branco");
        }

        repository.delete(nome_restaurante);
    }
}
