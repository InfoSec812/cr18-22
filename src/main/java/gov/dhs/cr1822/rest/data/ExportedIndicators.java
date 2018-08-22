package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "exported_indicators", schema = "example_database", catalog = "")
public class ExportedIndicators {
    private int id;
    private String system;
    private String color;
    private String guid;
    private Timestamp exportedAt;
    private String description;
    private String indicatorId;
    private String userId;
    private Timestamp detaskedAt;
    private Timestamp updatedAt;
    private String status;
    private String sid2;
    private String commentsNormalized;
    private Timestamp dateAdded;
    private String event;
    private String eventClassification;
    private String nai;
    private String naiClassification;
    private String specialInstructions;
    private String sid;
    private String reference;
    private String csRegex;
    private String clearText;
    private String signatureLocation;
    private String psRegex;
    private String observableValue;
    private String indicatorTitle;
    private String indicatorStixId;
    private String indicatorType;
    private String indicatorClassification;
    private String indicatorTypeClassification;
    private String username;
    private String comments;
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
    @Column(name = "system", nullable = true, length = 255)
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Basic
    @Column(name = "color", nullable = true, length = 255)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    @Column(name = "exported_at", nullable = true)
    public Timestamp getExportedAt() {
        return exportedAt;
    }

    public void setExportedAt(Timestamp exportedAt) {
        this.exportedAt = exportedAt;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "indicator_id", nullable = true, length = 255)
    public String getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = 255)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "detasked_at", nullable = true)
    public Timestamp getDetaskedAt() {
        return detaskedAt;
    }

    public void setDetaskedAt(Timestamp detaskedAt) {
        this.detaskedAt = detaskedAt;
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
    @Column(name = "status", nullable = true, length = 255)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "sid2", nullable = true, length = 255)
    public String getSid2() {
        return sid2;
    }

    public void setSid2(String sid2) {
        this.sid2 = sid2;
    }

    @Basic
    @Column(name = "comments_normalized", nullable = true, length = 255)
    public String getCommentsNormalized() {
        return commentsNormalized;
    }

    public void setCommentsNormalized(String commentsNormalized) {
        this.commentsNormalized = commentsNormalized;
    }

    @Basic
    @Column(name = "date_added", nullable = true)
    public Timestamp getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Basic
    @Column(name = "event", nullable = true, length = 255)
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Basic
    @Column(name = "event_classification", nullable = true, length = 255)
    public String getEventClassification() {
        return eventClassification;
    }

    public void setEventClassification(String eventClassification) {
        this.eventClassification = eventClassification;
    }

    @Basic
    @Column(name = "nai", nullable = true, length = 255)
    public String getNai() {
        return nai;
    }

    public void setNai(String nai) {
        this.nai = nai;
    }

    @Basic
    @Column(name = "nai_classification", nullable = true, length = 255)
    public String getNaiClassification() {
        return naiClassification;
    }

    public void setNaiClassification(String naiClassification) {
        this.naiClassification = naiClassification;
    }

    @Basic
    @Column(name = "special_instructions", nullable = true, length = 255)
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    @Basic
    @Column(name = "sid", nullable = true, length = 255)
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "reference", nullable = true, length = 255)
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "cs_regex", nullable = true, length = 255)
    public String getCsRegex() {
        return csRegex;
    }

    public void setCsRegex(String csRegex) {
        this.csRegex = csRegex;
    }

    @Basic
    @Column(name = "clear_text", nullable = true, length = 255)
    public String getClearText() {
        return clearText;
    }

    public void setClearText(String clearText) {
        this.clearText = clearText;
    }

    @Basic
    @Column(name = "signature_location", nullable = true, length = 255)
    public String getSignatureLocation() {
        return signatureLocation;
    }

    public void setSignatureLocation(String signatureLocation) {
        this.signatureLocation = signatureLocation;
    }

    @Basic
    @Column(name = "ps_regex", nullable = true, length = 255)
    public String getPsRegex() {
        return psRegex;
    }

    public void setPsRegex(String psRegex) {
        this.psRegex = psRegex;
    }

    @Basic
    @Column(name = "observable_value", nullable = true, length = 255)
    public String getObservableValue() {
        return observableValue;
    }

    public void setObservableValue(String observableValue) {
        this.observableValue = observableValue;
    }

    @Basic
    @Column(name = "indicator_title", nullable = true, length = 255)
    public String getIndicatorTitle() {
        return indicatorTitle;
    }

    public void setIndicatorTitle(String indicatorTitle) {
        this.indicatorTitle = indicatorTitle;
    }

    @Basic
    @Column(name = "indicator_stix_id", nullable = true, length = 255)
    public String getIndicatorStixId() {
        return indicatorStixId;
    }

    public void setIndicatorStixId(String indicatorStixId) {
        this.indicatorStixId = indicatorStixId;
    }

    @Basic
    @Column(name = "indicator_type", nullable = true, length = 255)
    public String getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(String indicatorType) {
        this.indicatorType = indicatorType;
    }

    @Basic
    @Column(name = "indicator_classification", nullable = true, length = 255)
    public String getIndicatorClassification() {
        return indicatorClassification;
    }

    public void setIndicatorClassification(String indicatorClassification) {
        this.indicatorClassification = indicatorClassification;
    }

    @Basic
    @Column(name = "indicator_type_classification", nullable = true, length = 255)
    public String getIndicatorTypeClassification() {
        return indicatorTypeClassification;
    }

    public void setIndicatorTypeClassification(String indicatorTypeClassification) {
        this.indicatorTypeClassification = indicatorTypeClassification;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 255)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "comments", nullable = true, length = -1)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
        ExportedIndicators that = (ExportedIndicators) o;
        return id == that.id &&
                Objects.equals(system, that.system) &&
                Objects.equals(color, that.color) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(exportedAt, that.exportedAt) &&
                Objects.equals(description, that.description) &&
                Objects.equals(indicatorId, that.indicatorId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(detaskedAt, that.detaskedAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(status, that.status) &&
                Objects.equals(sid2, that.sid2) &&
                Objects.equals(commentsNormalized, that.commentsNormalized) &&
                Objects.equals(dateAdded, that.dateAdded) &&
                Objects.equals(event, that.event) &&
                Objects.equals(eventClassification, that.eventClassification) &&
                Objects.equals(nai, that.nai) &&
                Objects.equals(naiClassification, that.naiClassification) &&
                Objects.equals(specialInstructions, that.specialInstructions) &&
                Objects.equals(sid, that.sid) &&
                Objects.equals(reference, that.reference) &&
                Objects.equals(csRegex, that.csRegex) &&
                Objects.equals(clearText, that.clearText) &&
                Objects.equals(signatureLocation, that.signatureLocation) &&
                Objects.equals(psRegex, that.psRegex) &&
                Objects.equals(observableValue, that.observableValue) &&
                Objects.equals(indicatorTitle, that.indicatorTitle) &&
                Objects.equals(indicatorStixId, that.indicatorStixId) &&
                Objects.equals(indicatorType, that.indicatorType) &&
                Objects.equals(indicatorClassification, that.indicatorClassification) &&
                Objects.equals(indicatorTypeClassification, that.indicatorTypeClassification) &&
                Objects.equals(username, that.username) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(transferFromLow, that.transferFromLow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, system, color, guid, exportedAt, description, indicatorId, userId, detaskedAt, updatedAt, status, sid2, commentsNormalized, dateAdded, event, eventClassification, nai, naiClassification, specialInstructions, sid, reference, csRegex, clearText, signatureLocation, psRegex, observableValue, indicatorTitle, indicatorStixId, indicatorType, indicatorClassification, indicatorTypeClassification, username, comments, transferFromLow);
    }
}
