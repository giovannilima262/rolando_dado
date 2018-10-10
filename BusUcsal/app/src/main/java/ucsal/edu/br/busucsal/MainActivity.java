package ucsal.edu.br.busucsal;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Roteiro> roteiros;
    AdapterRoteiro adapter;
    Spinner dropdown;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roteiros = TextoRoteiro.filtroRoteiros(1);

        ListView listaRoteiros = (ListView) findViewById(R.id.listview);
        activity = this;
        adapter = new AdapterRoteiro(roteiros, this);
        dropdown = findViewById(R.id.spinner);

        listaRoteiros.setAdapter(adapter);
        Spinner dropdown = findViewById(R.id.spinner);
        ArrayAdapter<EnumRoteiro> adapters = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, EnumRoteiro.values());
        dropdown.setAdapter(adapters);
        spinnerCampo();
    }

    private void spinnerCampo() {
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                roteiros = TextoRoteiro.filtroRoteiros(position + 1);
                ListView listaRoteiros = (ListView) findViewById(R.id.listview);
                adapter = new AdapterRoteiro(roteiros, activity);
                listaRoteiros.setAdapter(adapter);
                onCheckboxFimSemana(findViewById(R.id.checkbox_fim_semana));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onCheckboxFimSemana(View view){
        boolean checked = ((CheckBox) view).isChecked();
        List<Roteiro> roteirosNovos = new ArrayList<>();
        for (Roteiro roteiro : roteiros) {
            if(roteiro.getFimSemana() == checked){
                roteirosNovos.add(roteiro);
            }
        }
        ListView listaRoteiros = (ListView) findViewById(R.id.listview);
        adapter = new AdapterRoteiro(roteirosNovos, activity);
        listaRoteiros.setAdapter(adapter);
    }

}
