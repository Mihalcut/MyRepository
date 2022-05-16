package com.company;

//Implementarea decoratorilor
public abstract class AdaugaCutieViteze implements Car {
    public Car c;

    AdaugaCutieViteze(Car cv){
        c=cv;
    }

    @Override
    public String descrie(){
        return null;
    }

    @Override
    public void setCuloare(String culoare1) {
        this.c.setCuloare(culoare1);
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
    public void setCombustibil(String combustibil) {
        this.c.setCombustibil(combustibil);
    }
}

class AdaugaAutomata extends AdaugaCutieViteze {

    AdaugaAutomata(Car c){
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
        this.c.setCutie_viteze("automata");
        this.c.addPret(1200);
        return this.c.descrie();
    }
}

//_____________________________________________________

class AdaugaManuala extends AdaugaCutieViteze {
    AdaugaManuala(Car c){
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
        this.c.setCutie_viteze("manuala");
        this.c.addPret(1200);
        return this.c.descrie();
    }
}