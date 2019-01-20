package com.stumpf.als.baskete;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private int pontuacao_a = 0;
    private int pontuacao_b = 0;
    Button button_3_a = findViewById(R.id.tres_pontos_a);
    Button button_2_a = findViewById(R.id.dois_pontos_a);
    Button button_livre_a = findViewById(R.id.tiro_livre_a);
    Button button_3_b = findViewById(R.id.tres_pontos_b);
    Button button_2_b = findViewById(R.id.dois_pontos_b);
    Button button_livre_b = findViewById(R.id.tiro_livre_b);
    Button reiniciar_partida = findViewById(R.id.reiniciar);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_3_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosA();
            }
        });
        button_2_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosA();
            }
        });
        button_livre_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontosA();
            }
        });
        button_3_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosB();
            }
        });
        button_2_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosB();
            }
        });
        button_livre_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontosB();
            }
        });
        reiniciar_partida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarPartida();
            }
        });
    }
    public void reiniciarPartida(){
        pontuacao_a = 0;
        pontuacao_b = 0;
        placarTimeA(pontuacao_a);
        placarTimeB(pontuacao_b);
    }
    public void placarTimeA(int pontuacao){
        TextView placarTimeA = findViewById(R.id.time_a);
        placarTimeA.setText(String.valueOf(pontuacao));
    }
    public void placarTimeB(int pontuacao){
        TextView placarTimeB = findViewById(R.id.time_b);
        placarTimeB.setText(String.valueOf(pontuacao));
    }
    public void addTresPontosA(){
        pontuacao_a = pontuacao_a + 3;
        placarTimeA(pontuacao_a);
    }
    public void addDoisPontosA(){
        pontuacao_a = pontuacao_a + 2;
        placarTimeA(pontuacao_a);
    }
    public void addUmPontosA(){
        pontuacao_a = pontuacao_a + 1;
        placarTimeA(pontuacao_a);
    }
    public void addTresPontosB(){
        pontuacao_b = pontuacao_b + 3;
        placarTimeB(pontuacao_b);
    }
    public void addDoisPontosB(){
        pontuacao_b = pontuacao_b + 2;
        placarTimeB(pontuacao_b);
    }
    public void addUmPontosB(){
        pontuacao_b = pontuacao_b + 1;
        placarTimeB(pontuacao_b);
    }
}