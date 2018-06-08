package abelpinheiro.github.io.generalknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public ProgressBar currentProgressBar;
    public int currentQuestion = 0;
    private int currentQuizz = 0;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scienceButtonPressed(View view){
        currentQuestion += 1;
        setContentView(R.layout.radiobox_questions);
        title = findViewById(R.id.question_title);
        title.setText(getString(R.string.question1_science)); //DEVIA SETAR O TITULO PARA A PRIMEIRA PERGUNTA
    }

    public void animeButtonPressed(View view){
    }
    public void computerScienceButtonPressed(View view){
    }
    public void classicalMusicButtonPressed(View view){
    }

    public void nextButtonPressed(View view){
        switch (currentQuestion){
            case 1:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 2, RADIOBOX DA 2, PROGRESSBAR DA 2
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question2_science));
                currentQuestion += 1;
                break;

            case 2:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 3, RADIOBOX DA 3, PROGRESSBAR DA 3
                currentQuestion += 1;
                break;

            case 3:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 4, EDITTEXT DA 4, PROGRESSBAR DA 4
                currentQuestion += 1;
                break;

            case 4:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 5, EDITTEXT DA 5, PROGRESSBAR DA 5
                currentQuestion += 1;
                break;

            case 5:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 6, EDITTEXT DA 6, PROGRESSBAR DA 6
                currentQuestion += 1;
                break;

            case 6:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 7, CHECKBOX DA 7, PROGRESSBAR DA 7
                currentQuestion += 1;
                break;

            case 7:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 8, CHECKBOX DA 8, PROGRESSBAR DA 8
                currentQuestion += 1;
                break;

            case 8:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 9, CHECKBOX DA 9, PROGRESSBAR DA 9
                currentQuestion += 1;
                break;

            case 9:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 10, RADIOBOX DA 10, PROGRESSBAR DA 10
                // SETAR BOTÃO QUE TERMINA E EXECUTAR METODO PRA GERAR RESULTADO EM TOAST
                currentQuestion += 1;
                break;

            default: break;
        }
    }
}