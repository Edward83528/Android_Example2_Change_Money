package com.example.u0151051.change_money;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 第一步:寫一個方法建立元件(先宣告)
    EditText et;
    TextView tv1, tv2, tv3;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
    }

    // 第一步:寫一個方法建立元件
    void findview() {

        // 都要強制轉型原本沒轉型前是父類別(view),強制轉成子類別
        et = (EditText) findViewById(R.id.editText);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        bt = (Button) findViewById(R.id.button);
        // 第三步:設定監聽器給元件button
        bt.setOnClickListener(c);
    }

    // 第二步:建立監聽器
    View.OnClickListener c = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = et.getText().toString();
            double usd = Double.parseDouble(s);// 把字串轉型成double
            double twd = usd * 30.0;
            tv3.setText(String.valueOf(twd)+"元整");//String.valueOf()把字串轉成double
        }
    };
}
