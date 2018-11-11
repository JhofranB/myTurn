package co.sena.amasplay.myturn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FiltroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtro);
    }

    public void onClick(View view) {
        Intent intent = new Intent(FiltroActivity.this, RegistroUserActivity.class);
        startActivity(intent);
    }

    public void ingresar(View view) {
        Intent intent = new Intent(FiltroActivity.this, RegistroServiActivity.class);
        startActivity(intent);
    }
}
