public class Personnage {
    /*
     * Attributs
     * */
    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    /*
     * Constructeurs
     * */

        public Personnage(String nom, int vie, int attaque, int defense) {
            this.nom = nom;
            this.vie = vie;
            this.attaque = attaque;
            this.defense = defense;
        }

    /*
     * Getters et Setters
     * */
        public String getNom() {
            return nom;
        }

        public int getVie() {
            return vie;
        }

        public int getAttaque() {
            return attaque;
        }

        public int getDefense() {
            return defense;
        }

        // Setters
        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setVie(int vie) {
            this.vie = vie;
        }

        public void setAttaque(int attaque) {
            this.attaque = attaque;
        }

        public void setDefense(int defense) {
            this.defense = defense;
        }
    }

    /*
     * Méthodes
     * */

    public void attaquer(Personnage cible) {
        int degats = this.attaque - cible.getDefense();
        if (degats > 0) {
            cible.setVie(cible.getVie() - degats);
        }


}
