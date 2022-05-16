package com.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Facility.
 */
@Entity
@Table(name = "facility")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Facility implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "a_c")
    private Boolean aC;

    @Column(name = "parking")
    private Boolean parking;

    @Column(name = "wifi")
    private Boolean wifi;

    @ManyToOne
    private Room roomid;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Facility id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getaC() {
        return this.aC;
    }

    public Facility aC(Boolean aC) {
        this.setaC(aC);
        return this;
    }

    public void setaC(Boolean aC) {
        this.aC = aC;
    }

    public Boolean getParking() {
        return this.parking;
    }

    public Facility parking(Boolean parking) {
        this.setParking(parking);
        return this;
    }

    public void setParking(Boolean parking) {
        this.parking = parking;
    }

    public Boolean getWifi() {
        return this.wifi;
    }

    public Facility wifi(Boolean wifi) {
        this.setWifi(wifi);
        return this;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Room getRoomid() {
        return this.roomid;
    }

    public void setRoomid(Room room) {
        this.roomid = room;
    }

    public Facility roomid(Room room) {
        this.setRoomid(room);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Facility)) {
            return false;
        }
        return id != null && id.equals(((Facility) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Facility{" +
            "id=" + getId() +
            ", aC='" + getaC() + "'" +
            ", parking='" + getParking() + "'" +
            ", wifi='" + getWifi() + "'" +
            "}";
    }
}
