
public class Main {
    public static void main(String[] args) {
        Assassin assassin = new Assassin("Assassin", 18, 6, 2, 5);
        Guerrier guerrier = new Guerrier("Guerrier", 20, 5, 3, 3);

        Partie partie = new Partie(assassin, guerrier, 20);

        partie.lancerPartie();
    }
}
