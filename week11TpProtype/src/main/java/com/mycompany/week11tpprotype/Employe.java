/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week11tpprotype;

/**
 *
 * @author JiJi
 */
public class Employe implements Prototype{
    
    private int id;
    private String nom;
    private String matricule;
    private double salaire;

    public Employe() {
    }

    public Employe(int id, String nom, String matricule, double salaire) {
        this.id = id;
        this.nom = nom;
        this.matricule = matricule;
        this.salaire = salaire;
    }

    public int getId() {
        return id;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", matricule=" + matricule + ", salaire=" + salaire + '}';
    }

    @Override
    public Prototype getClone() {
        return new Employe(id, nom, matricule, salaire);
    }
    
    
    
    
    
}
