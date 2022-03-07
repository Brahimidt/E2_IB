package com.example.e2_ib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int init = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game();
    }

    void game(){

        TextView tv = (TextView)findViewById(R.id.textView7);
        if (init == 0){
            tv.setText("Player 1");
            init = 1;
            click();
        }else{
            tv.setText("Player 2");
            init = 0;
            click();
        }

    }

    void click(){

        Button tm = (Button) findViewById(R.id.tm);
        Button tl = (Button) findViewById(R.id.tl);
        Button tr = (Button) findViewById(R.id.tr);
        Button ml = (Button) findViewById(R.id.ml);
        Button mm = (Button) findViewById(R.id.mm);
        Button mr = (Button) findViewById(R.id.mr);
        Button bl = (Button) findViewById(R.id.bl);
        Button bm = (Button) findViewById(R.id.bm);
        Button br = (Button) findViewById(R.id.br);
        TextView tv = (TextView)findViewById(R.id.textView7);

        tl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tl.getText()!="X" && tl.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        tl.setText("X");
                    }else{
                        tl.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }

            }
        });

        tm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tm.getText()!="X" && tm.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        tm.setText("X");
                    }else{
                        tm.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }


            }
        });

        tr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (tr.getText()!="X" && tr.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        tr.setText("X");
                    }else{
                        tr.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }
            }
        });

        mr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mr.getText()!="X" && mr.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        mr.setText("X");
                    }else{
                        mr.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }
            }
        });
        mm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mm.getText()!="X" && mm.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        mm.setText("X");
                    }else{
                        mm.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }
            }
        });

        ml.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (ml.getText()!="X" && ml.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        ml.setText("X");
                    }else{
                        ml.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }
            }
        });

        bl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bl.getText()!="X" && bl.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        bl.setText("X");
                    }else{
                        bl.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }

            }
        });

        bm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (bm.getText()!="X" && bm.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        bm.setText("X");
                    }else{
                        bm.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }
            }
        });

        br.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (br.getText()!="X" && br.getText()!="O" ){
                    if(tv.getText()=="Player 1") {
                        br.setText("X");
                    }else{
                        br.setText("O");
                    }
                    game();
                }else{
                    Toast.makeText(getApplicationContext(),"Not empty",Toast.LENGTH_SHORT).show();
                    click();
                }
            }
        });


    }

}