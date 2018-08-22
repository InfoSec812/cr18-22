package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "old_isa_marking_structures", schema = "example_database", catalog = "")
public class OldIsaMarkingStructures {
    private int id;
    private String csClassification;
    private String csCountries;
    private String csCui;
    private String csEntity;
    private String csFormalDetermination;
    private String csInfoCaveat;
    private String csOrgs;
    private String csShargrp;
    private String guid;
    private String isDefaultMarking;
    private String isReference;
    private String markingModelType;
    private String privilegeDefault;
    private byte publicRelease;
    private String publicReleasedBy;
    private Timestamp publicReleasedOn;
    private String reCustodian;
    private Timestamp reDataItemCreatedAt;
    private String reOriginator;
    private String stixId;
    private String stixMarkingGuid;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cs_classification", nullable = true, length = 255)
    public String getCsClassification() {
        return csClassification;
    }

    public void setCsClassification(String csClassification) {
        this.csClassification = csClassification;
    }

    @Basic
    @Column(name = "cs_countries", nullable = true, length = 1000)
    public String getCsCountries() {
        return csCountries;
    }

    public void setCsCountries(String csCountries) {
        this.csCountries = csCountries;
    }

    @Basic
    @Column(name = "cs_cui", nullable = true, length = 255)
    public String getCsCui() {
        return csCui;
    }

    public void setCsCui(String csCui) {
        this.csCui = csCui;
    }

    @Basic
    @Column(name = "cs_entity", nullable = true, length = 255)
    public String getCsEntity() {
        return csEntity;
    }

    public void setCsEntity(String csEntity) {
        this.csEntity = csEntity;
    }

    @Basic
    @Column(name = "cs_formal_determination", nullable = true, length = 255)
    public String getCsFormalDetermination() {
        return csFormalDetermination;
    }

    public void setCsFormalDetermination(String csFormalDetermination) {
        this.csFormalDetermination = csFormalDetermination;
    }

    @Basic
    @Column(name = "cs_info_caveat", nullable = true, length = 255)
    public String getCsInfoCaveat() {
        return csInfoCaveat;
    }

    public void setCsInfoCaveat(String csInfoCaveat) {
        this.csInfoCaveat = csInfoCaveat;
    }

    @Basic
    @Column(name = "cs_orgs", nullable = true, length = 255)
    public String getCsOrgs() {
        return csOrgs;
    }

    public void setCsOrgs(String csOrgs) {
        this.csOrgs = csOrgs;
    }

    @Basic
    @Column(name = "cs_shargrp", nullable = true, length = 255)
    public String getCsShargrp() {
        return csShargrp;
    }

    public void setCsShargrp(String csShargrp) {
        this.csShargrp = csShargrp;
    }

    @Basic
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "is_default_marking", nullable = false, length = 255)
    public String getIsDefaultMarking() {
        return isDefaultMarking;
    }

    public void setIsDefaultMarking(String isDefaultMarking) {
        this.isDefaultMarking = isDefaultMarking;
    }

    @Basic
    @Column(name = "is_reference", nullable = false, length = 255)
    public String getIsReference() {
        return isReference;
    }

    public void setIsReference(String isReference) {
        this.isReference = isReference;
    }

    @Basic
    @Column(name = "marking_model_type", nullable = true, length = 255)
    public String getMarkingModelType() {
        return markingModelType;
    }

    public void setMarkingModelType(String markingModelType) {
        this.markingModelType = markingModelType;
    }

    @Basic
    @Column(name = "privilege_default", nullable = false, length = 255)
    public String getPrivilegeDefault() {
        return privilegeDefault;
    }

    public void setPrivilegeDefault(String privilegeDefault) {
        this.privilegeDefault = privilegeDefault;
    }

    @Basic
    @Column(name = "public_release", nullable = false)
    public byte getPublicRelease() {
        return publicRelease;
    }

    public void setPublicRelease(byte publicRelease) {
        this.publicRelease = publicRelease;
    }

    @Basic
    @Column(name = "public_released_by", nullable = true, length = 255)
    public String getPublicReleasedBy() {
        return publicReleasedBy;
    }

    public void setPublicReleasedBy(String publicReleasedBy) {
        this.publicReleasedBy = publicReleasedBy;
    }

    @Basic
    @Column(name = "public_released_on", nullable = true)
    public Timestamp getPublicReleasedOn() {
        return publicReleasedOn;
    }

    public void setPublicReleasedOn(Timestamp publicReleasedOn) {
        this.publicReleasedOn = publicReleasedOn;
    }

    @Basic
    @Column(name = "re_custodian", nullable = true, length = 255)
    public String getReCustodian() {
        return reCustodian;
    }

    public void setReCustodian(String reCustodian) {
        this.reCustodian = reCustodian;
    }

    @Basic
    @Column(name = "re_data_item_created_at", nullable = true)
    public Timestamp getReDataItemCreatedAt() {
        return reDataItemCreatedAt;
    }

    public void setReDataItemCreatedAt(Timestamp reDataItemCreatedAt) {
        this.reDataItemCreatedAt = reDataItemCreatedAt;
    }

    @Basic
    @Column(name = "re_originator", nullable = true, length = 255)
    public String getReOriginator() {
        return reOriginator;
    }

    public void setReOriginator(String reOriginator) {
        this.reOriginator = reOriginator;
    }

    @Basic
    @Column(name = "stix_id", nullable = true, length = 255)
    public String getStixId() {
        return stixId;
    }

    public void setStixId(String stixId) {
        this.stixId = stixId;
    }

    @Basic
    @Column(name = "stix_marking_guid", nullable = true, length = 255)
    public String getStixMarkingGuid() {
        return stixMarkingGuid;
    }

    public void setStixMarkingGuid(String stixMarkingGuid) {
        this.stixMarkingGuid = stixMarkingGuid;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldIsaMarkingStructures that = (OldIsaMarkingStructures) o;
        return id == that.id &&
                publicRelease == that.publicRelease &&
                Objects.equals(csClassification, that.csClassification) &&
                Objects.equals(csCountries, that.csCountries) &&
                Objects.equals(csCui, that.csCui) &&
                Objects.equals(csEntity, that.csEntity) &&
                Objects.equals(csFormalDetermination, that.csFormalDetermination) &&
                Objects.equals(csInfoCaveat, that.csInfoCaveat) &&
                Objects.equals(csOrgs, that.csOrgs) &&
                Objects.equals(csShargrp, that.csShargrp) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(isDefaultMarking, that.isDefaultMarking) &&
                Objects.equals(isReference, that.isReference) &&
                Objects.equals(markingModelType, that.markingModelType) &&
                Objects.equals(privilegeDefault, that.privilegeDefault) &&
                Objects.equals(publicReleasedBy, that.publicReleasedBy) &&
                Objects.equals(publicReleasedOn, that.publicReleasedOn) &&
                Objects.equals(reCustodian, that.reCustodian) &&
                Objects.equals(reDataItemCreatedAt, that.reDataItemCreatedAt) &&
                Objects.equals(reOriginator, that.reOriginator) &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(stixMarkingGuid, that.stixMarkingGuid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, csClassification, csCountries, csCui, csEntity, csFormalDetermination, csInfoCaveat, csOrgs, csShargrp, guid, isDefaultMarking, isReference, markingModelType, privilegeDefault, publicRelease, publicReleasedBy, publicReleasedOn, reCustodian, reDataItemCreatedAt, reOriginator, stixId, stixMarkingGuid, createdAt, updatedAt);
    }
}
