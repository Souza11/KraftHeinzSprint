package KraftHeinzVasco.Sprint.domain.proposta.proposta;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "propostas")
@Entity(name = "Proposta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeusuario;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Enumerated(EnumType.STRING)
    private Tipoesg tipoesg;

    private String mensagemproposta;

    public Proposta(DadosCadastroProposta dados){
        this.nomeusuario = dados.nomeusuario();
        this.estado = dados.estado();
        this.tipoesg = dados.tipoesg();
        this.mensagemproposta = dados.mensagemproposta();


    };





}
