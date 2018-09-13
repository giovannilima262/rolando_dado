package ucsal.edu.br.rolandodados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dado;
    private Dado dadoEntity;
    private TextView pontos;
    private Integer pontosValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setLadosDado();
        pontos = findViewById(R.id.pontos);
        dado = this.findViewById(R.id.dado);
        pontosValor = 0;
    }

    private void setLadosDado() {
        List<Lado> lados = new ArrayList<>();
        lados.add(new Lado(R.drawable.dice1, 1));
        lados.add(new Lado(R.drawable.dice2, 2));
        lados.add(new Lado(R.drawable.dice3, 3));
        lados.add(new Lado(R.drawable.dice4, 4));
        lados.add(new Lado(R.drawable.dice5, 5));
        lados.add(new Lado(R.drawable.dice6, 6));
        dadoEntity = new Dado(lados);

    }

    public void rolarDado(View view) {
        Glide.with(this).load(R.drawable.rolando).asGif().into(dado);
    }

    private Integer pegarImagem(Integer i) {
        for(Lado lado: dadoEntity.getLados()){
            if(lado.getValor().equals(i+1)){
                pontosValor += lado.getValor();
                return lado.getId();
            }
        }
        return null;
    }

    public void pararDado(View view) {
        Random gerador = new Random();
        dado.setImageResource(pegarImagem(gerador.nextInt(6)));
        pontos.setText("Pontos: " + pontosValor);
    }

    public void reiniciarDado(View view) {
        dado.setImageResource(R.drawable.dice1);
        pontosValor = 0;
        pontos.setText("Pontos: " + pontosValor);
    }
}
