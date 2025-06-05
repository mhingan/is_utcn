package org.example.lab6.ex8;

public class VerificareNumarInmatriculare {

    boolean esteBucuresti = false;
    boolean esteIntulValid = false;
    boolean esteStringValid = false;


    //metoda care verifica daca judetul este Bucuresti, daaca da, returneaza treu, altfel returneaza false
    public boolean verificaJudet(NumarInmatriculare numarInmatriculare) {
        if (numarInmatriculare.getJudet().length() == 1) {
            if (numarInmatriculare.getJudet().charAt(0) == 'B' || numarInmatriculare.getJudet().charAt(0) == 'b') {
                //metoda returneaza true doar daca lungimea array-ului este = 1 si daca litera corespunzatoare indexului 0 este B
                esteBucuresti = true;
                return true;
            }
        } else if (numarInmatriculare.getJudet().length() > 2) {
            throw new IllegalArgumentException("JUDETUL NU ESTE VALID!");
        }

        return false;
    }



    //metoda care verifica numarul "int=ul", daca verificaJudet=true, atunci int-ul trebuie sa fie >= 100 si <= 999, daca verificaJudet=false int-ul trebie sa fie >1 si <99
    public boolean verificaNumarInt(NumarInmatriculare numarInmatriculare) {

        //verific daca este din bucuresti sau nu
        if(verificaJudet(numarInmatriculare)) {
            //in caz ca da, verifica daca are un int >100 si <999
            if(numarInmatriculare.getNumar()>=100 && numarInmatriculare.getNumar()<=999) {
                esteIntulValid = true;
                return true;
            }
            //in caz ca nu e din bucuresti, verific sa aiba un int >=1 si <=99
        } else if (!verificaJudet(numarInmatriculare)) {
            if(numarInmatriculare.getNumar()>=1 && numarInmatriculare.getNumar()<=99) {
                esteIntulValid = true;
                return true;
            }
            //in caz ca adauga litere sau un int <1 >999, arunc o eroare
        } else {
            throw new IllegalArgumentException("NUMARUL NU ESTE VALID!");
        }
        return false;
    }



    //metoda care verifica string-ul sa fie == 3 si sa contina numai litere
    public boolean verificaString(NumarInmatriculare numarInmatriculare) {
        //verifica daca primele doau metoda au treu, in caz contrat returnez false si arunc eroare
        if(verificaJudet(numarInmatriculare) && verificaNumarInt(numarInmatriculare)) {
            //daca e treu, verific lungimea si faptul ca string-ul contine numai litere
            String val = numarInmatriculare.getValAlfabatica();
            if(val.length()==3&&val.matches("[a-zA-Z]+")){
                //verifica daca prima si ultima litera e diferita de O sau I - conform cerintei
                if(val.charAt(0)!='O' || val.charAt(0)!='I' && val.charAt(2)!='O' || val.charAt(2)!='I'){
                    esteStringValid = true;
                    return true;
                }
            } else {
                throw new IllegalArgumentException("VALOAREA ALFABATICA NU ESTE VALIDA!");
            }
        }
        return false;
    }
}
