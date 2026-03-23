package model;  

public class Comida {
    
    private String nome; 
    private String tipo; 
    private int preco; // removido acento (boa prática em Java)

    public Comida(String nome, String tipo, int preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Comida() {
        this.nome = "Maça";
        this.tipo = "Fruta";
        this.preco = 6; 
    }

    public void saudacao() {
        System.out.println("Olá você quer, " + nome + "! Ela é uma " + tipo + " de " + preco + " Reais.");
    }

    public String getnome() {
        return nome;
    }

    public String gettipo() {
        return tipo;
    }

    public int getpreco() {
        return preco;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public void setpreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Comida [nome=" + nome + ", tipo=" + tipo + ", preco=" + preco + "]";
    }
}