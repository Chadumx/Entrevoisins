package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {

    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "http://i.pravatar.cc/150?u=a042581f4e29026704d", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(2, "Jack", "http://i.pravatar.cc/150?u=a042581f4e29026704e", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(3, "Chloé", "http://i.pravatar.cc/150?u=a042581f4e29026704f", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(4, "Vincent", "http://i.pravatar.cc/150?u=a042581f4e29026704a", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(5, "Elodie", "http://i.pravatar.cc/150?u=a042581f4e29026704b", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(6, "Sylvain", "http://i.pravatar.cc/150?u=a042581f4e29026704c", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(7, "Laetitia", "http://i.pravatar.cc/150?u=a042581f4e29026703d", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(8, "Dan", "http://i.pravatar.cc/150?u=a042581f4e29026703b", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(9, "Joseph", "http://i.pravatar.cc/150?u=a042581f4e29026704d", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(10, "Emma", "http://i.pravatar.cc/150?u=a042581f4e29026706d", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(11, "Patrick", "http://i.pravatar.cc/150?u=a042581f4e29026702d", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot..."),
            new Neighbour(12, "Ludovic", "http://i.pravatar.cc/150?u=a042581f3e39026702d", false, "Saint pierre du mont a 5 Km", "+33 6 86 57 90 14", "www.facebook.fr/caroline", "Bonjour ! Je souhaiterais faire de la marche nordique. Pas initié, je recherhce une ou plusieurs personnes susceptibles de m'accompagner ! J'aime les jeux de cartes tels la belote et le tarot...")
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
