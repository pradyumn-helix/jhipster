package com.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Room.
 */
@Entity
@Table(name = "room")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "roomno", nullable = false, unique = true)
    private String roomno;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "type")
    private String type;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Room id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomno() {
        return this.roomno;
    }

    public Room roomno(String roomno) {
        this.setRoomno(roomno);
        return this;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public Integer getFloor() {
        return this.floor;
    }

    public Room floor(Integer floor) {
        this.setFloor(floor);
        return this;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getType() {
        return this.type;
    }

    public Room type(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Room)) {
            return false;
        }
        return id != null && id.equals(((Room) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Room{" +
            "id=" + getId() +
            ", roomno='" + getRoomno() + "'" +
            ", floor=" + getFloor() +
            ", type='" + getType() + "'" +
            "}";
    }
}
