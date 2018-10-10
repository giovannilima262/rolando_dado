package ucsal.edu.br.busucsal;

import java.util.List;

public enum EnumRoteiro {
    ROTEIRO_1(1, "Roteiro 1"),
    ROTEIRO_2(2, "Roteiro 2"),
    ROTEIRO_3(3, "Roteiro 3"),
    ROTEIRO_4(4, "Roteiro 4"),
    ROTEIRO_5(5, "Roteiro 5");

    private int codigo;
    private String descricao;

    EnumRoteiro(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao(int cod){
        for (EnumRoteiro rot:values()) {
            if(rot.codigo == cod){
                return rot.descricao;
            }
        }
        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override public String toString(){
        return descricao;
    }
}
