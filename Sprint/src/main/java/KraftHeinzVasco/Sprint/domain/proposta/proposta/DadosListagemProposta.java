package KraftHeinzVasco.Sprint.domain.proposta.proposta;

public record DadosListagemProposta(String nomeusuario, Estado estado, Tipoesg tipoesg, String mensagemproposta) {

    public DadosListagemProposta(Proposta proposta){
        this(proposta.getNomeusuario(), proposta.getEstado(), proposta.getTipoesg(), proposta.getMensagemproposta());
    }
}
