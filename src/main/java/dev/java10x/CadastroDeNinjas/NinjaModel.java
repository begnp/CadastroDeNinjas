package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// Necessita de baixar outra entidade, a Spring Data JPA, para uma classe ser uma entidade no banco de dados
// Entity transforma uma classe me entidade do banco de dados
@Entity
@Table(name = "tb_cadastro") // Definindo o nome da tabela, por padrao as tabelas não terão nome
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
