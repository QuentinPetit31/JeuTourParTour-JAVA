class Partie {
    /*
     * Attributs
     * */
    private final Personnage darkMax;
    private final Personnage covid19;
    private int nbrTour;

    /*
     * Constructeurs
     * */
    public Partie(Personnage darkMax, Personnage covid19, int nbrTour) {
        this.darkMax = darkMax;
        this.covid19 = covid19;
        this.nbrTour = nbrTour;
    }

    /*
     * Getters et Setters
     * */
    public Personnage getDarkMax() {
        return darkMax;
    }

    public void setJoueur1(Personnage darkMax) {
        this.darkMax = darkMax;
    }

    public Personnage getCovid19() {
        return covid19;
    }

    public void setCovid19(Personnage covid19) {
        this.covid19 = covid19;
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
            darkMax.attaquer(covid19);
            if (covid19.getVie() <= 0) return "Le gagnant est " + darkMax.getNom();

            covid19.attaquer(darkMax);
            if (darkMax.getVie() <= 0) return "Le gagnant est " + covid19.getNom();

            nbrTour--;
        }

        if (darkMax.getVie() > 0 && covid19.getVie() > 0) {
            return "Égalité";
        }
        return darkMax.getVie() > 0 ? "Le gagnant est " + darkMax.getNom() : "Le gagnant est " + covid19.getNom();
    }
}
