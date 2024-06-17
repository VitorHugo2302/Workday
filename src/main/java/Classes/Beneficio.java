package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * A classe Beneficio representa um benefício com um ID e um nome associado.
 * 
 * @author Vitor Hugo
 */
public class Beneficio {
    private int id;
    private String nome;

    /**
     * Construtor para criar um novo Beneficio com o ID e nome especificados.
     * 
     * @param id O ID do benefício.
     * @param nome O nome do benefício.
     */
    public Beneficio(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Obtém o ID do benefício.
     * 
     * @return O ID do benefício.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtém o nome do benefício.
     * 
     * @return O nome do benefício.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Converte o benefício em uma representação de string, retornando o nome do benefício.
     * 
     * @return O nome do benefício como string.
     */
    @Override
    public String toString() {
        return nome;
    }
}
