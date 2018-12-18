package fr.camelia.cda.cinema.dao;

/**
 * Modele de données en mémoire pour l'application cinéma
 *
 * Travail à faire : ajouter les rôles des acteurs dans les films sachant que, par ordre d'affiche :
 *    dans Le juge et l'assassin
 *      Noiret joue Le juge Rousseau
 *      Galabru joue Joseph Bouvier
 *      Huppert joue Rose
 *    dans La guerre des étoiles
 *      Hamill joue Luke Skywalker
 *      Ford joue Han Solo
 *      Fisher joue Princesse Leia Organa
 *    dans Pretty Woman
 *      Gere joue Edward Lewis
 *      Roberts joue Vivian Ward
 *      Bellamy joue James
 *    dans Légendes d'automne
 *      Hopkins joue Colonel William Ludlow
 *      Pitt joue Tristan Ludlow
 *      Quinn joue Alfred Ludlow
 *      Thomas joue Samuel Ludlow
 *    dans ET
 *      Thomas joue Eliott
 *      Barrymore joue Gertie
 *      Wallace Stone joue Mary
 *    dans Ben Hur
 *      Heston joue Judas Ben-Hur
 *      Boyd joue Messala
 *      Hawkins joue Quintus Arrius
 */

import fr.camelia.cda.cinema.model.Film;
import fr.camelia.cda.cinema.model.Role;
import fr.camelia.cda.cinema.model.Personne;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import java.util.List;

@Component

public class DataModel {

    private List<Personne> personnes = new ArrayList<>();
    private List<Film> films = new ArrayList<>();
    private List<Role> roles= new ArrayList<>();


