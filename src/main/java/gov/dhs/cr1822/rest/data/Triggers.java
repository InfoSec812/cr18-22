package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Triggers {
    private String triggerCatalog;
    private String triggerSchema;
    private String triggerName;
    private Object eventManipulation;
    private String eventObjectCatalog;
    private String eventObjectSchema;
    private String eventObjectTable;
    private int actionOrder;
    private byte[] actionCondition;
    private String actionStatement;
    private String actionOrientation;
    private Object actionTiming;
    private byte[] actionReferenceOldTable;
    private byte[] actionReferenceNewTable;
    private String actionReferenceOldRow;
    private String actionReferenceNewRow;
    private Timestamp created;
    private Object sqlMode;
    private String definer;
    private String characterSetClient;
    private String collationConnection;
    private String databaseCollation;

    @Basic
    @Column(name = "TRIGGER_CATALOG", nullable = false, length = 64)
    public String getTriggerCatalog() {
        return triggerCatalog;
    }

    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    @Basic
    @Column(name = "TRIGGER_SCHEMA", nullable = false, length = 64)
    public String getTriggerSchema() {
        return triggerSchema;
    }

    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    @Basic
    @Column(name = "TRIGGER_NAME", nullable = false, length = 64)
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Basic
    @Column(name = "EVENT_MANIPULATION", nullable = false)
    public Object getEventManipulation() {
        return eventManipulation;
    }

    public void setEventManipulation(Object eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    @Basic
    @Column(name = "EVENT_OBJECT_CATALOG", nullable = false, length = 64)
    public String getEventObjectCatalog() {
        return eventObjectCatalog;
    }

    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    @Basic
    @Column(name = "EVENT_OBJECT_SCHEMA", nullable = false, length = 64)
    public String getEventObjectSchema() {
        return eventObjectSchema;
    }

    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    @Basic
    @Column(name = "EVENT_OBJECT_TABLE", nullable = false, length = 64)
    public String getEventObjectTable() {
        return eventObjectTable;
    }

    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    @Basic
    @Column(name = "ACTION_ORDER", nullable = false)
    public int getActionOrder() {
        return actionOrder;
    }

    public void setActionOrder(int actionOrder) {
        this.actionOrder = actionOrder;
    }

    @Basic
    @Column(name = "ACTION_CONDITION", nullable = true)
    public byte[] getActionCondition() {
        return actionCondition;
    }

    public void setActionCondition(byte[] actionCondition) {
        this.actionCondition = actionCondition;
    }

    @Basic
    @Column(name = "ACTION_STATEMENT", nullable = false, length = -1)
    public String getActionStatement() {
        return actionStatement;
    }

    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    @Basic
    @Column(name = "ACTION_ORIENTATION", nullable = false, length = 3)
    public String getActionOrientation() {
        return actionOrientation;
    }

    public void setActionOrientation(String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    @Basic
    @Column(name = "ACTION_TIMING", nullable = false)
    public Object getActionTiming() {
        return actionTiming;
    }

    public void setActionTiming(Object actionTiming) {
        this.actionTiming = actionTiming;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_OLD_TABLE", nullable = true)
    public byte[] getActionReferenceOldTable() {
        return actionReferenceOldTable;
    }

    public void setActionReferenceOldTable(byte[] actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_NEW_TABLE", nullable = true)
    public byte[] getActionReferenceNewTable() {
        return actionReferenceNewTable;
    }

    public void setActionReferenceNewTable(byte[] actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_OLD_ROW", nullable = false, length = 3)
    public String getActionReferenceOldRow() {
        return actionReferenceOldRow;
    }

    public void setActionReferenceOldRow(String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    @Basic
    @Column(name = "ACTION_REFERENCE_NEW_ROW", nullable = false, length = 3)
    public String getActionReferenceNewRow() {
        return actionReferenceNewRow;
    }

    public void setActionReferenceNewRow(String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
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
    @Column(name = "SQL_MODE", nullable = false)
    public Object getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(Object sqlMode) {
        this.sqlMode = sqlMode;
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
        Triggers triggers = (Triggers) o;
        return actionOrder == triggers.actionOrder &&
                Objects.equals(triggerCatalog, triggers.triggerCatalog) &&
                Objects.equals(triggerSchema, triggers.triggerSchema) &&
                Objects.equals(triggerName, triggers.triggerName) &&
                Objects.equals(eventManipulation, triggers.eventManipulation) &&
                Objects.equals(eventObjectCatalog, triggers.eventObjectCatalog) &&
                Objects.equals(eventObjectSchema, triggers.eventObjectSchema) &&
                Objects.equals(eventObjectTable, triggers.eventObjectTable) &&
                Arrays.equals(actionCondition, triggers.actionCondition) &&
                Objects.equals(actionStatement, triggers.actionStatement) &&
                Objects.equals(actionOrientation, triggers.actionOrientation) &&
                Objects.equals(actionTiming, triggers.actionTiming) &&
                Arrays.equals(actionReferenceOldTable, triggers.actionReferenceOldTable) &&
                Arrays.equals(actionReferenceNewTable, triggers.actionReferenceNewTable) &&
                Objects.equals(actionReferenceOldRow, triggers.actionReferenceOldRow) &&
                Objects.equals(actionReferenceNewRow, triggers.actionReferenceNewRow) &&
                Objects.equals(created, triggers.created) &&
                Objects.equals(sqlMode, triggers.sqlMode) &&
                Objects.equals(definer, triggers.definer) &&
                Objects.equals(characterSetClient, triggers.characterSetClient) &&
                Objects.equals(collationConnection, triggers.collationConnection) &&
                Objects.equals(databaseCollation, triggers.databaseCollation);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(triggerCatalog, triggerSchema, triggerName, eventManipulation, eventObjectCatalog, eventObjectSchema, eventObjectTable, actionOrder, actionStatement, actionOrientation, actionTiming, actionReferenceOldRow, actionReferenceNewRow, created, sqlMode, definer, characterSetClient, collationConnection, databaseCollation);
        result = 31 * result + Arrays.hashCode(actionCondition);
        result = 31 * result + Arrays.hashCode(actionReferenceOldTable);
        result = 31 * result + Arrays.hashCode(actionReferenceNewTable);
        return result;
    }
}
