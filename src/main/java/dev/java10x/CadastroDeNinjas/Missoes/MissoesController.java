package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

//localhost:8080/rota

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // Get - Enviar requisicao para mostrar missoes
    @GetMapping("/listar")
    public String listarMissoes() {
        return "Missoes listadas com sucesso";
    }

    // Post - Enviar requisicao para criar uma missao
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso";
    }

    // Put - Enviar requisicao para atualizar os dados de uma missao
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

    // Delete - Enviar requisicao para deletar uma missao
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada com sucesso";
    }

}
