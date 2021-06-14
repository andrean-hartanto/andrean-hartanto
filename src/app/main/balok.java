package app.main;

public class balok{

    int panjang, lebar, tinggi, luasbalok, volumebalok;
    
    public void SetPanjang(int panjang){
        this.panjang = panjang;
    }
    public void SetLebar(int lebar){
        this.lebar = lebar;
    }
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int GetPanjang(){
        return this.panjang;
    }
    public int GetLebar(){
        return this.lebar;
    }
    public int GetTinggi(){
        return this.tinggi;
    }

    public int luasbalok(){
        this.luasbalok = 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi );
        return this.luasbalok;
    }
    public int volumebalok(){
        this.volumebalok = this.panjang * this.lebar * this.tinggi;
        return this.volumebalok;
    }
    @Override
    public String toString() {
        return "\nPanjang balok : " + panjang + "\nLebar balok : " + tinggi ;
    }
}