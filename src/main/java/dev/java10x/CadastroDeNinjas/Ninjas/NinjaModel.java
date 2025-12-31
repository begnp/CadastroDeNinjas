package dev.java10x.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Necessita de baixar outra entidade, a Spring Data JPA, para uma classe ser uma entidade no banco de dados
// Entity transforma uma classe me entidade do banco de dados
@Entity
@Table(name = "tb_cadastro") // Definindo o nome da tabela, por padrao as tabelas não terão nome
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    // @ManyToOne - Muitos ninjas para uma única missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key (chave estrangeira)
    private MissoesModel missoes;

}
