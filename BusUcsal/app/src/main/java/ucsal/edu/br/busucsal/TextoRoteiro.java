package ucsal.edu.br.busucsal;

import java.util.ArrayList;
import java.util.List;

public class TextoRoteiro {

    private static String ROTEIRO_1 = "Única Parada - Av. Paralela (sentido aeroporto) - Ponto do estádio do Pituaçu.";
    private static String ROTEIRO_2 = "1ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
            "2ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Condomínio Greenville;\n" +
            "3ª Parada - Terminal Pituaçu - 1º andar, Plataforma E, 17.\n";
    private static String ROTEIRO_3 = "1ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
            "2ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
            "3ª Parada - Av. Paralela (sentido aeroporto) - Ponto Estádio de Pituaçu.\n";

    private static String ROTEIRO_4 = "1ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
            "2ª Parada - Av. Paralela (sentido centro) - Ponto do estádio Pituaçu;\n" +
            "3ª Parada - Av. Paralela (sentido centro) - Ponto Extra Paralela;\n" +
            "4ª Parada - Av. Paralela (sentido aeroporto) - Ponto Extra Paralela;\n" +
            "5ª Parada - Avenida Luís Viana Filho (sentido aeroporto) - Ponto estádio de Pituaçu.\n";

    private static String ROTEIRO_5 = "1ª Parada - Av. Pinto de Aguiar (sentido orla) - Ponto do Greenville;\n" +
            "2ª Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
            "3ª Parada - Av. Paralela (sentido aeroporto) - Ponto Wall Street Empresarial;\n" +
            "4ª Parada - Av Paralela (sentido aeroporto) - Ponto Posto Menor Preço;\n" +
            "5ª Parada - Av Paralela (sentido centro) - Ponto em frente ao Colégio Villa;\n" +
            "6ª Parada - Av Paralela (sentido centro) - Ponto próximo a entrada do Flamboyant;\n" +
            "7ª Parada - Av Paralela (sentido centro) - Ponto em frente ao Condomínio Brisas;\n" +
            "8ª Parada - Av Paralela (sentido centro) - Ponto Estação de Metrô Pituaçu;\n" +
            "9ª Parada - Av Paralela (sentido centro) - Ponto Extra Paralela;\n" +
            "10ª Parada - Av Paralela (sentido aeroporto) - Ponto Extra Paralela;\n" +
            "11ª Parada - Av Paralela (sentido aeroporto) - Ponto Estádio de Pituaçu.\n";

    public static List<Roteiro> filtroRoteiros(Integer roteiro){
        List<Roteiro> roteiros = new ArrayList<>();
        if(roteiro.equals(1)){
            roteiros.addAll(criarRoteiro1());
        }else if(roteiro.equals(2)){
            roteiros.addAll(criarRoteiro2());
        }else if(roteiro.equals(3)){
            roteiros.addAll(criarRoteiro3());
        }else if(roteiro.equals(4)){
            roteiros.addAll(criarRoteiro4());
        }else if(roteiro.equals(5)){
            roteiros.addAll(criarRoteiro5());
        }

        return roteiros;

    }

    private static List<Roteiro>  criarRoteiro5() {
        List<Roteiro> roteiros = new ArrayList<>();

        roteiros.add(new Roteiro(5, "10h30", ROTEIRO_5, false));
        roteiros.add(new Roteiro(5, "12h45", ROTEIRO_5, false));
        roteiros.add(new Roteiro(5, "21h40", ROTEIRO_5, false));

        return roteiros;
    }

    private static List<Roteiro>  criarRoteiro4() {
        List<Roteiro> roteiros = new ArrayList<>();

        roteiros.add(new Roteiro(4, "13h30", ROTEIRO_4, false));
        roteiros.add(new Roteiro(4, "22h15", ROTEIRO_4, false));
        roteiros.add(new Roteiro(4, "9h50", ROTEIRO_4, true));
        roteiros.add(new Roteiro(4, "12h30", ROTEIRO_4, true));

        return roteiros;
    }

    private static List<Roteiro>  criarRoteiro3() {
        List<Roteiro> roteiros = new ArrayList<>();

        roteiros.add(new Roteiro(3, "20h30", ROTEIRO_3, false));
        roteiros.add(new Roteiro(3, "20h55", ROTEIRO_3, false));
        roteiros.add(new Roteiro(3, "21h20", ROTEIRO_3, false));

        return roteiros;
    }

    private static List<Roteiro>  criarRoteiro2() {
        List<Roteiro> roteiros = new ArrayList<>();

        roteiros.add(new Roteiro(2, "9h30", ROTEIRO_2, false));
        roteiros.add(new Roteiro(2, "10h00", ROTEIRO_2, false));
        roteiros.add(new Roteiro(2, "11h15", ROTEIRO_2, false));
        roteiros.add(new Roteiro(2, "11h45", ROTEIRO_2, false));
        roteiros.add(new Roteiro(2, "12h15", ROTEIRO_2, false));
        roteiros.add(new Roteiro(2, "8h25", ROTEIRO_2, true));
        roteiros.add(new Roteiro(2, "11h30", ROTEIRO_2, true));

        return roteiros;
    }

    private static List<Roteiro>  criarRoteiro1() {
        List<Roteiro> roteiros = new ArrayList<>();

        roteiros.add(new Roteiro(1, "6h30", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "6h45", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "7h00", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "7h20", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "7h40", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "17h10", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "18h20", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "18h40", ROTEIRO_1, false));
        roteiros.add(new Roteiro(1, "6h50", ROTEIRO_1, true));

        return roteiros;
    }
}
