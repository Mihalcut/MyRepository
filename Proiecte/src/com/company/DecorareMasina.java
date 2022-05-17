package com.company;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Mihalcut, Dragomir
 *
 */

interface Car{
    String descrie();
    void setCuloare(String culoare1);
    void addPret(int pret);
    void setCutie_viteze(String cViteze);
    void setCombustibil(String combustibil);
}

/**
 * 
 * @deprecated
 *definirea modelului de masina A6 Allroad Quattro
 *
 */
class Audi_A6_allroad_quattro implements Car{
    public String model="Audi A6 allroad quattro";
    public String combustibil="motorina";
    public int pret=67700;
    public String culoare="alb";
    public String cutie_viteze="manuala";

    @Override
    public String descrie() {
        return "Masina de model "+model+", de culoare "+culoare+", de pret "+pret+ ", cu cutie " + cutie_viteze+", tip combustibil " + combustibil;
    }

    @Override
    public void setCuloare(String culoare1) {
        this.culoare=culoare1;
    }

    @Override
    public void addPret(int pret) {
        this.pret += pret;
    }

    @Override
    public void setCutie_viteze(String cViteze) {
        this.cutie_viteze= cViteze;
    }

    @Override
    public void setCombustibil(String combustibil) {
        this.combustibil=combustibil;
    }
}

/**
 * 
 * @deprecated
 *definirea modelului de masina A7 Sportback
 *
 */
class Audi_A7_Sportback implements Car{
    public String model="Audi A7 Sportback";
    public String combustibil="benzina";
    public int pret=68100;
    public String culoare="alb";
    public String cutie_viteze="automata";

    @Override
    public String descrie() {
        return "Masina de model "+model+", de culoare "+culoare+", de pret "+pret+ ", cu cutie " + cutie_viteze+", tip combustibil " + combustibil;
    }

    @Override
    public void setCuloare(String culoare1) {
        this.culoare=culoare1;
    }

    @Override
    public void addPret(int pret) {
        this.pret += pret;
    }

    @Override
    public void setCutie_viteze(String cViteze) {
        this.cutie_viteze= cViteze;
    }

    @Override
    public void setCombustibil(String combustibil) {
        this.combustibil=combustibil;
    }
}

/**
 * 
 * @deprecated
 *Decorarea modelului ales
 *
 *@throws
 *Inexistenta unei optiuni introduse
 *
 *@return
 *Obiectul decorat
 *
 */
public class DecorareMasina {
        static Car decorare() {
            Car c;  // Obiectul asupra caruia aplicam decoratorii
            System.out.println("Alegeti dintre unul din modelele:Audi A6 allroad quattro, Audi A7 Sportback ");
            Scanner intrare = new Scanner(System.in);
            String model = intrare.nextLine().toLowerCase();
            if (model.equals("audi a6 allroad quattro"))  // Interactiunea cu utilizatorul si analiza alegerilor facute
                c = new Audi_A6_allroad_quattro();
            else if (model.equals("audi a7 sportback"))
                c = new Audi_A7_Sportback();
            else
                throw new UnsupportedOperationException("Nu exista optiunea aleasa!");  // La introducerea unei variante gresite se va arunca o exceptie
            System.out.println("Alegeti  una din culorile:negru, albastru, gri");
            String culoare= intrare.nextLine().toLowerCase();
            if (culoare.equals("negru"))
                c=new AdaugaNegru(c);
            else if (culoare.equals("albastru"))
                c=new AdaugaAlbastru(c);
            else if (culoare.equals("gri"))
                c=new AdaugaGri(c);
                else
                    throw new UnsupportedOperationException("Nu exista optiunea aleasa!");
            System.out.println("Alegeti  una din cutiile de viteze: manuala sau automata");
            String cutie_viteze= intrare.nextLine().toLowerCase();
            if (cutie_viteze.equals("manuala"))
                c=new AdaugaManuala(c);
            else if (cutie_viteze.equals("automata"))
                c=new AdaugaAutomata(c);
            else
                throw new UnsupportedOperationException("Nu exista optiunea aleasa!");
            System.out.println("Alegeti  unul din combustibilii: motorina sau benzina");
            String combustibil= intrare.next().toLowerCase();
            if (combustibil.equals("benzina"))
                c=new AdaugaBenzina(c);
            else if (combustibil.equals("motorina"))
                c=new AdaugaMotorina(c);
            else
                throw new UnsupportedOperationException("Nu exista optiunea aleasa!");

            JFrame frame = new JFrame();  // Crearea frame-ului
            frame.setBounds(100, 100, 1500, 1500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            if(model.equals("audi a6 allroad quattro")&& culoare.equals("albastru")) // In functie de alegerile facute la final se va afisa obiectul decorat
                frame.add(new JLabel(new ImageIcon("./src/com/company/6al.png")));
            else if(model.equals("audi a6 allroad quattro")&& culoare.equals("negru"))
                frame.add(new JLabel(new ImageIcon("./src/com/company/6ne.png")));
            else if(model.equals("audi a6 allroad quattro")&& culoare.equals("gri"))
                frame.add(new JLabel(new ImageIcon("./src/com/company/6gri.png")));
            else if(model.equals("audi a7 sportback")&& culoare.equals("gri"))
                frame.add(new JLabel(new ImageIcon("./src/com/company/7gri.png")));
            else if(model.equals("audi a7 sportback")&& culoare.equals("albastru"))
                frame.add(new JLabel(new ImageIcon("./src/com/company/7al.png")));
            else if(model.equals("audi a7 sportback")&& culoare.equals("negru"))
                frame.add(new JLabel(new ImageIcon("./src/com/company/7ne.png")));
            frame.setVisible(true); // seteaza ca vizibil frame-ul
            //frame.revalidate();
            intrare.close();

            return c;
        }

    public static void main(String[] args) {
        Car masina = decorare();
        System.out.println(masina.descrie());
    }
}
