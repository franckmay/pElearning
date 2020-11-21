package core;

import java.util.Date;

public class Chapitre {

    private int id;
    private int id_cour;
    private String nom;
    private Date date;

    public Chapitre() {
    }

    public int getId() {
        return id;
    }

    public int getId_cour() {
        return id_cour;
    }

    public void setId_cour(int id_cour) {
        this.id_cour = id_cour;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
