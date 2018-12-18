package fr.camelia.cda.cinema.model;

import java.util.Objects;

public class Role {
    private int id;
    Film film;
    Personne personne;
    String alias;
    int ordre;

    public Role(int id ,Film film, Personne perssone, String alias, int ordre) {
        this.id=id;
        this.film = film;
        this.personne = perssone;
        this.alias = alias;
        this.ordre = ordre;
    }

    public Film getFilm() {
        return film;

    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Personne getPerssone() {
        return personne;
    }

    public void setPerssone(Personne perssone) {
        this.personne = perssone;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getNumero() {
        return ordre;
    }

    public void setNumero(int numero) {
        this.ordre = numero;
    }

    public String toString() {
        return "Role{" +
                "Film='" + film.getTitre()+ '\'' +
                ", Personne=" + personne.getPrenom() +
                ", String='" + alias + '\'' +
                '}';
    }
    public int getIdr() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return Objects.equals(getFilm(), role.getFilm()) &&
                Objects.equals(getPerssone(), role.getPerssone()) &&
                Objects.equals(getAlias(), role.getAlias()) &&
                Objects.equals(getNumero(), role.getNumero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFilm(), getPerssone(), getAlias(), getNumero());
    }
}