    public DataModel() {

        personnes.add(new Personne(1,"Noiret", "Phillipe", 1930, "p0001.jpg"));
        personnes.add(new Personne(2,"Galabru", "Michel", 1922, "p0002.jpg"));
        personnes.add(new Personne(3,"Huppert", "Isabelle", 1953, "p0003.jpg"));
        personnes.add(new Personne(4,"Hamill", "Mark", 1951, "p0004.jpg"));
        personnes.add(new Personne(5,"Ford", "Harrison", 1942, "p0005.jpg"));
        personnes.add(new Personne(6,"Fisher", "Carrie", 1956, "p0006.jpg"));
        personnes.add(new Personne(7,"Gere", "Richard", 1949, "p0007.jpg"));
        personnes.add(new Personne(8,"Roberts", "Julia", 1967, "p0008.jpg"));
        personnes.add(new Personne(9,"Bellamy", "Ralph", 1904, "p0009.jpg"));
        personnes.add(new Personne(10,"Hopkins", "Anthony", 1937, "p0010.jpg"));
        personnes.add(new Personne(11,"Pitt", "William Bradley", 1963, "p0011.jpg"));
        personnes.add(new Personne(12,"Quinn", "Aidan", 1959, "p0012.jpg"));
        personnes.add(new Personne(13,"Thomas", "Henry", 1971, "p0013.jpg"));
        personnes.add(new Personne(14,"Barrymore", "Drew Bythe", 1975, "p0014.jpg"));
        personnes.add(new Personne(15,"Wallace Stone", "Dee", 1948, "p0015.jpg"));
        personnes.add(new Personne(16,"Heston", "Charlton", 1923, "p0016.jpg"));
        personnes.add(new Personne(17,"Boyd", "Stephen", 1928, "p0017.jpg"));
        personnes.add(new Personne(18,"Hawkins", "Jack", 1910, "p0018.jpg"));
        personnes.add(new Personne(19,"Tavernier", "Bertrand", 1941, "p0110.jpg"));
        personnes.add(new Personne(20,"Lucas", "Georges", 1944, "p0045.jpg"));
        personnes.add(new Personne(21,"Marshall", "Garry", 1934, "p0098.jpg"));
        personnes.add(new Personne(22,"Wyler", "William", 1902, "p0044.jpg"));
        personnes.add(new Personne(23,"Spielberg", "Steven", 1946, "p0019.jpg"));
        personnes.add(new Personne(24,"Zwick", "Edward", 1952, "p0020.jpg"));

        films.add(new Film(1,"Le juge et l'assassin",
                3.8,
                "f0001.jpg",
                "Fin du XIXème, " +
                "Joseph Bouvier est révoqué de l'armée à cause de ses excès de violence. Suite à ce renvoi, l'homme " +
                "s'attaque à sa fiancée et tente de se suicider, en vain. Après un séjour en hôpital psychiatrique, " +
                "Joseph ressort de cet endroit encore plus enragé et décide de se venger sur toutes les personnes qui " +
                "croiseront son chemin en Ardèche. Non loin de là, le juge Rousseau, passionné par l'affaire, prend " +
                "part à l'investigation et se met sur les traces de Bouvier. Bien décidé à le mettre sous les verrous, " +
                "c'est le début d'une chasse à l'homme...",
                personnes.get(18)));
        films.add(new Film(2,"La guerre des étoiles",
                4.4,
                "f0002.jpg",
                "Il y a bien longtemps, dans une galaxie très lointaine... La guerre civile fait rage entre " +
                        "l'Empire galactique et l'Alliance rebelle. Capturée par les troupes de choc de l'Empereur " +
                        "menées par le sombre et impitoyable Dark Vador, la princesse Leia Organa dissimule les plans " +
                        "de l'Etoile Noire, une station spatiale invulnérable, à son droïde R2-D2 avec pour mission de " +
                        "les remettre au Jedi Obi-Wan Kenobi. Accompagné de son fidèle compagnon, le droïde de " +
                        "protocole C-3PO, R2-D2 s'échoue sur la planète Tatooine et termine sa quête chez le jeune " +
                        "Luke Skywalker. Rêvant de devenir pilote mais confiné aux travaux de la ferme, ce dernier " +
                        "se lance à la recherche de ce mystérieux Obi-Wan Kenobi, devenu ermite au coeur des montagnes " +
                        "désertiques de Tatooine...",
                personnes.get(19)));
        films.add(new Film(3,"Pretty woman",
                3.5,
                "f0003.jpg",
                "Edward Lewis, homme d'affaires performant, rencontre par hasard Vivian Ward, beaute fatale " +
                        "qui arpente chaque nuit les trottoirs d'Hollywood Boulevard. La jeune femme ne fera qu'une " +
                        "bouchee du brillant PDG.",
                personnes.get(20)));
        films.add(new Film(4,"BEN-HUR",
                4.0,
                "f0006.jpg",
                "Judas Ben-Hur, " +
                        "prince de Judée, retrouve son ami d'enfance Messala, venu prendre la tête de la garnison de " +
                        "Jérusalem. Mais leur amitié ne peut résister à leurs caractères différents. Alors qu'une " +
                        "pierre tombe du balcon de la maison familiale de Ben-Hur, manquant de tuer le gouverneur " +
                        "qui paradait plus bas, Messala trahit son ami qu'il sait innocent en l'envoyant aux galères " +
                        "et en jetant en prison sa mère et sa sœur. Ben-Hur jure alors de reconquérir sa liberté " +
                        "et prépare sa vengeance.",
                personnes.get(21)));
        films.add(new Film(5,"E.T. l'extra-terrestre",
                4.2,
                "f0005.jpg",
                "Une soucoupe volante atterrit en pleine nuit près de Los Angeles. Quelques extraterrestres, " +
                        "envoyés sur Terre en mission d'exploration botanique, sortent de l'engin, mais un des leurs " +
                        "s'aventure au-delà de la clairière où se trouve la navette. Celui-ci se dirige alors vers " +
                        "la ville. C'est sa première découverte de la civilisation humaine. Bientôt traquée par des " +
                        "militaires et abandonnée par les siens, cette petite créature apeurée se nommant E.T. se " +
                        "réfugie dans une résidence de banlieue. Elliot, un garçon de dix ans, le découvre et lui " +
                        "construit un abri dans son armoire. Rapprochés par un échange télépathique, les deux êtres " +
                        "ne tardent pas à devenir amis. Aidé par sa soeur Gertie et son frère aîné Michael, Elliot " +
                        "va alors tenter de garder la présence d'E.T. secrète.",
                personnes.get(22)));
        films.add(new Film(6,"Légendes d'automne",
                3.9,
                "f0004.jpg",
                "Au cœur des contrées sauvages du Montana, trois frères, Alfred, Tristan et Samuel sont " +
                        "élevés par leur père, le colonel William Ludlow et ses amis indiens. Un jour, Samuel, " +
                        "le plus fragile, présente sa ravissante fiancée, Susannah à sa famille. Les trois jeunes " +
                        "hommes s’engagent dans la première Guerre Mondiale et Samuel décède sur le champ de " +
                        "bataille. A leur retour, Tristan et Alfred se battent pour conquérir le cœur de " +
                        "la belle veuve.",
                personnes.get(23)));



        Role r;
        r = new Role(1,films.get(0), personnes.get(0), "Le juge Rousseau", 1);
        roles.add(r);
        films.get(0).addRole(r);
        personnes.get(0).addRole(r);
        r = new Role(2,films.get(0), personnes.get(1), "Le juge Rousseau", 2);
        roles.add(r);
        films.get(0).addRole(r);
        personnes.get(1).addRole(r);
        r = new Role(3,films.get(0), personnes.get(2), "Le juge Rousseau", 3);
        roles.add(r);
        films.get(0).addRole(r);
        personnes.get(2).addRole(r);
        r = new Role(4,films.get(1), personnes.get(3), "Le juge Rousseau", 1);
        roles.add(r);
        personnes.get(3).addRole(r);
        r = new Role(4,films.get(1), personnes.get(0), "hamin", 1);
        roles.add(r);
        personnes.get(3).addRole(r);

        r = new Role(1,films.get(1), personnes.get(0), "haha", 1);
        roles.add(r);
        films.get(1).addRole(r);
        personnes.get(0).addRole(r);




    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public List<Role> getRoles() {
        return  roles;
    }

    public List<Film> getFilms() {
        return films;
    }

    public Film getById(int id){
        Film film = null;
        for (Film f: films
        ) {
            if(f.getId() == id){
                film = f;
            }
        }
        return film;
    }
    public Personne getByIdp (int id){
        Personne person = null;
        for (Personne p:personnes
        ) {
           if(p.getIdp() == id){
                person = p;
            }
        }
        return person;
    }

       // public Personne getByLastName(String lName){
            //Personne personne = null;
            //for (Personne p : personnes){
               // if ( p.getNom().equals(lName) ){
                   // personne = p;
                //}
         //   }
          //  return personne;
        //}


    //public Role getByIdr (int id){
       // Role rol = null;
       // for (Role r:roles
       // ) {
           // if(r.getIdr() == id){
                //rol= r;
          //  }
       // }
       // return rol;




}
