package abelpinheiro.github.io.generalknowledge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scienceButtonPressed(View view){
        setContentView(R.layout.question_one);
    }

    public void nextButtonPressed(View view){
        //TODA VEZ QUE FOR PRESSIONADO, ELE IRÁ VERIFICAR O ATRIBUTO QUESTAOATUAL PARA VERIFICAR EM QUAL QUESTÃO SE ENCONTRA. A PARTIR DISSO ELE VAI SELECIONAR POR UM IF
        //QUAL LAYOUT IRÁ FAZER O SETCONTENTVIEW
    }
}