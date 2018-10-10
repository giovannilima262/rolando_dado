package ucsal.edu.br.busucsal;

public class Roteiro {
    private Integer roteiro;
    private String horario;
    private String descricao;
    private Boolean fimSemana;

    public Roteiro(Integer roteiro, String horario, String descricao, Boolean fimSemana) {
        this.roteiro = roteiro;
        this.horario = horario;
        this.descricao = descricao;
        this.fimSemana = fimSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(Integer roteiro) {
        this.roteiro = roteiro;
    }

    public Boolean getFimSemana() {
        return fimSemana;
    }

    public void setFimSemana(Boolean fimSemana) {
        this.fimSemana = fimSemana;
    }
}
