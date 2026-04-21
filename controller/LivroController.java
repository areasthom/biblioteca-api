package com.thom.biblioteca.controller;

import com.thom.biblioteca.model.Livro;
import com.thom.biblioteca.service.LivroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController
{
    @Autowired
    private LivroService livroService;
    
    @GetMapping
    public List<Livro> listarLivros()
    {
        return livroService.listarLivros();
    }
    
    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Long id)
    {
        return livroService.buscarPorId(id);
    }
    
    @PostMapping
    public String adicionarLivro(@RequestBody Livro livro)
    {
        Livro novoLivro = livroService.adicionarLivro(livro);
        
        if(novoLivro == null)
        {
            return "Esse livro já está cadastrado.";
        }
        
        return "Livro cadastrado com sucesso!";
    }
    
    @PutMapping("/{id}")
    public Livro atualizarLivro(@PathVariable Long id, @RequestBody Livro livroAtualizado)
    {
        return livroService.atualizarLivro(id, livroAtualizado);
    }
    
    @DeleteMapping("/{id}")
    public String removerLivro(@PathVariable Long id)
    {
        boolean removido = livroService.removerLivro(id);
        
        if(removido)
        {
            return "Livro removido com sucesso!";
        }
        
        return "Livro não encontrado.";
    }

}
