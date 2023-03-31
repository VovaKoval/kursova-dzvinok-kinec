package sample.dzvinky;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.*;
import java.time.LocalTime;
import java.util.Scanner;


public class MyTimerTask implements Runnable {



    File f = new File("D:\\UCH\\KN-56\\Koval\\dzvinky-kursova-main\\src\\main\\resources\\sample\\dzvinky\\assets\\bd\\dzvinky.txt");
    FileReader fr;

    {
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    Scanner scan = new Scanner(fr);

    // Зчитування даних з файлу
    int startGod = scan.nextInt();
    String StartGod = String.valueOf(startGod);
    int startMin = scan.nextInt();
    String startHv = String.valueOf(startMin);
    int startPerervaSmall = scan.nextInt();
    String startPerervaMala = String.valueOf(startMin);
    int startPerervaLong = scan.nextInt();
    String startPerervaVelyka = String.valueOf(startMin);
    int NomerUrokaVelykaPererva = scan.nextInt();
    String startUrokaVelykaPererva = String.valueOf(startMin);
    int TryvUrokuHv = scan.nextInt();
    String TryvUrokHV = String.valueOf(startMin);
    //        Автоматичне вираховування часу до дзвінка
    LocalTime start = LocalTime.of(startGod, startMin);
    LocalTime end = start.plusMinutes(TryvUrokuHv);
    LocalTime startUrok2 = end.plusMinutes(startPerervaSmall);
    LocalTime endUrok2 = startUrok2.plusMinutes(TryvUrokuHv);
    LocalTime startUrok3 = endUrok2.plusMinutes(startPerervaSmall);
    LocalTime endUrok3 = startUrok3.plusMinutes(TryvUrokuHv);
    LocalTime startUrok4 = endUrok3.plusMinutes(startPerervaSmall);
    LocalTime endUrok4 = startUrok4.plusMinutes(TryvUrokuHv);
    LocalTime startUrok5 = endUrok4.plusMinutes(startPerervaSmall);
    LocalTime endUrok5 = startUrok5.plusMinutes(TryvUrokuHv);
    LocalTime startUrok6 = endUrok5.plusMinutes(startPerervaSmall);
    LocalTime endUrok6 = startUrok6.plusMinutes(TryvUrokuHv);
    LocalTime startUrok7 = endUrok6.plusMinutes(startPerervaSmall);
    LocalTime endUrok7 = startUrok7.plusMinutes(TryvUrokuHv);
    LocalTime startUrok8 = endUrok7.plusMinutes(startPerervaSmall);
    LocalTime endUrok8 = startUrok8.plusMinutes(TryvUrokuHv);

//    Зміна типу з Інтового в Стрінгове
    String startDzvinok2 = String.valueOf(startUrok2);
    String startDzvinok3 = String.valueOf(startUrok3);
    String startDzvinok4 = String.valueOf(startUrok4);
    String startDzvinok5 = String.valueOf(startUrok5);
    String startDzvinok6 = String.valueOf(startUrok6);
    String startDzvinok7 = String.valueOf(startUrok7);
    String startDzvinok8 = String.valueOf(startUrok8);
    String endUrok1 = String.valueOf(end);
    String endDzvinok2 = String.valueOf(endUrok2);
    String endDzvinok3 = String.valueOf(endUrok3);
    String endDzvinok4 = String.valueOf(endUrok4);
    String endDzvinok5 = String.valueOf(endUrok5);
    String endDzvinok6 = String.valueOf(endUrok6);
    String endDzvinok7 = String.valueOf(endUrok7);
    String endDzvinok8 = String.valueOf(endUrok8);
//    Зчитування муз файлу
        FileInputStream muzicDzvinok;

    {
        try {
            muzicDzvinok = new FileInputStream("src\\main\\resources\\sample\\dzvinky\\assets\\mp\\dzvinokUrok.mp3");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не знайдено.");
        }
    }
    Player DzvinoknaUrok;

    {
        try {
            DzvinoknaUrok = new Player(muzicDzvinok);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    static FileInputStream musicPererva;

    {
        try {
            musicPererva = new FileInputStream("src\\main\\resources\\sample\\dzvinky\\assets\\mp\\dzvinokPererva.mp3");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    Player playerPererva;

    {
        try {
            playerPererva = new Player(musicPererva);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String StartUrok1 = String.valueOf(start);
        LocalTime startMuzUrok1 = LocalTime.now();
        String StartMuzUrok1 = String.valueOf(startMuzUrok1);


        int limit = 5;
        String StartMuzUrokHours = StartMuzUrok1.codePointCount(0, StartMuzUrok1.length()) > limit ?
                StartMuzUrok1.substring(0, StartMuzUrok1.offsetByCodePoints(0, limit)) : StartMuzUrok1;
        if (StartMuzUrokHours.equals(StartUrok1)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(startDzvinok2)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(startDzvinok3)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(startDzvinok4)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(startDzvinok5)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(startDzvinok6)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(startDzvinok7)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(startDzvinok8)){
            try {
                DzvinoknaUrok.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endUrok1)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endDzvinok2)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endDzvinok3)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endDzvinok4)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endDzvinok5)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endDzvinok6)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endDzvinok7)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }if(StartMuzUrokHours.equals(endDzvinok8)){
            try {
                playerPererva.play(1000000);
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        }
    }

}
