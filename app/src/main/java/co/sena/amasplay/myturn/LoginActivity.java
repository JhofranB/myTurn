package co.sena.amasplay.myturn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String[] datos = new String[] {"Cliente", "Servicio"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);

        spinner.setAdapter(adapter);

    }

    public void onClick(View view) {
        Intent intent = new Intent(LoginActivity.this, FiltroActivity.class);
        startActivity(intent);
    }

    public void ingresar(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
