package com.gdunis.broadcastparictice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       final EditText edit_account = findViewById(R.id.edit_account);
       final EditText edit_password = findViewById(R.id.edit_password);
       Button btn_login = findViewById(R.id.btn_login);

       btn_login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(edit_account.getText().toString().equals("admin") && edit_password.getText().toString().equals("111111")) {
                   Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                   startActivity(intent);
               }
           }
       });
    }
}
