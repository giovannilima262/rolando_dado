package ucsal.edu.br.busucsal;


import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

class AdapterRoteiro extends BaseAdapter {

    private final List<Roteiro> roteiros;
    private final Activity act;

    public AdapterRoteiro(List<Roteiro> roteiros, Activity act) {
        this.roteiros = roteiros;
        this.act = act;
    }

    @Override
    public int getCount() {
        return roteiros.size();
    }

    @Override
    public Object getItem(int position) {
        return roteiros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater()
                .inflate(R.layout.activity_roteiro, parent, false);
        Roteiro roteiro = roteiros.get(position);

        //pegando as referências das Views
        TextView nome = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_nome);
        TextView descricao = (TextView)
                view.findViewById(R.id.lista_curso_personalizada_descricao);

        //populando as Views
        nome.setText(roteiro.getHorario());
        descricao.setText(roteiro.getDescricao());

        return view;
    }
}