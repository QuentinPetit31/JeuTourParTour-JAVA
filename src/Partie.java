class Partie {
    /*
     * Attributs
     * */
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    /*
     * Constructeurs
     * */
    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    /*
     * Getters et Setters
     * */
    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    /*
     * Méthodes
     * */
    public String lancerPartie() {
        while (nbrTour > 0) {
            joueur1.attaquer(joueur2);
            if (joueur2.getVie() <= 0) return "Le gagnant est " + joueur1.getNom();

            joueur2.attaquer(joueur1);
            if (joueur1.getVie() <= 0) return "Le gagnant est " + joueur2.getNom();

            nbrTour--;
        }

        if (joueur1.getVie() > 0 && joueur2.getVie() > 0) {
            return "Égalité";
        }
        return joueur1.getVie() > 0 ? "Le gagnant est " + joueur1.getNom() : "Le gagnant est " + joueur2.getNom();
    }
}
