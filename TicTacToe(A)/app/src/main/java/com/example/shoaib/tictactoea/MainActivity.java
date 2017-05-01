package com.example.shoaib.tictactoea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1;
    EditText t2;
    EditText t3;
    EditText t4;
    EditText t5;
    EditText t6;
    EditText t7;
    EditText t8;
    EditText t9;
    public boolean playerTurn=true;
    public boolean player1Win=false;
    public boolean player2Win=false;
    public boolean draw=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.t1);
        t2=(EditText)findViewById(R.id.t2);
        t3=(EditText)findViewById(R.id.t3);
        t4=(EditText)findViewById(R.id.t4);
        t5=(EditText)findViewById(R.id.t5);
        t6=(EditText)findViewById(R.id.t6);
        t7=(EditText)findViewById(R.id.t7);
        t8=(EditText)findViewById(R.id.t8);
        t9=(EditText)findViewById(R.id.t9);

        Toast.makeText(this,"Player 1 Turn",Toast.LENGTH_SHORT).show();


    }

    public void checkForPlayerTurn(View v) {
        EditText id=(EditText)v ;
        String text=id.getText().toString();
        if(text.equals("")){
            if(playerTurn==true){
                id.setText("X");
                playerTurn=false;
                checkWin();
                Toast.makeText(this,"Player 2 Turn",Toast.LENGTH_SHORT).show();
            }
            else{
                id.setText("O");
                playerTurn=true;
                checkWin();
                Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode==1)&&(resultCode==RESULT_OK)){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            playerTurn=true;
            player1Win=false;
            player2Win=false;

        }
        if(resultCode==RESULT_CANCELED){
            this.finish();
        }
    }

    public  void checkWin(){
        if(t1.getText().toString().equals("X")){
            if(t2.getText().toString().equals("X")){
                if(t3.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t1.getText().toString().equals("X")){
            if(t5.getText().toString().equals("X")){
                if(t9.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t1.getText().toString().equals("X")){
            if(t4.getText().toString().equals("X")){
                if(t7.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t2.getText().toString().equals("X")){
            if(t5.getText().toString().equals("X")){
                if(t8.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t3.getText().toString().equals("X")){
            if(t5.getText().toString().equals("X")){
                if(t7.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t3.getText().toString().equals("X")){
            if(t6.getText().toString().equals("X")){
                if(t9.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t4.getText().toString().equals("X")){
            if(t5.getText().toString().equals("X")){
                if(t6.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t7.getText().toString().equals("X")){
            if(t8.getText().toString().equals("X")){
                if(t9.getText().toString().equals("X")){
                    player1Win=true;
                    player2Win=false;
                }
            }
        }
        if(t1.getText().toString().equals("O")){
            if(t2.getText().toString().equals("O")){
                if(t3.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if(t1.getText().toString().equals("O")){
            if(t5.getText().toString().equals("O")){
                if(t9.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if(t1.getText().toString().equals("O")){
            if(t4.getText().toString().equals("O")){
                if(t7.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if(t2.getText().toString().equals("O")){
            if(t5.getText().toString().equals("O")){
                if(t8.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if(t3.getText().toString().equals("O")){
            if(t5.getText().toString().equals("O")){
                if(t7.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if(t3.getText().toString().equals("O")){
            if(t6.getText().toString().equals("O")){
                if(t9.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if(t4.getText().toString().equals("O")){
            if(t5.getText().toString().equals("O")){
                if(t6.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if(t7.getText().toString().equals("O")){
            if(t8.getText().toString().equals("O")){
                if(t9.getText().toString().equals("O")){
                    player1Win=false;
                    player2Win=true;
                }
            }
        }
        if((!t1.getText().toString().equals(""))&&(!t2.getText().toString().equals(""))&&(!t3.getText().toString().equals(""))
                &&(!t4.getText().toString().equals(""))&&(!t5.getText().toString().equals(""))&&(!t6.getText().toString().equals(""))
                &&(!t7.getText().toString().equals(""))&&(!t8.getText().toString().equals(""))&&(!t9.getText().toString().equals(""))){
            Toast.makeText(this, "Draw", Toast.LENGTH_LONG).show();
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            playerTurn=true;
            player1Win=false;
            player2Win=false;
            Toast.makeText(this, "Player 1 Turn", Toast.LENGTH_SHORT).show();


        }
        if(player1Win==true||player2Win==true){
           // Toast.makeText(this, "player 1 Win: "+player1Win+"\nplayer 2 Win: "+player2Win, Toast.LENGTH_SHORT).show();
            String txt1;
            String txt2;
            if(player1Win==true){
                 txt1="win";
            }
            else
            txt1="lose";
            if(player2Win==true){
                txt2="win";
            }
            else
            txt2="lose";
            Intent oIntent =new Intent(this,Result.class);
            Bundle oBundle = new Bundle();
            oBundle.putString("win1",txt1);
            oBundle.putString("win2",txt2);
            oIntent.putExtras(oBundle);

            startActivityForResult(oIntent,1);



        }
    }


}
