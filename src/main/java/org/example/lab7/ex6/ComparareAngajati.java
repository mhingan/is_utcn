package org.example.lab7.ex6;

import java.util.Comparator;

public class ComparareAngajati implements Comparator<Angajat> {
    @Override
    public int compare(Angajat a1, Angajat a2) {
        {
            // Comparam numele angajatilor in ordine alfabetica (crescatoare)
            if (a1.getName().compareTo(a2.getName()) < 0)
                return -1;

            // Daca numele lui a1 este mai mare decat al lui a2, il punem dupa
            if (a1.getName().compareTo(a2.getName()) > 0)
                return 1;

            // Daca numele sunt egale, comparam varstele descrescator (mai tanar dupa mai batran)
            return a2.getAge() - a1.getAge();
        }
    }

}
