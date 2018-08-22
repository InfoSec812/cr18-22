package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "isa_assertion_structures", schema = "example_database", catalog = "")
public class IsaAssertionStructures {
    private int id;
    private String csClassification;
    private String csCountries;
    private String csCui;
    private String csEntity;
    private String csFormalDetermination;
    private String csOrgs;
    private String csShargrp;
    private String guid;
    private byte isDefaultMarking;
    private String privilegeDefault;
    private byte publicRelease;
    private String publicReleasedBy;
    private Timestamp publicReleasedOn;
    private String stixId;
    private String stixMarkingId;
    private String csInfoCaveat;
    private String sharingDefault;
    private String classifiedBy;
    private Timestamp classifiedOn;
    private String classificationReason;
    private Timestamp updatedAt;
    private Byte transferFromLow;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cs_classification", nullable = false, length = 255)
    public String getCsClassification() {
        return csClassification;
    }

    public void setCsClassification(String csClassification) {
        this.csClassification = csClassification;
    }

    @Basic
    @Column(name = "cs_countries", nullable = true, length = 255)
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
    @Column(name = "guid", nullable = false, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @Basic
    @Column(name = "is_default_marking", nullable = false)
    public byte getIsDefaultMarking() {
        return isDefaultMarking;
    }

    public void setIsDefaultMarking(byte isDefaultMarking) {
        this.isDefaultMarking = isDefaultMarking;
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
    @Column(name = "stix_id", nullable = false, length = 255)
    public String getStixId() {
        return stixId;
    }

    public void setStixId(String stixId) {
        this.stixId = stixId;
    }

    @Basic
    @Column(name = "stix_marking_id", nullable = true, length = 255)
    public String getStixMarkingId() {
        return stixMarkingId;
    }

    public void setStixMarkingId(String stixMarkingId) {
        this.stixMarkingId = stixMarkingId;
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
    @Column(name = "sharing_default", nullable = true, length = 255)
    public String getSharingDefault() {
        return sharingDefault;
    }

    public void setSharingDefault(String sharingDefault) {
        this.sharingDefault = sharingDefault;
    }

    @Basic
    @Column(name = "classified_by", nullable = true, length = 255)
    public String getClassifiedBy() {
        return classifiedBy;
    }

    public void setClassifiedBy(String classifiedBy) {
        this.classifiedBy = classifiedBy;
    }

    @Basic
    @Column(name = "classified_on", nullable = true)
    public Timestamp getClassifiedOn() {
        return classifiedOn;
    }

    public void setClassifiedOn(Timestamp classifiedOn) {
        this.classifiedOn = classifiedOn;
    }

    @Basic
    @Column(name = "classification_reason", nullable = true, length = 255)
    public String getClassificationReason() {
        return classificationReason;
    }

    public void setClassificationReason(String classificationReason) {
        this.classificationReason = classificationReason;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "transfer_from_low", nullable = true)
    public Byte getTransferFromLow() {
        return transferFromLow;
    }

    public void setTransferFromLow(Byte transferFromLow) {
        this.transferFromLow = transferFromLow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsaAssertionStructures that = (IsaAssertionStructures) o;
        return id == that.id &&
                isDefaultMarking == that.isDefaultMarking &&
                publicRelease == that.publicRelease &&
                Objects.equals(csClassification, that.csClassification) &&
                Objects.equals(csCountries, that.csCountries) &&
                Objects.equals(csCui, that.csCui) &&
                Objects.equals(csEntity, that.csEntity) &&
                Objects.equals(csFormalDetermination, that.csFormalDetermination) &&
                Objects.equals(csOrgs, that.csOrgs) &&
                Objects.equals(csShargrp, that.csShargrp) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(privilegeDefault, that.privilegeDefault) &&
                Objects.equals(publicReleasedBy, that.publicReleasedBy) &&
                Objects.equals(publicReleasedOn, that.publicReleasedOn) &&
                Objects.equals(stixId, that.stixId) &&
                Objects.equals(stixMarkingId, that.stixMarkingId) &&
                Objects.equals(csInfoCaveat, that.csInfoCaveat) &&
                Objects.equals(sharingDefault, that.sharingDefault) &&
                Objects.equals(classifiedBy, that.classifiedBy) &&
                Objects.equals(classifiedOn, that.classifiedOn) &&
                Objects.equals(classificationReason, that.classificationReason) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, csClassification, csCountries, csCui, csEntity, csFormalDetermination, csOrgs, csShargrp, guid, isDefaultMarking, privilegeDefault, publicRelease, publicReleasedBy, publicReleasedOn, stixId, stixMarkingId, csInfoCaveat, sharingDefault, classifiedBy, classifiedOn, classificationReason, updatedAt, transferFromLow);
    }
}
