package com.example.danie.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eingabe1;
    EditText eingabe2;
    Button dividiere;
    TextView ergebnis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Eingabe der beiden Werte, Divisionsbutton und Ergebnis
        eingabe1 = (EditText) findViewById(R.id.eTeingabe1);
        eingabe2 = (EditText) findViewById(R.id.eTeingabe2);
        dividiere = (Button) findViewById(R.id.btndiv);
        ergebnis = (TextView) findViewById(R.id.twQuotient);

        dividiere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                //Eingabe wird zuerst zu String und dann zu Float geparst
                float wert1 = Float.parseFloat(eingabe1.getText().toString());
                float wert2 = Float.parseFloat(eingabe2.getText().toString());
                float resultat = wert1/wert2;
                ergebnis.setText(Float.toString(resultat));
            }
        });

    }
}
