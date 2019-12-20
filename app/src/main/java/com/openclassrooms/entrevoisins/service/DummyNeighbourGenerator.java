package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {

    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "http://i.pravatar.cc/150?u=a042581f4e29026704d","Saint Pierre du mont", "+33686579014","caroline","Bonjour! je souhaite faire de al marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptible de m'accompagner! j'aime les jeux de cartes tels la belote et le tarot."),
            new Neighbour(2, "Jack", "http://i.pravatar.cc/150?u=a042581f4e29026704e"       ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(3, "Chloé", "http://i.pravatar.cc/150?u=a042581f4e29026704f"      ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(4, "Vincent", "http://i.pravatar.cc/150?u=a042581f4e29026704a"    ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."  ),
            new Neighbour(5, "Elodie", "http://i.pravatar.cc/150?u=a042581f4e29026704b"     ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(6, "Sylvain", "http://i.pravatar.cc/150?u=a042581f4e29026704c"    ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(7, "Laetitia", "http://i.pravatar.cc/150?u=a042581f4e29026703d"   ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(8, "Dan", "http://i.pravatar.cc/150?u=a042581f4e29026703b"        ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot.")    ,
            new Neighbour(9, "Joseph", "http://i.pravatar.cc/150?u=a042581f4e29026704d"     ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(10, "Emma", "http://i.pravatar.cc/150?u=a042581f4e29026706d"      ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(11, "Patrick", "http://i.pravatar.cc/150?u=a042581f4e29026702d"   ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot."),
            new Neighbour(12, "Ludovic", "http://i.pravatar.cc/150?u=a042581f3e39026702d"   ,"Saint Pierre du mont", "+33 6 86 57 90 14", "caroline", "Bonjour! je souhaite faire le la marche noridique, pas inititiée, je recherche une ou plusieur personne pour m'acconpagner!, j'aime aussi les jeux de cartes tel la belote et le tarot.")
    );


    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
