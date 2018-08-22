package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_custom_objects", schema = "example_database", catalog = "")
public class CyboxCustomObjects {
    private int id;
    private String customName;
    private String string;
    private String stringDescription;
    private String cyboxObjectId;
    private String cyboxHash;
    private String userGuid;
    private String guid;
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
    @Column(name = "custom_name", nullable = true, length = 255)
    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    @Basic
    @Column(name = "string", nullable = true, length = 255)
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Basic
    @Column(name = "string_description", nullable = true, length = 255)
    public String getStringDescription() {
        return stringDescription;
    }

    public void setStringDescription(String stringDescription) {
        this.stringDescription = stringDescription;
    }

    @Basic
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
    }

    @Basic
    @Column(name = "cybox_hash", nullable = true, length = 255)
    public String getCyboxHash() {
        return cyboxHash;
    }

    public void setCyboxHash(String cyboxHash) {
        this.cyboxHash = cyboxHash;
    }

    @Basic
    @Column(name = "user_guid", nullable = true, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
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
        CyboxCustomObjects that = (CyboxCustomObjects) o;
        return id == that.id &&
                Objects.equals(customName, that.customName) &&
                Objects.equals(string, that.string) &&
                Objects.equals(stringDescription, that.stringDescription) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customName, string, stringDescription, cyboxObjectId, cyboxHash, userGuid, guid, createdAt, updatedAt);
    }
}
