package Login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.baithi.MainActivity;
import com.example.baithi.R;
public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edName, edPass;
    DBManager dbManager;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dbManager = new DBManager(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = (Button) findViewById(R.id.btn_login);
        ImageView imageView = (ImageView) findViewById(R.id.reg_btn);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }

        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edName = (EditText) findViewById(R.id.email);
                edPass = (EditText) findViewById(R.id.password);
                Button login = (Button) findViewById(R.id.btn_login);
                String tenDN = edName.getText().toString();
                String pass = edPass.getText().toString();

                boolean kt = dbManager.KiemTraDangNhap(tenDN, pass);
                if (kt) {
//                    Toast.makeText(LoginActivity.this, "Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
                    login.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    });
                } else {
                    Toast.makeText(LoginActivity.this, "Đăng Nhập Thất Bại", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public void btnDangNhat(){
        Button login1 = (Button)findViewById(R.id.btn_login);
        String tenDN = edName.getText().toString();
        String pass = edPass.getText().toString();

        boolean kt = dbManager.KiemTraDangNhap(tenDN, pass);
        if(kt == true){
            Toast.makeText(LoginActivity.this, "Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
            login1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            });
        }
        else{
            Toast.makeText(LoginActivity.this, "Đăng Nhập Thất Bại", Toast.LENGTH_SHORT).show();
        }
    }
    public void btnDangKi(){
        ImageView imageView1 = (ImageView) findViewById(R.id.reg_btn);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
//        int id = v.getId();
//        switch (id){
//            case R.id.btn_login:
//                break;
//            case R.id.reg_btn:
//                btnDangKi();
//                break;
//        }
    }
}

