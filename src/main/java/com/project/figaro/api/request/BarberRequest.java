package com.project.figaro.api.request;

import lombok.Data;

import java.sql.Blob;

@Data
public class BarberRequest {
    String nome;
    Integer idade;
    Blob foto;
    String logradouro;
}
