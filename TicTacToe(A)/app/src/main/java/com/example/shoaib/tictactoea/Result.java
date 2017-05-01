package com.example.shoaib.tictactoea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView result;
    TextView message;
    EditText ans;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result=(TextView)findViewById(R.id.result);
        message=(TextView)findViewById(R.id.msg);
        ans=(EditText)findViewById(R.id.ans);
        b1=(Button)findViewById(R.id.button);
        Intent oIntent=getIntent();
        Bundle oBundle=oIntent.getExtras();
       String txt1=oBundle.getString("win1");
        String txt2=oBundle.getString("win2");
        boolean draw=oBundle.getBoolean("draw");

            result.setText("Player 1: "+txt1+"\n"+"Player 2: "+txt2);
            message.setText("Do you want to play again?(y/n)");




    }


    public void onClick(View v){
        if(ans.getText().toString().equals("y")){
            Intent oIntent =new Intent();
            setResult(RESULT_OK,oIntent);
            finish();
        }
        else{
           Intent oIntent=new Intent();
            setResult(RESULT_CANCELED,oIntent);
            finish();


        }

    }
}
