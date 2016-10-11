package com.example.wper_smile.intentmessageone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        TextView textView=(TextView)findViewById(R.id.tex_show);

        //取得启动该Activity的Intent对象
        Intent intent=getIntent();
        //取出Intent中传递的数据
        //得根据传递的数据类型取值
        String name=intent.getStringExtra("name");
        //若没有取到值则按默认值18显示
        Integer age=intent.getIntExtra("age",18);
        textView.setText(name+age+"岁");
    }
}
