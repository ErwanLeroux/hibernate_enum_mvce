package fr.elendar.hibernate_enum_mvce.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "not_working")
public class EntityClassNotWorking {
    @Id
    private String id;

    @Column(name = "way", nullable = false, length = 1)
    @Enumerated(EnumType.STRING)
    private Way way;

    // https://vladmihalcea.com/hibernate-facts-equals-and-hashcode/
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityClassNotWorking other)) {
            return false;
        }
        return Objects.equals(getId(), other.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, way);
    }

    public String getId() {
        return id;
    }

    public Way getWay() {
        return way;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWay(Way way) {
        this.way = way;
    }
}
