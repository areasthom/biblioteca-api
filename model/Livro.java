package com.thom.biblioteca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro
{
    private Long id;
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private boolean disponivel;
}
