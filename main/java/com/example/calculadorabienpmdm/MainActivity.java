package com.example.calculadorabienpmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //DEFINICIÓN DE TODOS LOS ELEMENTOS EN LA PANTALLA
        TextView texto = (TextView) findViewById(R.id.texto);

        Button btnAC = (Button) findViewById(R.id.btnLimpiar);
        Button btnC = (Button) findViewById(R.id.btnBorrar);
        Button btnResto = (Button) findViewById(R.id.btnResto);
        Button btnDividir = (Button) findViewById(R.id.btnDividir);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btnResta = (Button) findViewById(R.id.btnResta);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btnSuma = (Button) findViewById(R.id.btnSuma);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btnPunto = (Button) findViewById(R.id.btnPunto);
        Button btnMemoria = (Button) findViewById(R.id.btnMemoria);
        Button btnIgual = (Button) findViewById(R.id.btnIgual);


        //Borra todo texto en la pantalla
        texto.setText("");

        int maxtam=10;  //Define el tamaño maximo de lo que pueda aparecer en la pantalla

        Calculo.ReiniciarMemoria(); //Pone todo en memoria a 0



        //DEFINE EL PRIMER DIALOG (CONFIRMA QUE SE HA GUARDADDO EN MEMORIA EL NUMERO)
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Write your message here.");  //mensaje generico, cambia despues

        builder1.setPositiveButton( //Bton aceptar
                "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        texto.setText(""); //Borra la pantalla
                        dialog.cancel();
                    }
                });


        //SEGUNDO DIALOG (MUESTRA UNA LISTA CON TODO LOS NUMEROS GUARDADOS EN MEMORIA)
        AlertDialog.Builder builder2= new AlertDialog.Builder(this);
        builder2.setTitle("Numeros guardados"); //Tiutulo del dialog
                //Boton que reinicia memoria
        builder2.setNegativeButton("Reiniciar Memoria", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Calculo.ReiniciarMemoria(); //Reinicia memoria
                dialog.dismiss();   //Cierra el dialog
            }
        });




    //METODOS ON CLICK DE LOS BOTONES ##########################################3
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("9");
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    texto.setText("");
            } //Borra todo el texto
        });


        btnC.setOnClickListener(new View.OnClickListener() {    //Borra el ultimo caracter
            @Override
            public void onClick(View view) {
                if(texto.getText().length()>0)
                    texto.setText(texto.getText().subSequence(0,texto.getText().length()-1));
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().toString().contains("/")
                ||texto.getText().toString().contains("x")
                ||texto.getText().toString().contains("+")
                ||texto.getText().toString().contains("-")
                ||texto.getText().toString().contains("%")
                ||texto.getText().toString().equals("")){    //Solo puede aparecer una operacion en ppantalla

                }else{
                    if(texto.getText().length()<=maxtam)
                        texto.append(" / ");
                }

            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().toString().contains("/")
                        ||texto.getText().toString().contains("x")
                        ||texto.getText().toString().contains("+")
                        ||texto.getText().toString().contains("-")
                        ||texto.getText().toString().contains("%")
                        ||texto.getText().toString().equals("")){

                }else{
                    if(texto.getText().length()<=maxtam)
                        texto.append(" x ");
                }

            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().toString().contains("/")
                        ||texto.getText().toString().contains("x")
                        ||texto.getText().toString().contains("+")
                        ||texto.getText().toString().contains("-")
                        ||texto.getText().toString().contains("%")
                        ||texto.getText().toString().equals("")){

                }else{
                    if(texto.getText().length()<=maxtam)
                        texto.append(" - ");
                }

            }
        });

        btnResto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texto.getText().toString().contains("/")
                        || texto.getText().toString().contains("x")
                        || texto.getText().toString().contains("+")
                        || texto.getText().toString().contains("-")
                        || texto.getText().toString().contains("%")
                        ||texto.getText().toString().equals("")) {

                } else {
                    if (texto.getText().length() <= maxtam)
                        texto.append(" % ");
                }
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (texto.getText().toString().contains("/")
                        || texto.getText().toString().contains("x")
                        || texto.getText().toString().contains("+")
                        || texto.getText().toString().contains("-")
                        || texto.getText().toString().contains("%")
                        ||texto.getText().toString().equals("")) {

                } else {
                    if (texto.getText().length() <= maxtam)
                        texto.append(" + ");
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculo c = new Calculo(texto.getText().toString());
                texto.setText(String.valueOf(c.operar()));  //Pone en pantalla el resultado de la operacion
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append("0");
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().length()<=maxtam)
                    texto.append(".");
            }
        });

        btnMemoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(texto.getText().toString().equals("")){ //Si la pantalla está vacía

                    String[] memo=new String[Calculo.memoria.length]; //Pasa la memoria a string
                    for(int i=0; i<memo.length;i++){
                        memo[i]=Float.toString(Calculo.memoria[i]);
                    }

                    builder2.setItems(memo, new DialogInterface.OnClickListener() { //pone la lista del dialog2 a esa memoria
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            texto.setText(memo[which]); //pone el texto de la pantalla al numero elegido
                        }
                    });

                    builder2.setTitle("Seleccione un numero de memoria"); //Pone titulo al dialog
                    AlertDialog alert=builder2.create();    //crea y muestra ese dialog
                    alert.show();
                }else{  //SI NO
                    if(Calculo.memorizar(texto.getText().toString())){  //Si hay sitio en memorizar
                        builder1.setMessage("Numero guardado en memoria");  //Muestra un dialog afirmandolo
                        AlertDialog alert=builder1.create();
                        alert.show();
                    }
                }


            }
        });



    }
}