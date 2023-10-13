package med.voll.api.enderecopaciente;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoPaciente {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;


    public EnderecoPaciente(DadosEnderecoPaciente dados){
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
        this.cep = dados.cep();

    }


    public void atualizarInformacoesPaciente(DadosEnderecoPaciente dadosEnderecoPaciente) {
        if (dadosEnderecoPaciente.logradouro() != null){
            this.logradouro = dadosEnderecoPaciente.logradouro();
        }
        if (dadosEnderecoPaciente.numero() != null){
            this.numero = dadosEnderecoPaciente.numero();
        }
        if (dadosEnderecoPaciente.complemento() != null){
            this.complemento = dadosEnderecoPaciente.complemento();
        }
        if (dadosEnderecoPaciente.bairro() != null){
            this.bairro = dadosEnderecoPaciente.bairro();
        }
        if (dadosEnderecoPaciente.cidade() != null){
            this.cidade = dadosEnderecoPaciente.cidade();
        }
        if (dadosEnderecoPaciente.uf() != null){
            this.uf = dadosEnderecoPaciente.uf();
        }
        if (dadosEnderecoPaciente.cep() != null){
            this.cep = dadosEnderecoPaciente.cep();
        }
    }
}

