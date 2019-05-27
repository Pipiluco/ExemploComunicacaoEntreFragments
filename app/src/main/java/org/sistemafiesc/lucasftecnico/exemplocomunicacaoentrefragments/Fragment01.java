package org.sistemafiesc.lucasftecnico.exemplocomunicacaoentrefragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Fragment01 extends Fragment implements AdapterView.OnItemClickListener {
    private ListView lvCarros;
    private Comunicador comunicador;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        comunicador = (Comunicador) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment01, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        lvCarros = (ListView) getActivity().findViewById(R.id.lvCarros);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.titulos, android.R.layout.simple_list_item_1);
        lvCarros.setAdapter(adapter);
        lvCarros.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        comunicador.responde(position);
    }
}
