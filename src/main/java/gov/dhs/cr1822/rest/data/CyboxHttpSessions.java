package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cybox_http_sessions", schema = "example_database", catalog = "")
public class CyboxHttpSessions {
    private int id;
    private String cyboxObjectId;
    private String cyboxHash;
    private String userAgent;
    private String guid;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String domainName;
    private String port;
    private String referer;
    private String pragma;
    private String portionMarking;
    private Byte readOnly;
    private String userAgentC;
    private String domainNameC;
    private String portC;
    private String refererC;
    private String pragmaC;
    private String userAgentCondition;
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
    @Column(name = "user_agent", nullable = true, length = 255)
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
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

    @Basic
    @Column(name = "domain_name", nullable = true, length = 255)
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Basic
    @Column(name = "port", nullable = true, length = 255)
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Basic
    @Column(name = "referer", nullable = true, length = 255)
    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    @Basic
    @Column(name = "pragma", nullable = true, length = 255)
    public String getPragma() {
        return pragma;
    }

    public void setPragma(String pragma) {
        this.pragma = pragma;
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
    @Column(name = "user_agent_c", nullable = true, length = 255)
    public String getUserAgentC() {
        return userAgentC;
    }

    public void setUserAgentC(String userAgentC) {
        this.userAgentC = userAgentC;
    }

    @Basic
    @Column(name = "domain_name_c", nullable = true, length = 255)
    public String getDomainNameC() {
        return domainNameC;
    }

    public void setDomainNameC(String domainNameC) {
        this.domainNameC = domainNameC;
    }

    @Basic
    @Column(name = "port_c", nullable = true, length = 255)
    public String getPortC() {
        return portC;
    }

    public void setPortC(String portC) {
        this.portC = portC;
    }

    @Basic
    @Column(name = "referer_c", nullable = true, length = 255)
    public String getRefererC() {
        return refererC;
    }

    public void setRefererC(String refererC) {
        this.refererC = refererC;
    }

    @Basic
    @Column(name = "pragma_c", nullable = true, length = 255)
    public String getPragmaC() {
        return pragmaC;
    }

    public void setPragmaC(String pragmaC) {
        this.pragmaC = pragmaC;
    }

    @Basic
    @Column(name = "user_agent_condition", nullable = true, length = 255)
    public String getUserAgentCondition() {
        return userAgentCondition;
    }

    public void setUserAgentCondition(String userAgentCondition) {
        this.userAgentCondition = userAgentCondition;
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
        CyboxHttpSessions that = (CyboxHttpSessions) o;
        return id == that.id &&
                Objects.equals(cyboxObjectId, that.cyboxObjectId) &&
                Objects.equals(cyboxHash, that.cyboxHash) &&
                Objects.equals(userAgent, that.userAgent) &&
                Objects.equals(guid, that.guid) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(domainName, that.domainName) &&
                Objects.equals(port, that.port) &&
                Objects.equals(referer, that.referer) &&
                Objects.equals(pragma, that.pragma) &&
                Objects.equals(portionMarking, that.portionMarking) &&
                Objects.equals(readOnly, that.readOnly) &&
                Objects.equals(userAgentC, that.userAgentC) &&
                Objects.equals(domainNameC, that.domainNameC) &&
                Objects.equals(portC, that.portC) &&
                Objects.equals(refererC, that.refererC) &&
                Objects.equals(pragmaC, that.pragmaC) &&
                Objects.equals(userAgentCondition, that.userAgentCondition) &&
                Objects.equals(isCiscp, that.isCiscp) &&
                Objects.equals(isMifr, that.isMifr) &&
                Objects.equals(feeds, that.feeds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cyboxObjectId, cyboxHash, userAgent, guid, createdAt, updatedAt, domainName, port, referer, pragma, portionMarking, readOnly, userAgentC, domainNameC, portC, refererC, pragmaC, userAgentCondition, isCiscp, isMifr, feeds);
    }
}
