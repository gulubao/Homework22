package cn.edu.swufe.homework2_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Homework2_2 extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework2_2);
        Button  button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                String str = editText.getText().toString();
                int F;
                F= Integer.valueOf(str)+3;
                editText.setText(F+"");
            }
        })
        ;
        Button  button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                String str = editText.getText().toString();
                int F;
                F= Integer.valueOf(str)+2;
                editText.setText(F+"");
            }
        })
        ;
        Button  button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                String str = editText.getText().toString();
                int F;
                F= Integer.valueOf(str)+1;
                editText.setText(F+"");
            }
        })
        ;
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                editText.setText("0");
            }
        })
        ;

    }

    @Override
    public void onClick(View v) {

    }


    }

