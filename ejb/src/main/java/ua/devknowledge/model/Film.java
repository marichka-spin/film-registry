package ua.devknowledge.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Films")
public class Film extends BaseModel {

    private String title;

    @ManyToMany
    @JoinTable(name = "Cinema_Film",
            joinColumns = @JoinColumn(name = "cinId"),
            inverseJoinColumns = @JoinColumn(name = "filmId"))
    private List<Cinema> cinemas;

    @ManyToMany
    @JoinTable(name = "Actor_Film",
            joinColumns = @JoinColumn(name = "actId"),
            inverseJoinColumns = @JoinColumn(name = "filmId"))
    private List<Actor> actors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
