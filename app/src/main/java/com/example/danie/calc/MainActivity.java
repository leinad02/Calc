package com.example.danie.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.IllegalFormatCodePointException;

import static android.R.id.empty;

public class MainActivity extends AppCompatActivity {

    EditText eingabe1;
    EditText eingabe2;
    Button dividiere, reset;
    TextView ergebnis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Eingabe der beiden Werte, Divisionsbutton und Ergebnis
        eingabe1 = (EditText) findViewById(R.id.eTeingabe1);
        eingabe2 = (EditText) findViewById(R.id.eTeingabe2);
        dividiere = (Button) findViewById(R.id.btndiv);
        reset = (Button) findViewById(R.id.btnrst);
        ergebnis = (TextView) findViewById(R.id.twQuotient);

        dividiere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                //Eingabe wird zuerst zu String und dann zu Float geparst
                float wert1 = Float.parseFloat(eingabe1.getText().toString());
                float wert2 = Float.parseFloat(eingabe2.getText().toString());
                float resultat = wert1/wert2;

                if(wert2 == 0){
                   ergebnis.setText(R.string.divnullfehler);
                } /*else if (TextUtils.isEmpty(eingabe1.getText().toString()) || TextUtils.isEmpty(eingabe2.getText().toString())) {
                    ergebnis.setText(R.string.feldleer);
                }*/ else {
                ergebnis.setText(String.valueOf(resultat));
            }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v){
                eingabe1.setText("0.0");
                eingabe2.setText("0.0");
                ergebnis.setText("0.0");
            }
        });


    }
}
