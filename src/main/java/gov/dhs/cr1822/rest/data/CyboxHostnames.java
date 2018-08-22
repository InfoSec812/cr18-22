package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_hostnames", schema = "example_database", catalog = "")
public class CyboxHostnames {
    private int id;
    private String cyboxHash;
    private String cyboxObjectId;
    private String hostnameRaw;
    private String hostnameCondition;
    private String hostnameNormalized;
    private String hostnameNormalizedC;
    private String namingSystem;
    private String namingSystemC;
    private Byte isDomainName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String guid;
    private String portionMarking;
    private Byte readOnly;
    private Byte isCiscp;
    private Byte isMifr;
    private String feeds;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "cybox_object_id", nullable = true, length = 255)
    public String getCyboxObjectId() {
        return cyboxObjectId;
    }

    public void setCyboxObjectId(String cyboxObjectId) {
        this.cyboxObjectId = cyboxObjectId;
    }

    @Basic
    @Column(name = "hostname_raw", nullable = true, length = 255)
    public String getHostnameRaw() {
        return hostnameRaw;
    }

    public void setHostnameRaw(String hostnameRaw) {
        this.hostnameRaw = hostnameRaw;
    }

    @Basic
    @Column(name = "hostname_condition", nullable = true, length = 255)
    public String getHostnameCondition() {
        return hostnameCondition;
    }

    public void setHostnameCondition(String hostnameCondition) {
        this.hostnameCondition = hostnameCondition;
    }

    @Basic
    @Column(name = "hostname_normalized", nullable = true, length = 255)
    public String getHostnameNormalized() {
        return hostnameNormalized;
    }

    public void setHostnameNormalized(String hostnameNormalized) {
        this.hostnameNormalized = hostnameNormalized;
    }

    @Basic
    @Column(name = "hostname_normalized_c", nullable = true, length = 255)
    public String getHostnameNormalizedC() {
        return hostnameNormalizedC;
    }

    public void setHostnameNormalizedC(String hostnameNormalizedC) {
        this.hostnameNormalizedC = hostnameNormalizedC;
    }

    @Basic
    @Column(name = "naming_system", nullable = true, length = 255)
    public String getNamingSystem() {
        return namingSystem;
    }

    public void setNamingSystem(String namingSystem) {
        this.namingSystem = namingSystem;
    }

    @Basic
    @Column(name = "naming_system_c", nullable = true, length = 255)
    public String getNamingSystemC() {
        return namingSystemC;
    }

    public void setNamingSystemC(String namingSystemC) {
        this.namingSystemC = namingSystemC;
    }

    @Basic
    @Column(name = "is_domain_name", nullable = true)
    public Byte getIsDomainName() {
        return isDomainName;
    }

    public void setIsDomainName(Byte isDomainName) {
        this.isDomainName = isDomainName;
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
    @Column(name = "portion_marking", nullable = true, length = 255)
    public String getPortionMarking() {
        return portionMarking;
    }

    public void setPortionMarking(String portionMarking) {
        this.portionMarking = portionMarking;
    }

    @Basic
    @Column(name = "read_only", nullable = true)
    public Byte getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Byte readOnly) {
        this.readOnly = readOnly;
    }

    @Basic
    @Column(name = "is_ciscp", nullable = true)
    public Byte getIsCiscp() {
        return isCiscp;
    }

    public void setIsCiscp(Byte isCiscp) {
        this.isCiscp = isCiscp;
    }

    @Basic
    @Column(name = "is_mifr", nullable = true)
    public Byte getIsMifr() {
        return isMifr;
    }

    public void setIsMifr(Byte isMifr) {
        this.isMifr = isMifr;
    }

    @Basic
    @Column(name = "feeds", nullable = true, length = 255)
    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CyboxHostnames that = (CyboxHostnames) o;
        return id == that.id &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(hostnameRaw, that.hostnameRaw) &&
                Objects.equals(hostnameCondition, that.hostnameCondition) &&
                Objects.equals(hostnameNormalized, that.hostnameNormalized) &&
                Objects.equals(hostnameNormalizedC, that.hostnameNormalizedC) &&
                Objects.equals(namingSystem, that.namingSystem) &&
                Objects.equals(namingSystemC, that.namingSystemC) &&
                Objects.equals(isDomainName, that.isDomainName) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cyboxHash, cyboxObjectId, hostnameRaw, hostnameCondition, hostnameNormalized, hostnameNormalizedC, namingSystem, namingSystemC, isDomainName, createdAt, updatedAt, guid, portionMarking, readOnly, isCiscp, isMifr, feeds);
    }
}
