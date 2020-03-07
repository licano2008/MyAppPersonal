package com.example.myapppersonal;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    TextInputLayout etName, etPassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton=(Button)findViewById(R.id.btnlogin);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String usuario= ((TextInputLayout)findViewById(R.id.etName)).toString();
                String password= ((TextInputLayout)findViewById(R.id.etPassword)).toString();
                if (usuario.equals("admin")&& password.equals("12345678"))
                {
                    /*Intent nuevoform = new Intent(MainActivity.this,Secundario.class);
                    startActivity(nuevoform);*/
                    Toast.makeText(getApplicationContext(),"Credenciales CORRECTAS",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
