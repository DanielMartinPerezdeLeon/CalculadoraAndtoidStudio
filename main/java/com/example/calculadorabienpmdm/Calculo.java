package com.example.calculadorabienpmdm;

public class Calculo {
    float operando1;
    float operando2;
    char operacion;
    static float[] memoria;

    public Calculo(String linea){
        String[] datos = linea.split(" ",3); //Divide el texto de la pantalla en 3
                                    //Antes del simbolo, el smbolo y despues de simbolo
                                    //además, borra los espacios

        //obtiene y parsea esos datos
        operando1=Float.parseFloat(datos[0]);
        operando2=Float.parseFloat(datos[2]);
        operacion=datos[1].charAt(0);

    }


    public float operar(){  //calcula el resultado
        switch (operacion){     //Segun cual sea el simbolo de la operacion
            case ('+'): {
                return (operando1+operando2);
            }
            case ('-'): {
                return (operando1-operando2);
            }
            case ('x'): {
                return (operando1*operando2);
            }
            case ('/'): {
                return (operando1/operando2);
            }
            case ('%'): {
                return (operando1%operando2);
            }

        }
        return 0;   //No debería de llegar nunca
    }


    public static Boolean memorizar(String num){    //Guarda un numero en una posicion vacia(0) si puede
        for(int i=0; i<memoria.length;i++){
            if(memoria[i]==0){
                memoria[i]=Float.parseFloat(num);
                return(true);

            }

        }
        return(false);
    }

    public static void ReiniciarMemoria(){  //Pone todas las posiciones de memoria a 0
        memoria=new float[10];

        for(int i =0; i<memoria.length;i++){
            memoria[i]=0;
        }
    }
}

