package abelpinheiro.github.io.generalknowledge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar currentProgressBar; //Barra de progresso do quiz
    public int currentQuestion = 0; //Verifica qual questão o quiz se encontra
    private int currentQuizz = 0; //Verifica qual quiz foi selecionado (EX: Ciência, Musica clássica..)
    public int currentScore = 0; //Score atual do jogador

    TextView title; //texto da pergunta

    //botões em formato radio button
    RadioButton optionA_RadioButton;
    RadioButton optionB_RadioButton;
    RadioButton optionC_RadioButton;
    RadioButton optionD_RadioButton;

    //caixas de seleção
    CheckBox optionA_CheckBox;
    CheckBox optionB_CheckBox;
    CheckBox optionC_CheckBox;
    CheckBox optionD_CheckBox;

    EditText answerView; //Edit text para receber as respostas digitadas

    String answer = ""; //String para realizar comparação com o  EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Pegar o layout de questões e executar o método pra iniciar a primeira questão
     *
     * currentQuestion é incrementado para indicar a questão atual do quiz
     * currentQuizz é incrementado para indicar QUAL quiz o jogador selecionou. No caso, ciência é 1.
     */
    public void scienceButtonPressed(View view){
        currentQuestion += 1;
        currentQuizz = 1;
        setContentView(R.layout.radiobox_questions);
        Button button = findViewById(R.id.next_question_button);
        button.setBackgroundColor(getResources().getColor(R.color.scienceColor));
        setQuestion1();
    }

    /**
     * Pegar o layout de questões e executar o método pra iniciar a primeira questão
     *
     * currentQuestion é incrementado para indicar a questão atual do quiz
     * currentQuizz é incrementado para indicar QUAL quiz o jogador selecionou. No caso, anime é 2.
     *
     * Método incompleto pois não foi criado este quiz ainda
     */
    public void animeButtonPressed(View view){
        currentQuestion += 1;
        currentQuizz = 2;
        setContentView(R.layout.radiobox_questions);
        setContentView(R.layout.radiobox_questions);
        Button button = findViewById(R.id.next_question_button);
        button.setBackgroundColor(getResources().getColor(R.color.animeColor));
        setQuestion1();
    }

    /**
     * Pegar o layout de questões e executar o método pra iniciar a primeira questão
     *
     * currentQuestion é incrementado para indicar a questão atual do quiz
     * currentQuizz é incrementado para indicar QUAL quiz o jogador selecionou.
     * No caso, ciências da computação é 3.
     *
     * Método incompleto pois não foi criado este quiz ainda
     */
    public void computerScienceButtonPressed(View view){
        currentQuestion += 1;
        currentQuizz = 3;
        setContentView(R.layout.radiobox_questions);
        setContentView(R.layout.radiobox_questions);
        Button button = findViewById(R.id.next_question_button);
        button.setBackgroundColor(getResources().getColor(R.color.computerScienceColor));
        setQuestion1();
    }

    /**
     * Pegar o layout de questões e executar o método pra iniciar a primeira questão
     *
     * currentQuestion é incrementado para indicar a questão atual do quiz
     * currentQuizz é incrementado para indicar QUAL quiz o jogador selecionou.
     * No caso, música clássica é 4.
     *
     * Método incompleto pois não foi criado este quiz ainda
     */
    public void classicalMusicButtonPressed(View view){
        currentQuestion += 1;
        currentQuizz = 4;
        setContentView(R.layout.radiobox_questions);
        setContentView(R.layout.radiobox_questions);
        Button button = findViewById(R.id.next_question_button);
        button.setBackgroundColor(getResources().getColor(R.color.classicalMusicColor));
        setQuestion1();
    }

    /**
    *
    * Recebe as views e seta as respectivas strings da questão 1.
    * Verifica por meio de um switch a primeira questão do quiz específico
    *
    * como não foi implementado os demais quizzes, o método só vai implementar
    * a primeira questão do primeiro quizz
    */
    public void setQuestion1(){
        switch (currentQuizz){
            case 1:
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question1_science));


                optionA_RadioButton = findViewById(R.id.option_1_radio_button);
                optionB_RadioButton = findViewById(R.id.option_2_radio_button);
                optionC_RadioButton = findViewById(R.id.option_3_radio_button);
                optionD_RadioButton = findViewById(R.id.option_4_radio_button);

                optionA_RadioButton.setText(getString(R.string.option1_question1_science));
                optionB_RadioButton.setText(getString(R.string.option2_question1_science));
                optionC_RadioButton.setText(getString(R.string.option3_question1_science));
                optionD_RadioButton.setText(getString(R.string.option4_question1_science));

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 2.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a segunda questão do primeiro quizz
     */
    public void setQuestion2(){
        switch (currentQuizz){
            case 1:
                optionA_RadioButton.setChecked(false);
                optionB_RadioButton.setChecked(false);
                optionC_RadioButton.setChecked(false);
                optionD_RadioButton.setChecked(false);

                // Configurando a nova pergunta
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question2_science));

                // Configurando a barra de progresso para a questão atual
                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(2);

                // Configurando os Radio Buttons da questão
                optionA_RadioButton.setText(getString(R.string.option1_question2_science));
                optionB_RadioButton.setText(getString(R.string.option2_question2_science));
                optionC_RadioButton.setText(getString(R.string.option3_question2_science));
                optionD_RadioButton.setText(getString(R.string.option4_question2_science));

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 3.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a terceira questão do primeiro quizz
     */
    public void setQuestion3(){
        switch (currentQuizz){
            case 1:
                optionA_RadioButton.setChecked(false);
                optionB_RadioButton.setChecked(false);
                optionC_RadioButton.setChecked(false);
                optionD_RadioButton.setChecked(false);

                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 3, RADIOBOX DA 3, PROGRESSBAR DA 3
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question3_science));

                // Configurando a barra de progresso para a questão atual
                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(3);

                optionA_RadioButton.setText(getString(R.string.option1_question3_science));
                optionB_RadioButton.setText(getString(R.string.option2_question3_science));
                optionC_RadioButton.setText(getString(R.string.option3_question3_science));
                optionD_RadioButton.setText(getString(R.string.option4_question3_science));

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 4.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a quarta questão do primeiro quizz
     */
    public void setQuestion4(){
        switch (currentQuizz){
            case 1:
                setContentView(R.layout.checkbox_questions);

                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question4_science));

                optionA_CheckBox = findViewById(R.id.option_1_checkbox);
                optionB_CheckBox = findViewById(R.id.option_2_checkbox);
                optionC_CheckBox = findViewById(R.id.option_3_checkbox);
                optionD_CheckBox = findViewById(R.id.option_4_checkbox);

                optionA_CheckBox.setText(getString(R.string.option1_question4_science));
                optionB_CheckBox.setText(getString(R.string.option2_question4_science));
                optionC_CheckBox.setText(getString(R.string.option3_question4_science));
                optionD_CheckBox.setText(getString(R.string.option4_question4_science));

                // Configurando a barra de progresso para a questão atual
                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(4);

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 5.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a quinta questão do primeiro quizz
     */
    public void setQuestion5(){
        switch (currentQuizz){
            case 1:
                optionA_CheckBox.setChecked(false);
                optionB_CheckBox.setChecked(false);
                optionC_CheckBox.setChecked(false);
                optionD_CheckBox.setChecked(false);

                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 5, EDITTEXT DA 5, PROGRESSBAR DA 5
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question5_science));

                optionA_CheckBox.setText(getString(R.string.option1_question5_science));
                optionB_CheckBox.setText(getString(R.string.option2_question5_science));
                optionC_CheckBox.setText(getString(R.string.option3_question5_science));
                optionD_CheckBox.setText(getString(R.string.option4_question5_science));

                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(5);

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 6.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a sexta questão do primeiro quizz
     */
    public void setQuestion6(){
        switch (currentQuizz){
            case 1:
                optionA_CheckBox.setChecked(false);
                optionB_CheckBox.setChecked(false);
                optionC_CheckBox.setChecked(false);
                optionD_CheckBox.setChecked(false);

                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 6, EDITTEXT DA 6, PROGRESSBAR DA 6
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question6_science));

                optionA_CheckBox.setText(getString(R.string.option1_question6_science));
                optionB_CheckBox.setText(getString(R.string.option2_question6_science));
                optionC_CheckBox.setText(getString(R.string.option3_question6_science));
                optionD_CheckBox.setText(getString(R.string.option4_question6_science));

                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(6);

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 7.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a sétima questão do primeiro quizz
     */
    public void setQuestion7(){
        switch (currentQuizz){
            case 1:
                optionA_CheckBox.setChecked(false);
                optionB_CheckBox.setChecked(false);
                optionC_CheckBox.setChecked(false);
                optionD_CheckBox.setChecked(false);

                setContentView(R.layout.edittext_questions);

                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question7_science));

                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(7);

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 8.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a oitava questão do primeiro quizz
     */
    public void setQuestion8(){
        switch (currentQuizz){
            case 1:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 8, CHECKBOX DA 8, PROGRESSBAR DA 8
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question8_science));

                answerView = findViewById(R.id.answer_question);
                answerView.setText("");

                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(8);

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 9.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a nona questão do primeiro quizz
     */
    public void setQuestion9(){
        switch (currentQuizz){
            case 1:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 9, CHECKBOX DA 9, PROGRESSBAR DA 9
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question9_science));

                answerView.setText("");

                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(9);

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Recebe as views e seta as respectivas strings da questão 10.
     * Verifica por meio de um switch a primeira questão do quiz específico
     *
     * como não foi implementado os demais quizzes, o método só vai implementar
     * a décima questão do primeiro quizz
     */
    public void setQuestion10(){
        switch (currentQuizz){
            case 1:
                // SETAR TEXTVIEW DO TITULO DA QUESTÃO 10, RADIOBOX DA 10, PROGRESSBAR DA 10
                // SETAR BOTÃO QUE TERMINA E EXECUTAR METODO PRA GERAR RESULTADO EM TOAST
                title = findViewById(R.id.question_title);
                title.setText(getString(R.string.question10_science));

                answerView.setText("");

                currentProgressBar = findViewById(R.id.progress_bar);
                currentProgressBar.setProgress(10);

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            default:
                break;
        }
    }

    /**
     *
     * Verifica por meio do switch qual questão está.
     * Em cada case se verifica a resposta da questão atual
     * depois realiza o método para inserir as strings/layout da próxima questão
     * e incrementa currentQuestion
     */
    public void nextButtonPressed(View view){
        switch (currentQuestion){
            case 1:
                // Verifica resposta da questão 1
                if (optionB_RadioButton.isChecked()){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion2();
                currentQuestion += 1;
                break;

            case 2:
                // Verifica resposta da questão 2
                if (optionA_RadioButton.isChecked()){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion3();
                currentQuestion += 1;
                break;

            case 3:
                // Verifica resposta da questão 3
                if (optionD_RadioButton.isChecked()){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion4();
                currentQuestion += 1;
                break;

            case 4:
                // Verifica resposta da questão 4
                if (optionA_CheckBox.isChecked() && optionC_CheckBox.isChecked()){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion5();
                currentQuestion += 1;
                break;

            case 5:
                // Verifica resposta da questão 5
                if (optionB_CheckBox.isChecked() && optionC_CheckBox.isChecked() && optionD_CheckBox.isChecked()){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion6();
                currentQuestion += 1;
                break;

            case 6:
                // Verifica resposta da questão 6
                if (optionA_CheckBox.isChecked() && optionC_CheckBox.isChecked()){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion7();
                currentQuestion += 1;
                break;

            case 7:
                // Verifica resposta da questão 7
                answerView = findViewById(R.id.answer_question);
                answer = answerView.getText().toString().toUpperCase();
                if ((answer.equals("GALILEU")) || answer.equals("GALILEU GALILEI") || answer.equals("GALILEO GALILEI") || answer.equals("GALILEO")){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion8();
                currentQuestion += 1;
                break;

            case 8:
                // Verifica resposta da questão 8
                answer = answerView.getText().toString().toUpperCase();
                if (answer.equals("FREQUÊNCIA") || answer.equals("FREQUENCIA") || answer.equals("FREQÜENCIA") || answer.equals("FREQÜÊNCIA") ){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion9();
                currentQuestion += 1;
                break;

            case 9:
                // Verifica resposta da questão 9
                answer = answerView.getText().toString().toUpperCase();
                if (answer.equals("JOHN NASH") || answer.equals("NASH")){
                    currentScore += 1;
                }

                //inserir layout/strings da próxima questão.
                setQuestion10();
                currentQuestion += 1;
                break;

            case 10:
                // Verifica resposta da questão 10
                answer = answerView.getText().toString().toUpperCase();
                if (answer.equals("ALBERT SABIN") || answer.equals("SABIN")){
                    currentScore += 1;
                }

                //Imprimir resultado do quiz
                Toast.makeText(this, "Você acertou " + currentScore + " de 10 questões!", Toast.LENGTH_LONG).show();
                break;

            default:
                break;
        }
    }
}