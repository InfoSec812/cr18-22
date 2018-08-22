package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_email_messages", schema = "example_database", catalog = "")
public class CyboxEmailMessages {
    private int id;
    private Timestamp createdAt;
    private String cyboxHash;
    private String cyboxObjectId;
    private Timestamp emailDate;
    private Byte fromIsSpoofed;
    private String fromRaw;
    private String fromNormalized;
    private String messageId;
    private String rawBody;
    private String rawHeader;
    private String replyToRaw;
    private String replyToNormalized;
    private Byte senderIsSpoofed;
    private String senderRaw;
    private String senderNormalized;
    private Timestamp updatedAt;
    private String xMailer;
    private String xOriginatingIp;
    private String guid;
    private String fromCyboxObjectId;
    private String replyToCyboxObjectId;
    private String senderCyboxObjectId;
    private String portionMarking;
    private Integer gfiIdOld;
    private Byte readOnly;
    private String fromNormalizedC;
    private String senderNormalizedC;
    private String replyToNormalizedC;
    private String subjectC;
    private String emailDateC;
    private String rawBodyC;
    private String rawHeaderC;
    private String messageIdC;
    private String xMailerC;
    private String xOriginatingIpC;
    private String subjectCondition;
    private String xIpCyboxObjectId;
    private Byte isCiscp;
    private Byte isMifr;
    private String subject;
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
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
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
    @Column(name = "email_date", nullable = true)
    public Timestamp getEmailDate() {
        return emailDate;
    }

    public void setEmailDate(Timestamp emailDate) {
        this.emailDate = emailDate;
    }

    @Basic
    @Column(name = "from_is_spoofed", nullable = true)
    public Byte getFromIsSpoofed() {
        return fromIsSpoofed;
    }

    public void setFromIsSpoofed(Byte fromIsSpoofed) {
        this.fromIsSpoofed = fromIsSpoofed;
    }

    @Basic
    @Column(name = "from_raw", nullable = true, length = 255)
    public String getFromRaw() {
        return fromRaw;
    }

    public void setFromRaw(String fromRaw) {
        this.fromRaw = fromRaw;
    }

    @Basic
    @Column(name = "from_normalized", nullable = true, length = 255)
    public String getFromNormalized() {
        return fromNormalized;
    }

    public void setFromNormalized(String fromNormalized) {
        this.fromNormalized = fromNormalized;
    }

    @Basic
    @Column(name = "message_id", nullable = true, length = 255)
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Basic
    @Column(name = "raw_body", nullable = true, length = -1)
    public String getRawBody() {
        return rawBody;
    }

    public void setRawBody(String rawBody) {
        this.rawBody = rawBody;
    }

    @Basic
    @Column(name = "raw_header", nullable = true, length = -1)
    public String getRawHeader() {
        return rawHeader;
    }

    public void setRawHeader(String rawHeader) {
        this.rawHeader = rawHeader;
    }

    @Basic
    @Column(name = "reply_to_raw", nullable = true, length = 255)
    public String getReplyToRaw() {
        return replyToRaw;
    }

    public void setReplyToRaw(String replyToRaw) {
        this.replyToRaw = replyToRaw;
    }

    @Basic
    @Column(name = "reply_to_normalized", nullable = true, length = 255)
    public String getReplyToNormalized() {
        return replyToNormalized;
    }

    public void setReplyToNormalized(String replyToNormalized) {
        this.replyToNormalized = replyToNormalized;
    }

    @Basic
    @Column(name = "sender_is_spoofed", nullable = true)
    public Byte getSenderIsSpoofed() {
        return senderIsSpoofed;
    }

    public void setSenderIsSpoofed(Byte senderIsSpoofed) {
        this.senderIsSpoofed = senderIsSpoofed;
    }

    @Basic
    @Column(name = "sender_raw", nullable = true, length = 255)
    public String getSenderRaw() {
        return senderRaw;
    }

    public void setSenderRaw(String senderRaw) {
        this.senderRaw = senderRaw;
    }

