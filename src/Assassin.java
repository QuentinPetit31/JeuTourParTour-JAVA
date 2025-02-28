public class Assassin extends Personnage {
    /*
     * Attributs
     * */
        private int bonusAttaque;

    /*
     * Constructeurs
     * */
        public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
            super(nom, vie, attaque, defense);
            this.bonusAttaque = bonusAttaque;
        }

    /*
     * Getters et Setters
     * */
        public int getBonusAttaque() {
            return bonusAttaque;
        }

        public void setBonusAttaque(int bonusAttaque) {
            this.bonusAttaque = bonusAttaque;
        }

    /*
     * Méthodes
     * */
        @Override
        public void attaquer(Personnage cible) {
            int degats = this.getAttaque() - cible.getDefense();
            if (Math.random() < 0.20) {
                degats += this.bonusAttaque;
            }
            if (degats > 0) {
                cible.setVie(cible.getVie() - degats);
            }
        }
}

