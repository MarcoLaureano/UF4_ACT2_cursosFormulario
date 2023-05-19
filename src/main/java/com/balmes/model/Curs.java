package com.balmes.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "curs")
public class Curs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curs_id")
    private int cursId;

    @Column(name = "titol")
    private String titol;

    @Column(name = "descripcio")
    private String descripcio;

    @Column(name = "url")
    private String url;

    @OneToMany(mappedBy = "curs", cascade = CascadeType.ALL)
    private List<Estudiant> estudiants = new ArrayList<>();

    public Curs() {}

    public Curs(String titol, String descripcio, String url) {
        this.titol = titol;
        this.descripcio = descripcio;
        this.url = url;
    }

    public int getCursId() {
        return cursId;
    }

    public void setCursId(int cursId) {
        this.cursId = cursId;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Estudiant> getEstudiants() {
        return estudiants;
    }

    public void setEstudiants(List<Estudiant> estudiants) {
        this.estudiants = estudiants;
    }
}
