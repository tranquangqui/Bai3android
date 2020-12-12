package Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baithi.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText edEmail;
    private EditText edName;
    private EditText edPass;
    private ImageView btndk;
    DBManager dbManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dbManager = new DBManager(this);
        edEmail = (EditText)findViewById(R.id.dk_email);
        edName = (EditText)findViewById(R.id.usernameđk);
        edPass = (EditText)findViewById(R.id.dk_password);
        btndk = (ImageView)findViewById(R.id.btn_login1);
        ImageView imageView = (ImageView)findViewById(R.id.log_btn);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });

        btndk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbManager.addAccount(createAccount());
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
    private Account createAccount(){
        String name = edName.getText().toString();
        String mail = edEmail.getText().toString();
        String pass = edPass.getText().toString();
        Account account = new Account(name, mail ,pass);
        return account;
    }
}