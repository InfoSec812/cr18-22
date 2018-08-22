package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "audit_logs", schema = "example_database", catalog = "")
public class AuditLogs {
    private int id;
    private String message;
    private String details;
    private String auditType;
    private String oldJustification;
    private Timestamp eventTime;
    private String userGuid;
    private String systemGuid;
    private String itemTypeAudited;
    private String itemGuidAudited;
    private String guid;
    private String auditSubtype;
    private String justification;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "message", nullable = true, length = 255)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "details", nullable = true, length = -1)
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "audit_type", nullable = true, length = 255)
    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }

    @Basic
    @Column(name = "old_justification", nullable = true, length = 255)
    public String getOldJustification() {
        return oldJustification;
    }

    public void setOldJustification(String oldJustification) {
        this.oldJustification = oldJustification;
    }

    @Basic
    @Column(name = "event_time", nullable = true)
    public Timestamp getEventTime() {
        return eventTime;
    }

    public void setEventTime(Timestamp eventTime) {
        this.eventTime = eventTime;
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
    @Column(name = "system_guid", nullable = true, length = 255)
    public String getSystemGuid() {
        return systemGuid;
    }

    public void setSystemGuid(String systemGuid) {
        this.systemGuid = systemGuid;
    }

    @Basic
    @Column(name = "item_type_audited", nullable = true, length = 255)
    public String getItemTypeAudited() {
        return itemTypeAudited;
    }

    public void setItemTypeAudited(String itemTypeAudited) {
        this.itemTypeAudited = itemTypeAudited;
    }

    @Basic
    @Column(name = "item_guid_audited", nullable = true, length = 255)
    public String getItemGuidAudited() {
        return itemGuidAudited;
    }

    public void setItemGuidAudited(String itemGuidAudited) {
        this.itemGuidAudited = itemGuidAudited;
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
    @Column(name = "audit_subtype", nullable = true, length = 255)
    public String getAuditSubtype() {
        return auditSubtype;
    }

    public void setAuditSubtype(String auditSubtype) {
        this.auditSubtype = auditSubtype;
    }

    @Basic
    @Column(name = "justification", nullable = true, length = -1)
    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuditLogs auditLogs = (AuditLogs) o;
        return id == auditLogs.id &&
                Objects.equals(message, auditLogs.message) &&
                Objects.equals(details, auditLogs.details) &&
                Objects.equals(auditType, auditLogs.auditType) &&
                Objects.equals(oldJustification, auditLogs.oldJustification) &&
                Objects.equals(eventTime, auditLogs.eventTime) &&
                Objects.equals(userGuid, auditLogs.userGuid) &&
                Objects.equals(systemGuid, auditLogs.systemGuid) &&
                Objects.equals(itemTypeAudited, auditLogs.itemTypeAudited) &&
                Objects.equals(itemGuidAudited, auditLogs.itemGuidAudited) &&
                Objects.equals(guid, auditLogs.guid) &&
                Objects.equals(auditSubtype, auditLogs.auditSubtype) &&
                Objects.equals(justification, auditLogs.justification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message, details, auditType, oldJustification, eventTime, userGuid, systemGuid, itemTypeAudited, itemGuidAudited, guid, auditSubtype, justification);
    }
}
