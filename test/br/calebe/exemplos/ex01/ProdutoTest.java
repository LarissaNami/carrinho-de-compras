package br.calebe.exemplos.ex01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41414268
 */
public class ProdutoTest {

    private Produto produto;
    
    public ProdutoTest(){
        
    }

    @Test
    public void getPrecoTest(){
        Produto preco = new Produto("livro", 15.00);
        assertEquals(15.00, preco.getPreco(), 0);
    }
    
//    @Test
//    public void criandoProdutoTest(){
//        Produto novoProduto = new Produto("halls", 1.00);
//        assertEquals("halls", novoProduto.equals(produto));
//        
//    }
    
}
