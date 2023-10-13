package med.voll.api.pacientes;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.enderecopaciente.DadosEnderecoPaciente;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        @Valid
        DadosEnderecoPaciente dadosEndereco) {
}
