package br.com.etecia.dragonball;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
TextInputEditText txtemail,txtsenha;
MaterialButton btnlogin,btnsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtemail = findViewById(R.id.txtemail);
        txtsenha = findViewById(R.id.txtsenha);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, senha;
                email = txtemail.getText().toString();
                senha = txtsenha.getText().toString();

                if (email.equals("etecia") && senha.equals("etecia")){
                    Intent(getApplicationContext(),MenuPrincipalActivity.class);
                    finish();

                }else{
                    Toast.makeText(getApplicationContext(),"Usuario ou Senha invalidos",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

}