package com.jeromegide.tp_cinema_springboot.tp_cinema_springboot.model;

public class Film{
    private String titre;
    private Double notation;

    public String getAffiche() {
        return affiche;
    }

    public void setAffiche(String affiche) {
        this.affiche = affiche;
    }


    private String affiche;
    private String resume;
    private Personne realisateur;


    public Film(String titre, Double notation, String affiche, String resume, Personne realisateur) {
        this.titre = titre;
        this.notation = notation;
        this.resume = resume;
        this.realisateur = realisateur;
    }

    public Film() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Double getNotation() {
        return notation;
    }

    public void setNotation(Double notation) {
        this.notation = notation;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Personne getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Personne realisateur) {
        this.realisateur = realisateur;
    }
}