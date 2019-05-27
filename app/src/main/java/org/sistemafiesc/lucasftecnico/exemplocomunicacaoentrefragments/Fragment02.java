package org.sistemafiesc.lucasftecnico.exemplocomunicacaoentrefragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment02 extends Fragment {
    private TextView tvTexto;
    private Activity activity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment02, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvTexto = (TextView) activity.findViewById(R.id.tvTexto);
    }

    public void change(int data) {
        Resources res = getResources();
        String[] desc = res.getStringArray(R.array.descrip);
        tvTexto.setText(desc[data]);
    }

}
