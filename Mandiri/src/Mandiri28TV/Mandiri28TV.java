/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Mandiri28TV;

public class Mandiri28TV {

    public static void main(String[] MbahPutih) {
        TV Televisi = new TV();
        Televisi.setHidup();
        Televisi.setKanal(30);
        Televisi.setlevelVolume(5);
        Televisi.volumeDOWN();

        TV Televisi2 = new TV();
        Televisi2.setHidup();
        Televisi2.kanalUP();
        Televisi2.kanalDOWN();
        Televisi2.volumeUP();

        System.out.println("Kanal TV1 adalah " + Televisi.kanal + " dan level volumenya adalah " + Televisi.levelVolume);
        System.out.println("Kanal TV2 adalah " + Televisi2.kanal + " dan level volumanya adalah " + Televisi2.levelVolume);
    }
}

class TV{
    int kanal = 1;
    int levelVolume = 1;
    boolean hidup = false;

    public TV(){

    }

    public void setHidup(){
        hidup = true;
    }

    public void setMati(){
        hidup = false;
    }

    public void setKanal(int kanalBaru) {
        if (hidup && kanalBaru >= 1 && kanalBaru <= 120) {
            kanal = kanalBaru;
        }
    }

    public void setlevelVolume(int levelVolumebaru){
        if (hidup && levelVolumebaru >= 1 && levelVolumebaru <= 7) {
            levelVolume = levelVolumebaru;
        }
    }

    public void kanalUP() {
        if (hidup && kanal < 120) {
            kanal++;
        }
    }

    public void kanalDOWN() {
        if (hidup && kanal > 1) {
            kanal--;
        }
    }

    public void volumeUP() {
        if (hidup && levelVolume < 7) {
            levelVolume++;
        }
    }

    public void volumeDOWN() {
        if (hidup && levelVolume > 1) {
            levelVolume--;
        }
    }
}