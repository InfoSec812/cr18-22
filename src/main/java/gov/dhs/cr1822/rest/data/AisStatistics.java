package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ais_statistics", schema = "example_database", catalog = "")
public class AisStatistics {
    private int id;
    private String stixPackageStixId;
    private String stixPackageOriginalId;
    private String uploadedFileId;
    private String feeds;
    private String messages;
    private String aisUid;
    private String guid;
    private Integer indicatorAmount;
    private Byte flareInStatus;
    private Byte ciapStatus;
    private Byte ecisStatus;
    private Byte flareOutStatus;
    private Byte ecisStatusHr;
    private Byte flareOutStatusHr;
    private Timestamp disseminationTime;
    private Timestamp disseminationTimeHr;
    private Timestamp receivedTime;
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
    @Column(name = "stix_package_stix_id", nullable = true, length = 255)
    public String getStixPackageStixId() {
        return stixPackageStixId;
    }

    public void setStixPackageStixId(String stixPackageStixId) {
        this.stixPackageStixId = stixPackageStixId;
    }

    @Basic
    @Column(name = "stix_package_original_id", nullable = true, length = 255)
    public String getStixPackageOriginalId() {
        return stixPackageOriginalId;
    }

    public void setStixPackageOriginalId(String stixPackageOriginalId) {
        this.stixPackageOriginalId = stixPackageOriginalId;
    }

    @Basic
    @Column(name = "uploaded_file_id", nullable = true, length = 255)
    public String getUploadedFileId() {
        return uploadedFileId;
    }

    public void setUploadedFileId(String uploadedFileId) {
        this.uploadedFileId = uploadedFileId;
    }

    @Basic
    @Column(name = "feeds", nullable = true, length = 255)
    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    @Basic
    @Column(name = "messages", nullable = true, length = 255)
    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    @Basic
    @Column(name = "ais_uid", nullable = true, length = 255)
    public String getAisUid() {
        return aisUid;
    }

    public void setAisUid(String aisUid) {
        this.aisUid = aisUid;
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
    @Column(name = "indicator_amount", nullable = true)
    public Integer getIndicatorAmount() {
        return indicatorAmount;
    }

    public void setIndicatorAmount(Integer indicatorAmount) {
        this.indicatorAmount = indicatorAmount;
    }

    @Basic
    @Column(name = "flare_in_status", nullable = true)
    public Byte getFlareInStatus() {
        return flareInStatus;
    }

    public void setFlareInStatus(Byte flareInStatus) {
        this.flareInStatus = flareInStatus;
    }

    @Basic
    @Column(name = "ciap_status", nullable = true)
    public Byte getCiapStatus() {
        return ciapStatus;
    }

    public void setCiapStatus(Byte ciapStatus) {
        this.ciapStatus = ciapStatus;
    }

    @Basic
    @Column(name = "ecis_status", nullable = true)
    public Byte getEcisStatus() {
        return ecisStatus;
    }

    public void setEcisStatus(Byte ecisStatus) {
        this.ecisStatus = ecisStatus;
    }

    @Basic
    @Column(name = "flare_out_status", nullable = true)
    public Byte getFlareOutStatus() {
        return flareOutStatus;
    }

    public void setFlareOutStatus(Byte flareOutStatus) {
        this.flareOutStatus = flareOutStatus;
    }

    @Basic
    @Column(name = "ecis_status_hr", nullable = true)
    public Byte getEcisStatusHr() {
        return ecisStatusHr;
    }

    public void setEcisStatusHr(Byte ecisStatusHr) {
        this.ecisStatusHr = ecisStatusHr;
    }

    @Basic
    @Column(name = "flare_out_status_hr", nullable = true)
    public Byte getFlareOutStatusHr() {
        return flareOutStatusHr;
    }

    public void setFlareOutStatusHr(Byte flareOutStatusHr) {
        this.flareOutStatusHr = flareOutStatusHr;
    }

    @Basic
    @Column(name = "dissemination_time", nullable = true)
    public Timestamp getDisseminationTime() {
        return disseminationTime;
    }

    public void setDisseminationTime(Timestamp disseminationTime) {
        this.disseminationTime = disseminationTime;
    }

    @Basic
    @Column(name = "dissemination_time_hr", nullable = true)
    public Timestamp getDisseminationTimeHr() {
        return disseminationTimeHr;
    }

    public void setDisseminationTimeHr(Timestamp disseminationTimeHr) {
        this.disseminationTimeHr = disseminationTimeHr;
    }

    @Basic
    @Column(name = "received_time", nullable = true)
    public Timestamp getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Timestamp receivedTime) {
        this.receivedTime = receivedTime;
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
        AisStatistics that = (AisStatistics) o;
        return id == that.id &&
                Objects.equals(stixPackageStixId, that.stixPackageStixId) &&
                Objects.equals(stixPackageOriginalId, that.stixPackageOriginalId) &&
                Objects.equals(uploadedFileId, that.uploadedFileId) &&
                Objects.equals(feeds, that.feeds) &&
                Objects.equals(messages, that.messages) &&
                Objects.equals(aisUid, that.aisUid) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(indicatorAmount, that.indicatorAmount) &&
                Objects.equals(flareInStatus, that.flareInStatus) &&
                Objects.equals(ciapStatus, that.ciapStatus) &&
                Objects.equals(ecisStatus, that.ecisStatus) &&
                Objects.equals(flareOutStatus, that.flareOutStatus) &&
                Objects.equals(ecisStatusHr, that.ecisStatusHr) &&
                Objects.equals(flareOutStatusHr, that.flareOutStatusHr) &&
                Objects.equals(disseminationTime, that.disseminationTime) &&
                Objects.equals(disseminationTimeHr, that.disseminationTimeHr) &&
                Objects.equals(receivedTime, that.receivedTime) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stixPackageStixId, stixPackageOriginalId, uploadedFileId, feeds, messages, aisUid, guid, indicatorAmount, flareInStatus, ciapStatus, ecisStatus, flareOutStatus, ecisStatusHr, flareOutStatusHr, disseminationTime, disseminationTimeHr, receivedTime, createdAt, updatedAt);
    }
}