    @Basic
    @Column(name = "sender_normalized", nullable = true, length = 255)
    public String getSenderNormalized() {
        return senderNormalized;
    }

    public void setSenderNormalized(String senderNormalized) {
        this.senderNormalized = senderNormalized;
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
    @Column(name = "x_mailer", nullable = true, length = 255)
    public String getxMailer() {
        return xMailer;
    }

    public void setxMailer(String xMailer) {
        this.xMailer = xMailer;
    }

    @Basic
    @Column(name = "x_originating_ip", nullable = true, length = 255)
    public String getxOriginatingIp() {
        return xOriginatingIp;
    }

    public void setxOriginatingIp(String xOriginatingIp) {
        this.xOriginatingIp = xOriginatingIp;
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
    @Column(name = "from_cybox_object_id", nullable = true, length = 255)
    public String getFromCyboxObjectId() {
        return fromCyboxObjectId;
    }

    public void setFromCyboxObjectId(String fromCyboxObjectId) {
        this.fromCyboxObjectId = fromCyboxObjectId;
    }

    @Basic
    @Column(name = "reply_to_cybox_object_id", nullable = true, length = 255)
    public String getReplyToCyboxObjectId() {
        return replyToCyboxObjectId;
    }

    public void setReplyToCyboxObjectId(String replyToCyboxObjectId) {
        this.replyToCyboxObjectId = replyToCyboxObjectId;
    }

    @Basic
    @Column(name = "sender_cybox_object_id", nullable = true, length = 255)
    public String getSenderCyboxObjectId() {
        return senderCyboxObjectId;
    }

    public void setSenderCyboxObjectId(String senderCyboxObjectId) {
        this.senderCyboxObjectId = senderCyboxObjectId;
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
    @Column(name = "gfi_id_old", nullable = true)
    public Integer getGfiIdOld() {
        return gfiIdOld;
    }

    public void setGfiIdOld(Integer gfiIdOld) {
        this.gfiIdOld = gfiIdOld;
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
    @Column(name = "from_normalized_c", nullable = true, length = 255)
    public String getFromNormalizedC() {
        return fromNormalizedC;
    }

    public void setFromNormalizedC(String fromNormalizedC) {
        this.fromNormalizedC = fromNormalizedC;
    }

    @Basic
    @Column(name = "sender_normalized_c", nullable = true, length = 255)
    public String getSenderNormalizedC() {
        return senderNormalizedC;
    }

    public void setSenderNormalizedC(String senderNormalizedC) {
        this.senderNormalizedC = senderNormalizedC;
    }

    @Basic
    @Column(name = "reply_to_normalized_c", nullable = true, length = 255)
    public String getReplyToNormalizedC() {
        return replyToNormalizedC;
    }

    public void setReplyToNormalizedC(String replyToNormalizedC) {
        this.replyToNormalizedC = replyToNormalizedC;
    }

    @Basic
    @Column(name = "subject_c", nullable = true, length = 255)
    public String getSubjectC() {
        return subjectC;
    }

    public void setSubjectC(String subjectC) {
        this.subjectC = subjectC;
    }

    @Basic
    @Column(name = "email_date_c", nullable = true, length = 255)
    public String getEmailDateC() {
        return emailDateC;
    }

    public void setEmailDateC(String emailDateC) {
        this.emailDateC = emailDateC;
    }

    @Basic
    @Column(name = "raw_body_c", nullable = true, length = 255)
    public String getRawBodyC() {
        return rawBodyC;
    }

    public void setRawBodyC(String rawBodyC) {
        this.rawBodyC = rawBodyC;
    }

    @Basic
    @Column(name = "raw_header_c", nullable = true, length = 255)
    public String getRawHeaderC() {
        return rawHeaderC;
    }

    public void setRawHeaderC(String rawHeaderC) {
        this.rawHeaderC = rawHeaderC;
    }

    @Basic
    @Column(name = "message_id_c", nullable = true, length = 255)
    public String getMessageIdC() {
        return messageIdC;
    }

    public void setMessageIdC(String messageIdC) {
        this.messageIdC = messageIdC;
    }

    @Basic
    @Column(name = "x_mailer_c", nullable = true, length = 255)
    public String getxMailerC() {
        return xMailerC;
    }

    public void setxMailerC(String xMailerC) {
        this.xMailerC = xMailerC;
    }

    @Basic
    @Column(name = "x_originating_ip_c", nullable = true, length = 255)
    public String getxOriginatingIpC() {
        return xOriginatingIpC;
    }

    public void setxOriginatingIpC(String xOriginatingIpC) {
        this.xOriginatingIpC = xOriginatingIpC;
    }

    @Basic
    @Column(name = "subject_condition", nullable = true, length = 255)
    public String getSubjectCondition() {
        return subjectCondition;
    }

    public void setSubjectCondition(String subjectCondition) {
        this.subjectCondition = subjectCondition;
    }

    @Basic
    @Column(name = "x_ip_cybox_object_id", nullable = true, length = 255)
    public String getxIpCyboxObjectId() {
        return xIpCyboxObjectId;
    }

    public void setxIpCyboxObjectId(String xIpCyboxObjectId) {
        this.xIpCyboxObjectId = xIpCyboxObjectId;
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
    @Column(name = "subject", nullable = true, length = 4000)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        CyboxEmailMessages that = (CyboxEmailMessages) o;
        return id == that.id &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(emailDate, that.emailDate) &&
                Objects.equals(fromIsSpoofed, that.fromIsSpoofed) &&
                Objects.equals(fromRaw, that.fromRaw) &&
                Objects.equals(fromNormalized, that.fromNormalized) &&
                Objects.equals(messageId, that.messageId) &&
                Objects.equals(rawBody, that.rawBody) &&
                Objects.equals(rawHeader, that.rawHeader) &&
                Objects.equals(replyToRaw, that.replyToRaw) &&
                Objects.equals(replyToNormalized, that.replyToNormalized) &&
                Objects.equals(senderIsSpoofed, that.senderIsSpoofed) &&
                Objects.equals(senderRaw, that.senderRaw) &&
                Objects.equals(senderNormalized, that.senderNormalized) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(xMailer, that.xMailer) &&
                Objects.equals(xOriginatingIp, that.xOriginatingIp) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(fromCyboxObjectId, that.fromCyboxObjectId) &&
                Objects.equals(replyToCyboxObjectId, that.replyToCyboxObjectId) &&
                Objects.equals(senderCyboxObjectId, that.senderCyboxObjectId) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(gfiIdOld, that.gfiIdOld) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(fromNormalizedC, that.fromNormalizedC) &&
                Objects.equals(senderNormalizedC, that.senderNormalizedC) &&
                Objects.equals(replyToNormalizedC, that.replyToNormalizedC) &&
                Objects.equals(subjectC, that.subjectC) &&
                Objects.equals(emailDateC, that.emailDateC) &&
                Objects.equals(rawBodyC, that.rawBodyC) &&
                Objects.equals(rawHeaderC, that.rawHeaderC) &&
                Objects.equals(messageIdC, that.messageIdC) &&
                Objects.equals(xMailerC, that.xMailerC) &&
                Objects.equals(xOriginatingIpC, that.xOriginatingIpC) &&
                Objects.equals(subjectCondition, that.subjectCondition) &&
                Objects.equals(xIpCyboxObjectId, that.xIpCyboxObjectId) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt, cyboxHash, cyboxObjectId, emailDate, fromIsSpoofed, fromRaw, fromNormalized, messageId, rawBody, rawHeader, replyToRaw, replyToNormalized, senderIsSpoofed, senderRaw, senderNormalized, updatedAt, xMailer, xOriginatingIp, guid, fromCyboxObjectId, replyToCyboxObjectId, senderCyboxObjectId, portionMarking, gfiIdOld, readOnly, fromNormalizedC, senderNormalizedC, replyToNormalizedC, subjectC, emailDateC, rawBodyC, rawHeaderC, messageIdC, xMailerC, xOriginatingIpC, subjectCondition, xIpCyboxObjectId, isCiscp, isMifr, subject, feeds);
    }
}
