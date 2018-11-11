package co.sena.amasplay.myturn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RegistroUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_user);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String[] datos = new String[] {"Barberia", "Peluqueria", "Comida Rapida"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);

        spinner.setAdapter(adapter);
    }

    public void onClick(View view) {
        Intent intent = new Intent(RegistroUserActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
