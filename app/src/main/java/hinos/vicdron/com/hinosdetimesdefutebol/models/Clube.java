package hinos.vicdron.com.hinosdetimesdefutebol.models;

public class Clube {
    int cover;
    int enviaHino;
    String letraCantico;
    String name;
    String ring;

    public Clube(int escudo, String ringtone, String nome, int hino, String letra) {
        this.cover = escudo;
        this.ring = ringtone;
        this.name = nome;
        this.letraCantico = letra;
        this.enviaHino = hino;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String nome) {
        this.name = nome;
    }

    public String getRingtone() {
        return this.ring;
    }
    public void setRingtone(String ringtone) {
        this.ring = ringtone;
    }

    public String getLetraCantico() {
        return this.letraCantico;
    }
    public void setLetraCantico(String letra) {
        this.letraCantico = letra;
    }

    public int getCover() {
        return this.cover;
    }
    public void setCover(int escudo) {
        this.cover = escudo;
    }

    public int getEnviaHino() {
        return this.enviaHino;
    }
    public void setEnviaHino(int hino) {
        this.enviaHino = hino;
    }
}
