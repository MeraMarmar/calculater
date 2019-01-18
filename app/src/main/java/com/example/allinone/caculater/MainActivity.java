package com.example.allinone.caculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.add);

    }
    public void add(View view){
        final  EditText editText1 =(EditText)findViewById(R.id.editText1);
        final EditText editText2 =(EditText)findViewById(R.id.editText2);
        TextView textView =(TextView)findViewById(R.id.textView);
      int n1=Integer.parseInt(editText1.getText().toString());
        int n2=Integer.parseInt(editText2.getText().toString());
        int n3=n1+n2;
        textView.setText((String.valueOf(n3)));
    }
}
