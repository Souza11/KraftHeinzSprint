package KraftHeinzVasco.Sprint.domain.proposta.proposta;

public record DadosDetalhamentoProposta(Long id, String nomeusuario, Estado estado, Tipoesg tipoesg, String mensagemproposta) {

    public DadosDetalhamentoProposta(Proposta proposta){
        this(proposta.getId(), proposta.getNomeusuario(), proposta.getEstado(), proposta.getTipoesg(), proposta.getMensagemproposta());

    }

}
