package co.sena.amasplay.myturn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistroServiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_servi);
    }

    public void onClick(View view) {
        Intent intent = new Intent(RegistroServiActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
