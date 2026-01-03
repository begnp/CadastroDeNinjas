package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Listar todas as missoes
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    // Listar missoes por id
    public MissoesModel listarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    // Adicionar missoes
    public MissoesModel criarMissoes(MissoesModel missoesModel) {
        return missoesRepository.save(missoesModel);
    }

    // Deletar missoes por id
    public void deletarMissao(Long id) {
        missoesRepository.deleteById(id);
    }

    // Alterar missoes por id
    public MissoesModel alterarMissaoPorId(Long id, MissoesModel missaoAlterada) {
        if (missoesRepository.existsById(id)) {
            missaoAlterada.setId(id);
            return missoesRepository.save(missaoAlterada);
        }
        return null;
    }

}
