package model;

public class Categoria {
    private int id_categoria;
    private String nome;
    private String tamanho;
    private String embalegem;

    public Categoria(int id, String nomeCategoria, String tamanho1, String embalagem) {
    }

    public Categoria(String nome, String tamanho, String embalegem) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalegem = embalegem;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setEmbalegem(String embalegem) {
        this.embalegem = embalegem;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getEmbalegem() {
        return embalegem;
    }

    @Override
    public String toString() {
        return "Nome: " + nome 
               + "Tamanho: " + tamanho 
               + "Embalegem: " + embalegem;
    }
    
    
}
