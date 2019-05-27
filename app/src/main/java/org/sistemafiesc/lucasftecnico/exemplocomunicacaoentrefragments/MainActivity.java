package org.sistemafiesc.lucasftecnico.exemplocomunicacaoentrefragments;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Comunicador{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void responde(int posicao) {
        FragmentManager manager = getFragmentManager();
        Fragment02 fragment02 = (Fragment02) manager.findFragmentById(R.id.fragment02);
        fragment02.change(posicao);
    }
}
