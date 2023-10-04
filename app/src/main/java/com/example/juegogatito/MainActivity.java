package com.example.juegogatito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    boolean Turno=true;
   TextView txt1;
   TextView txt2;
   TextView txt3;
   TextView txt4;
   TextView txt5;
   TextView txt6;
   TextView txt7;
   TextView txt8;
   TextView txt9;
   TextView txtwin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txt1=findViewById(R.id.txt1);
         txt2=findViewById(R.id.txt2);
         txt3=findViewById(R.id.txt3);
         txt4=findViewById(R.id.txt4);
         txt5=findViewById(R.id.txt5);
         txt6=findViewById(R.id.txt6);
         txt7=findViewById(R.id.txt7);
         txt8=findViewById(R.id.txt8);
         txt9=findViewById(R.id.txt9);


        View.OnClickListener Txt1 =new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1=(TextView) view;
                if (!txt1.getText().toString().equals("")){
                    return;
                }
                if(Turno==true){
                    txt1.setText("0");
                    Turno=false;
                }
                else {
                    txt1.setText("X");
                    Turno=true;
                }

            }
        };
        txt1.setOnClickListener(Txt1);


        View.OnClickListener Txt2=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2=(TextView) view;
                if (!txt2.getText().toString().equals("")){
                    return;
                }
                if (Turno==true){
                    txt2.setText("0");
                    Turno=false;
                }
                else {
                    txt2.setText("X");
                    Turno=true;
                }
            }
        };
        txt2.setOnClickListener(Txt2);

        View.OnClickListener Txt3=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt3=(TextView) view;
                if (!txt3.getText().toString().equals("")){
                    return;}
                if (Turno==true){
                    txt3.setText("0");
                    Turno=false;
                }
                else {
                    txt3.setText("X");
                    Turno=true;
                }

            }
        };
        txt3.setOnClickListener(Txt3);


        View.OnClickListener Txt4=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt4=(TextView) view;
                if (!txt4.getText().toString().equals("")){
                    return;}
                if (Turno==true){
                    txt4.setText("0");
                    Turno=false;
                }
                else {
                    txt4.setText("X");
                    Turno=true;
                }

            }
        };
        txt4.setOnClickListener(Txt4);



        View.OnClickListener Txt5=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt5=(TextView) view;
                if (!txt5.getText().toString().equals("")){
                    return;}
                if (Turno==true){
                    txt5.setText("0");
                    Turno=false;
                }
                else {
                    txt5.setText("X");
                    Turno=true;
                }

            }
        };
        txt5.setOnClickListener(Txt5);


        View.OnClickListener Txt6=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt6=(TextView) view;
                if (!txt6.getText().toString().equals("")){
                    return;}
                if (Turno==true){
                    txt6.setText("0");
                    Turno=false;
                }
                else {
                    txt6.setText("X");
                    Turno=true;
                }

            }
        };
        txt6.setOnClickListener(Txt6);



        View.OnClickListener Txt7=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt7=(TextView) view;
                if (!txt7.getText().toString().equals("")){
                    return;}
                if (Turno==true){
                    txt7.setText("0");
                    Turno=false;
                }
                else {
                    txt7.setText("X");
                    Turno=true;
                }

            }
        };
        txt7.setOnClickListener(Txt7);


        View.OnClickListener Txt8=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt8=(TextView) view;
                if (!txt8.getText().toString().equals("")){
                    return;}
                if (Turno==true){
                    txt8.setText("0");
                    Turno=false;
                }
                else {
                    txt8.setText("X");
                    Turno=true;
                }

            }
        };
        txt8.setOnClickListener(Txt8);

        View.OnClickListener Txt9=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt9=(TextView) view;
                if (!txt9.getText().toString().equals("")){
                    return;}
                if (Turno==true){
                    txt9.setText("0");
                    Turno=false;
                }
                else {
                    txt9.setText("X");
                    Turno=true;
                }

            }
        };
        txt9.setOnClickListener(Txt9);

    }

    public void Comprobar(){

        if (txt1.getText() == "0" && txt2.getText()=="0" && txt3.getText()=="0"){
            txtwin.setText("Ganaste 0");
        }

    }



}