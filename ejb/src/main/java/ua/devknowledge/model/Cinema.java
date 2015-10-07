package ua.devknowledge.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Cinemas")
public class Cinema extends BaseModel {

    private String name;

    @ManyToMany(mappedBy = "cinemas")
    private List<Film> films;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
