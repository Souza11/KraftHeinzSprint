package KraftHeinzVasco.Sprint.domain.proposta.proposta;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProposta(

         String nomeusuario,
         @NotNull(message = "...")
         Estado estado,
         @NotNull(message = "...")
         Tipoesg tipoesg,
         @NotBlank(message = "...")
         String mensagemproposta) { }
