package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "old_isa_markings", schema = "example_database", catalog = "")
public class OldIsaMarkings {
    private int id;
    private String communityDissemination;
    private Timestamp dataItemCreatedAt;
    private String disseminationControls;
    private String guid;
    private String orgDissemination;
    private byte publicRelease;
    private String reCountry;
    private String reOrganization;
    private String reSuborganization;
    private String releasableTo;
    private String stixMarkingId;
    private String userStatusDissemination;
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
    @Column(name = "community_dissemination", nullable = true, length = 2000)
    public String getCommunityDissemination() {
        return communityDissemination;
    }

    public void setCommunityDissemination(String communityDissemination) {
        this.communityDissemination = communityDissemination;
    }

    @Basic
    @Column(name = "data_item_created_at", nullable = true)
    public Timestamp getDataItemCreatedAt() {
        return dataItemCreatedAt;
    }

    public void setDataItemCreatedAt(Timestamp dataItemCreatedAt) {
        this.dataItemCreatedAt = dataItemCreatedAt;
    }

    @Basic
    @Column(name = "dissemination_controls", nullable = true, length = 255)
    public String getDisseminationControls() {
        return disseminationControls;
    }

    public void setDisseminationControls(String disseminationControls) {
        this.disseminationControls = disseminationControls;
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
    @Column(name = "org_dissemination", nullable = true, length = 255)
    public String getOrgDissemination() {
        return orgDissemination;
    }

    public void setOrgDissemination(String orgDissemination) {
        this.orgDissemination = orgDissemination;
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
    @Column(name = "re_country", nullable = true, length = 2000)
    public String getReCountry() {
        return reCountry;
    }

    public void setReCountry(String reCountry) {
        this.reCountry = reCountry;
    }

    @Basic
    @Column(name = "re_organization", nullable = true, length = 255)
    public String getReOrganization() {
        return reOrganization;
    }

    public void setReOrganization(String reOrganization) {
        this.reOrganization = reOrganization;
    }

    @Basic
    @Column(name = "re_suborganization", nullable = true, length = 255)
    public String getReSuborganization() {
        return reSuborganization;
    }

    public void setReSuborganization(String reSuborganization) {
        this.reSuborganization = reSuborganization;
    }

    @Basic
    @Column(name = "releasable_to", nullable = true, length = 255)
    public String getReleasableTo() {
        return releasableTo;
    }

    public void setReleasableTo(String releasableTo) {
        this.releasableTo = releasableTo;
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
    @Column(name = "user_status_dissemination", nullable = true, length = 255)
    public String getUserStatusDissemination() {
        return userStatusDissemination;
    }

    public void setUserStatusDissemination(String userStatusDissemination) {
        this.userStatusDissemination = userStatusDissemination;
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
        OldIsaMarkings that = (OldIsaMarkings) o;
        return id == that.id &&
                publicRelease == that.publicRelease &&
                Objects.equals(communityDissemination, that.communityDissemination) &&
                Objects.equals(dataItemCreatedAt, that.dataItemCreatedAt) &&
                Objects.equals(disseminationControls, that.disseminationControls) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(orgDissemination, that.orgDissemination) &&
                Objects.equals(reCountry, that.reCountry) &&
                Objects.equals(reOrganization, that.reOrganization) &&
                Objects.equals(reSuborganization, that.reSuborganization) &&
                Objects.equals(releasableTo, that.releasableTo) &&
                Objects.equals(stixMarkingId, that.stixMarkingId) &&
                Objects.equals(userStatusDissemination, that.userStatusDissemination) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, communityDissemination, dataItemCreatedAt, disseminationControls, guid, orgDissemination, publicRelease, reCountry, reOrganization, reSuborganization, releasableTo, stixMarkingId, userStatusDissemination, createdAt, updatedAt);
    }
}
