package com.thom.biblioteca.service;

import com.thom.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class LivroService
{
    private List<Livro> livros = new ArrayList<>();
    private Long proximoId = 1L;
    
    // LISTA TODOS OS LIVROS
    public List<Livro> listarLivros()
    {
        return livros;
    }
    
    // ENCONTRA UM LIVRO
    public Livro buscarPorId(Long id)
    {
        for(Livro livro : livros)
        {
            if(livro.getId().equals(id))
            {
                return livro;
            }
        }        
        return null;        
    }
    
    // CRIA LIVRO E ADICIONA ID AUTOMATICAMENTE
    public Livro adicionarLivro(Livro livro)
    {
        for(Livro l : livros)
        {
            if(l.getTitulo().equalsIgnoreCase(livro.getTitulo()) && l.getAutor().equalsIgnoreCase(livro.getAutor()))
            {
                return null;
            }
        }
        
        livro.setId(proximoId);
        proximoId++;
        
        livros.add(livro);
        return livro;
    }
    
    // ATUALIZA INFORMAÇÕES DOS LIVROS 
    public Livro atualizarLivro(Long id, Livro livroAtualizado)
    {
        Livro livro = buscarPorId(id);
        
        if(livro != null)
        {
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutor(livroAtualizado.getAutor());
            livro.setAno(livroAtualizado.getAno());
            livro.setGenero(livroAtualizado.getGenero());
            livro.setDisponivel(livroAtualizado.isDisponivel());
            
            return livro;
        }
        
        return null;
    }
    
    // REMOVE LIVRO DA LISTA
    public boolean removerLivro(Long id)
    {
        Livro livro = buscarPorId(id);
        
        if(livro != null)
        {
            livros.remove(livro);
            return true;
        }
        
        return false;
    }
    
}
