package KraftHeinzVasco.Sprint.domain.proposta.proposta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProposta(

        String nomeusuario,
        @NotNull Estado estado,
        @NotNull Tipoesg tipoesg,
        @NotBlank String mensagemproposta

) {
}
