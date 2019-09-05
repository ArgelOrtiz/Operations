package com.tec.aoaoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponentes();
    }

    protected void initComponentes(){
        final TextInputEditText firstNumberTextInputEditTExt  = findViewById(R.id.firstNumberMainTextInputEditTExt);
        final TextInputEditText secondNumberTextInputEditTExt = findViewById(R.id.secondNumberMainTextInputEditTExt);
        final TextView answerTextView                         = findViewById(R.id.answerMainTextView);
        Button addButton                                = findViewById(R.id.addMainButton);
        Button subtractButton                           = findViewById(R.id.subtractMainButton);
        Button multiplicationButton                     = findViewById(R.id.multiplicationMainButton);
        Button divisionButton                           = findViewById(R.id.divisionMainButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTextView.setVisibility(View.GONE);

                if (Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el primer numero",Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el segundo numero",Snackbar.LENGTH_LONG).show();
                    return;
                }

                try{

                    double first    = Double.parseDouble(Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString());
                    double second   = Double.parseDouble(Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString());
                    double answer   = first+second;
                    String label    = "R: "+answer;

                    answerTextView.setText(label);

                    answerTextView.setVisibility(View.VISIBLE);
                }catch (NumberFormatException e){
                    Log.e("MainActivity",e.getMessage());
                }

            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTextView.setVisibility(View.GONE);

                if (Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el primer numero",Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el segundo numero",Snackbar.LENGTH_LONG).show();
                    return;
                }
                try{

                    double first    = Double.parseDouble(Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString());
                    double second   = Double.parseDouble(Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString());
                    double answer   = first-second;
                    String label    = "R: "+answer;

                    answerTextView.setText(label);

                    answerTextView.setVisibility(View.VISIBLE);
                }catch (NumberFormatException e){
                    Log.e("MainActivity",e.getMessage());
                }
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTextView.setVisibility(View.GONE);

                if (Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el primer numero",Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el segundo numero",Snackbar.LENGTH_LONG).show();
                    return;
                }
                try{

                    double first    = Double.parseDouble(Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString());
                    double second   = Double.parseDouble(Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString());

                    if (second == 0){
                        Snackbar.make(v,"El segundo numero no puede ser 0",Snackbar.LENGTH_LONG).show();
                        return;
                    }

                    double answer   = first*second;
                    String label    = "R: "+answer;

                    answerTextView.setText(label);

                    answerTextView.setVisibility(View.VISIBLE);
                }catch (NumberFormatException e){
                    Log.e("MainActivity",e.getMessage());
                }
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerTextView.setVisibility(View.GONE);

                if (Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el primer numero",Snackbar.LENGTH_LONG).show();
                    return;
                }

                if (Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString().isEmpty()){
                    Snackbar.make(v,"Ingrese el segundo numero",Snackbar.LENGTH_LONG).show();
                    return;
                }
                try{

                    double first    = Double.parseDouble(Objects.requireNonNull(firstNumberTextInputEditTExt.getText()).toString());
                    double second   = Double.parseDouble(Objects.requireNonNull(secondNumberTextInputEditTExt.getText()).toString());
                    double answer   = first/second;
                    String label    = "R: "+answer;

                    answerTextView.setText(label);

                    answerTextView.setVisibility(View.VISIBLE);
                }catch (NumberFormatException e){
                    Log.e("MainActivity",e.getMessage());
                }
            }
        });

    }
}
