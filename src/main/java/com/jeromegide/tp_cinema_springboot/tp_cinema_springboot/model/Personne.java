package com.jeromegide.tp_cinema_springboot.tp_cinema_springboot.model;

import java.util.Objects;

public class Personne{
    private String nom, prenom, photoPath;
    private Integer naissance;

    public Personne(String nom, String prenom, Integer naissance, String photoPath) {
        this.nom = nom;
        this.prenom = prenom;
        this.photoPath = photoPath;
        this.naissance = naissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", naissance=" + naissance +
                '}';
    }


}
