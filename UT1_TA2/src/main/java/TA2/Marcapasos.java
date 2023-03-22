package TA2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author gfeli
 */
public class Marcapasos {

    public short presionSanguinea;// rango 0-250, byte alcanza hasta 127, entonces uso short que va hasta 32767. 2 bytes

    public short frecuenciaCardiaca;// rango 0-226, byte alcanza hasta 127, entonces uso short que va hasta 32767. 2 bytes

    public short azucarSangre;//rango 0-1000, byte alcanza hasta 127, entonces uso short que va hasta 32767. 2 bytes

    public long fuerzaMax;// rango 0-3.000.000.000, int alzanza hasta 2.147.483.647, entonces uso long que va hasta 9,223,372,036,854,775,807. 8 bytes

    public float minTiempoLatidos;// rango 0-100 con decimal, uso float que alzanza hasta 7 lugares despues de la coma. 4 bytes

    public double bateria;// double permite almacenar hasta 15 valores despues de la coma, que permite tener la mayor precision posible. 8 bytes

    public char codigo1;// 2 bytes

    public char codigo2;// 2 bytes

    public char codigo3;// 2 bytes

    public char codigo4;// 2 bytes

    public char codigo5;// 2 bytes

    public char codigo6;// 2 bytes

    public char codigo7;// 2 bytes

    public char codigo8;// 2 bytes

    //Consumo total de memoria: 42 bytes
}
