package com.myapp.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.BooleanFilter;
import tech.jhipster.service.filter.DoubleFilter;
import tech.jhipster.service.filter.Filter;
import tech.jhipster.service.filter.FloatFilter;
import tech.jhipster.service.filter.IntegerFilter;
import tech.jhipster.service.filter.LongFilter;
import tech.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link com.myapp.domain.Facility} entity. This class is used
 * in {@link com.myapp.web.rest.FacilityResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /facilities?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
public class FacilityCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private BooleanFilter aC;

    private BooleanFilter parking;

    private BooleanFilter wifi;

    private LongFilter roomidId;

    private Boolean distinct;

    public FacilityCriteria() {}

    public FacilityCriteria(FacilityCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.aC = other.aC == null ? null : other.aC.copy();
        this.parking = other.parking == null ? null : other.parking.copy();
        this.wifi = other.wifi == null ? null : other.wifi.copy();
        this.roomidId = other.roomidId == null ? null : other.roomidId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public FacilityCriteria copy() {
        return new FacilityCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public BooleanFilter getaC() {
        return aC;
    }

    public BooleanFilter aC() {
        if (aC == null) {
            aC = new BooleanFilter();
        }
        return aC;
    }

    public void setaC(BooleanFilter aC) {
        this.aC = aC;
    }

    public BooleanFilter getParking() {
        return parking;
    }

    public BooleanFilter parking() {
        if (parking == null) {
            parking = new BooleanFilter();
        }
        return parking;
    }

    public void setParking(BooleanFilter parking) {
        this.parking = parking;
    }

    public BooleanFilter getWifi() {
        return wifi;
    }

    public BooleanFilter wifi() {
        if (wifi == null) {
            wifi = new BooleanFilter();
        }
        return wifi;
    }

    public void setWifi(BooleanFilter wifi) {
        this.wifi = wifi;
    }

    public LongFilter getRoomidId() {
        return roomidId;
    }

    public LongFilter roomidId() {
        if (roomidId == null) {
            roomidId = new LongFilter();
        }
        return roomidId;
    }

    public void setRoomidId(LongFilter roomidId) {
        this.roomidId = roomidId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final FacilityCriteria that = (FacilityCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(aC, that.aC) &&
            Objects.equals(parking, that.parking) &&
            Objects.equals(wifi, that.wifi) &&
            Objects.equals(roomidId, that.roomidId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aC, parking, wifi, roomidId, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FacilityCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (aC != null ? "aC=" + aC + ", " : "") +
            (parking != null ? "parking=" + parking + ", " : "") +
            (wifi != null ? "wifi=" + wifi + ", " : "") +
            (roomidId != null ? "roomidId=" + roomidId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
