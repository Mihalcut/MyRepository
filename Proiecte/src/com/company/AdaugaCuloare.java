package com.company;

/**
*
* @author Mihalcut, Dragomir
* 
* @deprecated
* Implementarea decoratorilor
*
*/
public abstract class AdaugaCuloare implements Car {
    public Car c;
    AdaugaCuloare(Car cu){
            c=cu;
        }

    @Override
    public String descrie(){
            return c.descrie();
        }

    @Override
    public void setCuloare(String culoare) { this.c.setCuloare(culoare);}

    @Override
    public void addPret(int pret) {
            this.c.addPret(pret);
    }

    public void setCombustibil(String combustibil){
            this.c.setCombustibil(combustibil);
    }
}
class AdaugaNegru extends AdaugaCuloare {

    AdaugaNegru(Car c){
        super(c);
    }

    @Override
    public void setCuloare(String culoare) {
        this.c.setCuloare(culoare);
    }

    @Override
    public void addPret(int pret) {
        this.c.addPret(pret);
    }

    @Override
    public void setCutie_viteze(String cViteze) {
        this.c.setCutie_viteze(cViteze);
    }

    @Override
    public String descrie() {
        this.c.setCuloare("neagra");
        this.c.addPret(1134);
        return this.c.descrie();
    }
}

//________________________________________________

class AdaugaAlbastru extends AdaugaCuloare {

    AdaugaAlbastru(Car c){
        super(c);
    }

    @Override
    public void setCuloare(String culoare) {
        this.c.setCuloare(culoare);
    }

    @Override
    public void addPret(int pret) {
        this.c.addPret(pret);
    }

    @Override
    public void setCutie_viteze(String cViteze) {
        this.c.setCutie_viteze(cViteze);
    }

    @Override
    public String descrie() {
        this.c.setCuloare("albastra");
        this.c.addPret(1134);
        return this.c.descrie();
    }
}

//________________________________________________

class AdaugaGri extends AdaugaCuloare {

    AdaugaGri(Car c){
        super(c);
    }

    @Override
    public void setCuloare(String culoare) {
        this.c.setCuloare(culoare);
    }

    @Override
    public void addPret(int pret) {
        this.c.addPret(pret);
    }

    @Override
    public void setCutie_viteze(String cViteze) {
        this.c.setCutie_viteze(cViteze);
    }

    @Override
    public String descrie() {
        this.c.setCuloare("gri");
        this.c.addPret(1134);
        return this.c.descrie();
    }
}