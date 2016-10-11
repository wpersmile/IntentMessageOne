package com.example.wper_smile.intentmessageone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //向指定Activity传递消息
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);

                //使用intent.putExtra(键名,键值)传递参数
                intent.putExtra("name","大黄");
                intent.putExtra("age",20);
                startActivity(intent);
            }
        });
    }
}
