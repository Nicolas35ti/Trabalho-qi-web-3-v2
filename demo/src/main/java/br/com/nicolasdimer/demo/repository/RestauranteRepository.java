package br.com.nicolasdimer.demo.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.nicolasdimer.demo.model.Endereco;
import br.com.nicolasdimer.demo.model.Restaurante;

public class RestauranteRepository {
    private static List<Restaurante> places = new ArrayList<>();

    public List<Restaurante> findAll(){
        return places;
    }

    public Restaurante save (Restaurante restaurante){
        places.add(restaurante);
        return restaurante;
    }

    public Restaurante edit(Restaurante restaurante){
        for (int i = 0; i < places.size(); i++){
            Restaurante element = places.get(i);
            if(element.getNome_restaurante().equals(restaurante.getNome_restaurante())){
                places.set(i , restaurante);
            }
        }
        return restaurante;
    }

    public void delete(String nome_restaurante) {
        for (int i = 0; i < places.size(); i++) {
            Restaurante element = places.get(i);
            if (element.getNome_restaurante().equals(nome_restaurante)){
                places.remove(i);
            }
        }
    }
}
