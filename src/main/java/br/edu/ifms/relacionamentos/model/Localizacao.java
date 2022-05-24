package br.edu.ifms.relacionamentos.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Localizacao {

    private String estado;
    private String cep; 
    private String cidade;
}