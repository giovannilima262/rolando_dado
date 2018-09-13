package ucsal.edu.br.rolandodados;

import java.util.List;

public class Dado {

    private List<Lado> lados;

    public Dado(List<Lado> lados){
        this.lados = lados;
    }

    public List<Lado> getLados() {
        return lados;
    }
}
