package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
private EditText et_1;
private EditText et_2;
private TextView tv_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        et_1 = (EditText)findViewById(R.id.txt_usuario);
        et_2 = (EditText)findViewById(R.id.txt_contrasena);
        tv_1 = (TextView)findViewById(R.id.tv_estatus);
    }
    public void estatus (View view){
        String usuario_string = et_1.getText().toString();
        String contrasena_string = et_2.getText().toString();
        String comp = "Juan";
        //usuario_String = Integer.parseString(usuario_string);
        int contrasena_int = Integer.parseInt(contrasena_string);
        if(usuario_string.length()==0 ){
            Toast.makeText(this,"Debes ingresar un usuario y contraseña",Toast.LENGTH_LONG).show();
        }
        if(contrasena_int == 123456 && usuario_string.equals(comp)){
        tv_1.setText("Bienvenido Juan");
        }
        else
            tv_1.setText("contraseña o usuario incorrectos");
    }
}
