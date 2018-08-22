package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Events {
    private String eventCatalog;
    private String eventSchema;
    private String eventName;
    private String definer;
    private String timeZone;
    private String eventBody;
    private String eventDefinition;
    private String eventType;
    private Timestamp executeAt;
    private Integer intervalValue;
    private Object intervalField;
    private Object sqlMode;
    private Timestamp starts;
    private Timestamp ends;
    private Object status;
    private String onCompletion;
    private Timestamp created;
    private Timestamp lastAltered;
    private Timestamp lastExecuted;
    private String eventComment;
    private int originator;
    private String characterSetClient;
    private String collationConnection;
    private String databaseCollation;

    @Basic
    @Column(name = "EVENT_CATALOG", nullable = false, length = 64)
    public String getEventCatalog() {
        return eventCatalog;
    }

    public void setEventCatalog(String eventCatalog) {
        this.eventCatalog = eventCatalog;
    }

    @Basic
    @Column(name = "EVENT_SCHEMA", nullable = false, length = 64)
    public String getEventSchema() {
        return eventSchema;
    }

    public void setEventSchema(String eventSchema) {
        this.eventSchema = eventSchema;
    }

    @Basic
    @Column(name = "EVENT_NAME", nullable = false, length = 64)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Basic
    @Column(name = "DEFINER", nullable = false, length = 93)
    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Basic
    @Column(name = "TIME_ZONE", nullable = false, length = 64)
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Basic
    @Column(name = "EVENT_BODY", nullable = false, length = 3)
    public String getEventBody() {
        return eventBody;
    }

    public void setEventBody(String eventBody) {
        this.eventBody = eventBody;
    }

    @Basic
    @Column(name = "EVENT_DEFINITION", nullable = false, length = -1)
    public String getEventDefinition() {
        return eventDefinition;
    }

    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = eventDefinition;
    }

    @Basic
    @Column(name = "EVENT_TYPE", nullable = false, length = 9)
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Basic
    @Column(name = "EXECUTE_AT", nullable = true)
    public Timestamp getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Timestamp executeAt) {
        this.executeAt = executeAt;
    }

    @Basic
    @Column(name = "INTERVAL_VALUE", nullable = true)
    public Integer getIntervalValue() {
        return intervalValue;
    }

    public void setIntervalValue(Integer intervalValue) {
        this.intervalValue = intervalValue;
    }

    @Basic
    @Column(name = "INTERVAL_FIELD", nullable = true)
    public Object getIntervalField() {
        return intervalField;
    }

    public void setIntervalField(Object intervalField) {
        this.intervalField = intervalField;
    }

    @Basic
    @Column(name = "SQL_MODE", nullable = false)
    public Object getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(Object sqlMode) {
        this.sqlMode = sqlMode;
    }

    @Basic
    @Column(name = "STARTS", nullable = true)
    public Timestamp getStarts() {
        return starts;
    }

    public void setStarts(Timestamp starts) {
        this.starts = starts;
    }

    @Basic
    @Column(name = "ENDS", nullable = true)
    public Timestamp getEnds() {
        return ends;
    }

    public void setEnds(Timestamp ends) {
        this.ends = ends;
    }

    @Basic
    @Column(name = "STATUS", nullable = false)
    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ON_COMPLETION", nullable = false, length = 12)
    public String getOnCompletion() {
        return onCompletion;
    }

    public void setOnCompletion(String onCompletion) {
        this.onCompletion = onCompletion;
    }

    @Basic
    @Column(name = "CREATED", nullable = false)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "LAST_ALTERED", nullable = false)
    public Timestamp getLastAltered() {
        return lastAltered;
    }

    public void setLastAltered(Timestamp lastAltered) {
        this.lastAltered = lastAltered;
    }

    @Basic
    @Column(name = "LAST_EXECUTED", nullable = true)
    public Timestamp getLastExecuted() {
        return lastExecuted;
    }

    public void setLastExecuted(Timestamp lastExecuted) {
        this.lastExecuted = lastExecuted;
    }

    @Basic
    @Column(name = "EVENT_COMMENT", nullable = false, length = 2048)
    public String getEventComment() {
        return eventComment;
    }

    public void setEventComment(String eventComment) {
        this.eventComment = eventComment;
    }

    @Basic
    @Column(name = "ORIGINATOR", nullable = false)
    public int getOriginator() {
        return originator;
    }

    public void setOriginator(int originator) {
        this.originator = originator;
    }

    @Basic
    @Column(name = "CHARACTER_SET_CLIENT", nullable = false, length = 64)
    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    @Basic
    @Column(name = "COLLATION_CONNECTION", nullable = false, length = 64)
    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    @Basic
    @Column(name = "DATABASE_COLLATION", nullable = false, length = 64)
    public String getDatabaseCollation() {
        return databaseCollation;
    }

    public void setDatabaseCollation(String databaseCollation) {
        this.databaseCollation = databaseCollation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return originator == events.originator &&
                Objects.equals(eventCatalog, events.eventCatalog) &&
                Objects.equals(eventSchema, events.eventSchema) &&
                Objects.equals(eventName, events.eventName) &&
                Objects.equals(definer, events.definer) &&
                Objects.equals(timeZone, events.timeZone) &&
                Objects.equals(eventBody, events.eventBody) &&
                Objects.equals(eventDefinition, events.eventDefinition) &&
                Objects.equals(eventType, events.eventType) &&
                Objects.equals(executeAt, events.executeAt) &&
                Objects.equals(intervalValue, events.intervalValue) &&
                Objects.equals(intervalField, events.intervalField) &&
                Objects.equals(sqlMode, events.sqlMode) &&
                Objects.equals(starts, events.starts) &&
                Objects.equals(ends, events.ends) &&
                Objects.equals(status, events.status) &&
                Objects.equals(onCompletion, events.onCompletion) &&
                Objects.equals(created, events.created) &&
                Objects.equals(lastAltered, events.lastAltered) &&
                Objects.equals(lastExecuted, events.lastExecuted) &&
                Objects.equals(eventComment, events.eventComment) &&
                Objects.equals(characterSetClient, events.characterSetClient) &&
                Objects.equals(collationConnection, events.collationConnection) &&
                Objects.equals(databaseCollation, events.databaseCollation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventCatalog, eventSchema, eventName, definer, timeZone, eventBody, eventDefinition, eventType, executeAt, intervalValue, intervalField, sqlMode, starts, ends, status, onCompletion, created, lastAltered, lastExecuted, eventComment, originator, characterSetClient, collationConnection, databaseCollation);
    }
}
