package com.company;

/**
*
* @author Mihalcut, Dragomir
* 
* @deprecated
* Implementarea decoratorilor
*
*/
public abstract class AdaugaCombustibil implements Car {
    public Car c;

    AdaugaCombustibil(Car cb){
        c=cb;
    }

    public String descrie(){
        return c.descrie();
    }

    @Override
    public void setCuloare(String culoare) {
        this.c.setCuloare(culoare);
    }

    @Override
    public void addPret(int pret) {
        this.c.addPret(pret);
    }

    public void setCombustibil(String combustibil){
        this.c.setCombustibil(combustibil);
    }
}

class AdaugaBenzina extends AdaugaCombustibil {

    AdaugaBenzina(Car c){
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

    public void setCombustibil(String combustibil){
        this.c.setCombustibil(combustibil);
    }

    @Override
    public String descrie() {
        this.c.setCombustibil("benzina");
        this.c.addPret(1000);
        return this.c.descrie();
    }
}

//_____________________________________________

class AdaugaMotorina extends AdaugaCombustibil {

    AdaugaMotorina(Car c){
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

    public void setCombustibil(String combustibil){
        this.c.setCombustibil(combustibil);
    }

    @Override
    public String descrie() {
        this.c.setCombustibil("motorina");
        this.c.addPret(1150);
        return this.c.descrie();
    }
}