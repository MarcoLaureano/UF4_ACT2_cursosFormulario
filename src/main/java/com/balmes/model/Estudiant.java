package com.balmes.model;

import javax.persistence.*;

@Entity
@Table(name = "estudiant")
public class Estudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estudiant_id")
    private int estudiantId;

    @Column(name = "nom")
    private String EstudiantNom;

    @Column(name = "cognom")
    private String EstudiantCognom;

    @ManyToOne
    @JoinColumn(name = "curs_id")
    private Curs curs;

    public Estudiant() {}

    public Estudiant(String nom, String cognom, Curs curs) {
        this.EstudiantNom = nom;
        this.EstudiantCognom = cognom;
        this.curs = curs;
    }

    public int getEstudiantId() {
        return estudiantId;
    }

    public void setEstudiantId(int estudiantId) {
        this.estudiantId = estudiantId;
    }

    public String getEstudiantNom() {
        return EstudiantNom;
    }

    public void setEstudiantNom(String nom) {
        this.EstudiantNom = nom;
    }

    public String getEstudiantCognom() {
        return EstudiantCognom;
    }

    public void setEstudiantCognom(String cognom) {
        this.EstudiantCognom = cognom;
    }

    public Curs getCurs() {
        return curs;
    }

    public void setCurs(Curs curs) {
        this.curs = curs;
    }
}
