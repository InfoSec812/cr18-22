package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "packages_course_of_actions", schema = "example_database", catalog = "")
public class PackagesCourseOfActions {
    private int id;
    private String stixPackageId;
    private String courseOfActionId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String userGuid;
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
    @Column(name = "stix_package_id", nullable = true, length = 255)
    public String getStixPackageId() {
        return stixPackageId;
    }

    public void setStixPackageId(String stixPackageId) {
        this.stixPackageId = stixPackageId;
    }

    @Basic
    @Column(name = "course_of_action_id", nullable = true, length = 255)
    public String getCourseOfActionId() {
        return courseOfActionId;
    }

    public void setCourseOfActionId(String courseOfActionId) {
        this.courseOfActionId = courseOfActionId;
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

    @Basic
    @Column(name = "guid", nullable = true, length = 255)
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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
        PackagesCourseOfActions that = (PackagesCourseOfActions) o;
        return id == that.id &&
                Objects.equals(stixPackageId, that.stixPackageId) &&
                Objects.equals(courseOfActionId, that.courseOfActionId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(userGuid, that.userGuid) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stixPackageId, courseOfActionId, createdAt, updatedAt, guid, userGuid, transferFromLow);
    }
}
