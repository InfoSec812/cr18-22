package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Routines {
    private String specificName;
    private String routineCatalog;
    private String routineSchema;
    private String routineName;
    private Object routineType;
    private String dataType;
    private Long characterMaximumLength;
    private Long characterOctetLength;
    private Integer numericPrecision;
    private Integer numericScale;
    private Integer datetimePrecision;
    private String characterSetName;
    private String collationName;
    private String dtdIdentifier;
    private String routineBody;
    private String routineDefinition;
    private byte[] externalName;
    private String externalLanguage;
    private String parameterStyle;
    private String isDeterministic;
    private Object sqlDataAccess;
    private byte[] sqlPath;
    private Object securityType;
    private Timestamp created;
    private Timestamp lastAltered;
    private Object sqlMode;
    private String routineComment;
    private String definer;
    private String characterSetClient;
    private String collationConnection;
    private String databaseCollation;

    @Basic
    @Column(name = "SPECIFIC_NAME", nullable = false, length = 64)
    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    @Basic
    @Column(name = "ROUTINE_CATALOG", nullable = false, length = 64)
    public String getRoutineCatalog() {
        return routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    @Basic
    @Column(name = "ROUTINE_SCHEMA", nullable = false, length = 64)
    public String getRoutineSchema() {
        return routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    @Basic
    @Column(name = "ROUTINE_NAME", nullable = false, length = 64)
    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    @Basic
    @Column(name = "ROUTINE_TYPE", nullable = false)
    public Object getRoutineType() {
        return routineType;
    }

    public void setRoutineType(Object routineType) {
        this.routineType = routineType;
    }

    @Basic
    @Column(name = "DATA_TYPE", nullable = true, length = -1)
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "CHARACTER_MAXIMUM_LENGTH", nullable = true)
    public Long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    @Basic
    @Column(name = "CHARACTER_OCTET_LENGTH", nullable = true)
    public Long getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(Long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    @Basic
    @Column(name = "NUMERIC_PRECISION", nullable = true)
    public Integer getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    @Basic
    @Column(name = "NUMERIC_SCALE", nullable = true)
    public Integer getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Integer numericScale) {
        this.numericScale = numericScale;
    }

    @Basic
    @Column(name = "DATETIME_PRECISION", nullable = true)
    public Integer getDatetimePrecision() {
        return datetimePrecision;
    }

    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    @Basic
    @Column(name = "CHARACTER_SET_NAME", nullable = true, length = 64)
    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    @Basic
    @Column(name = "COLLATION_NAME", nullable = true, length = 64)
    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    @Basic
    @Column(name = "DTD_IDENTIFIER", nullable = true, length = -1)
    public String getDtdIdentifier() {
        return dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    @Basic
    @Column(name = "ROUTINE_BODY", nullable = false, length = 3)
    public String getRoutineBody() {
        return routineBody;
    }

    public void setRoutineBody(String routineBody) {
        this.routineBody = routineBody;
    }

    @Basic
    @Column(name = "ROUTINE_DEFINITION", nullable = true, length = -1)
    public String getRoutineDefinition() {
        return routineDefinition;
    }

    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition;
    }

    @Basic
    @Column(name = "EXTERNAL_NAME", nullable = true)
    public byte[] getExternalName() {
        return externalName;
    }

    public void setExternalName(byte[] externalName) {
        this.externalName = externalName;
    }

    @Basic
    @Column(name = "EXTERNAL_LANGUAGE", nullable = false, length = 64)
    public String getExternalLanguage() {
        return externalLanguage;
    }

    public void setExternalLanguage(String externalLanguage) {
        this.externalLanguage = externalLanguage;
    }

    @Basic
    @Column(name = "PARAMETER_STYLE", nullable = false, length = 3)
    public String getParameterStyle() {
        return parameterStyle;
    }

    public void setParameterStyle(String parameterStyle) {
        this.parameterStyle = parameterStyle;
    }

    @Basic
    @Column(name = "IS_DETERMINISTIC", nullable = false, length = 3)
    public String getIsDeterministic() {
        return isDeterministic;
    }

    public void setIsDeterministic(String isDeterministic) {
        this.isDeterministic = isDeterministic;
    }

    @Basic
    @Column(name = "SQL_DATA_ACCESS", nullable = false)
    public Object getSqlDataAccess() {
        return sqlDataAccess;
    }

    public void setSqlDataAccess(Object sqlDataAccess) {
        this.sqlDataAccess = sqlDataAccess;
    }

    @Basic
    @Column(name = "SQL_PATH", nullable = true)
    public byte[] getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(byte[] sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Basic
    @Column(name = "SECURITY_TYPE", nullable = false)
    public Object getSecurityType() {
        return securityType;
    }

    public void setSecurityType(Object securityType) {
        this.securityType = securityType;
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
    @Column(name = "SQL_MODE", nullable = false)
    public Object getSqlMode() {
        return sqlMode;
    }

    public void setSqlMode(Object sqlMode) {
        this.sqlMode = sqlMode;
    }

    @Basic
    @Column(name = "ROUTINE_COMMENT", nullable = false, length = -1)
    public String getRoutineComment() {
        return routineComment;
    }

    public void setRoutineComment(String routineComment) {
        this.routineComment = routineComment;
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
        Routines routines = (Routines) o;
        return Objects.equals(specificName, routines.specificName) &&
                Objects.equals(routineCatalog, routines.routineCatalog) &&
                Objects.equals(routineSchema, routines.routineSchema) &&
                Objects.equals(routineName, routines.routineName) &&
                Objects.equals(routineType, routines.routineType) &&
                Objects.equals(dataType, routines.dataType) &&
                Objects.equals(characterMaximumLength, routines.characterMaximumLength) &&
                Objects.equals(characterOctetLength, routines.characterOctetLength) &&
                Objects.equals(numericPrecision, routines.numericPrecision) &&
                Objects.equals(numericScale, routines.numericScale) &&
                Objects.equals(datetimePrecision, routines.datetimePrecision) &&
                Objects.equals(characterSetName, routines.characterSetName) &&
                Objects.equals(collationName, routines.collationName) &&
                Objects.equals(dtdIdentifier, routines.dtdIdentifier) &&
                Objects.equals(routineBody, routines.routineBody) &&
                Objects.equals(routineDefinition, routines.routineDefinition) &&
                Arrays.equals(externalName, routines.externalName) &&
                Objects.equals(externalLanguage, routines.externalLanguage) &&
                Objects.equals(parameterStyle, routines.parameterStyle) &&
                Objects.equals(isDeterministic, routines.isDeterministic) &&
                Objects.equals(sqlDataAccess, routines.sqlDataAccess) &&
                Arrays.equals(sqlPath, routines.sqlPath) &&
                Objects.equals(securityType, routines.securityType) &&
                Objects.equals(created, routines.created) &&
                Objects.equals(lastAltered, routines.lastAltered) &&
                Objects.equals(sqlMode, routines.sqlMode) &&
                Objects.equals(routineComment, routines.routineComment) &&
                Objects.equals(definer, routines.definer) &&
                Objects.equals(characterSetClient, routines.characterSetClient) &&
                Objects.equals(collationConnection, routines.collationConnection) &&
                Objects.equals(databaseCollation, routines.databaseCollation);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(specificName, routineCatalog, routineSchema, routineName, routineType, dataType, characterMaximumLength, characterOctetLength, numericPrecision, numericScale, datetimePrecision, characterSetName, collationName, dtdIdentifier, routineBody, routineDefinition, externalLanguage, parameterStyle, isDeterministic, sqlDataAccess, securityType, created, lastAltered, sqlMode, routineComment, definer, characterSetClient, collationConnection, databaseCollation);
        result = 31 * result + Arrays.hashCode(externalName);
        result = 31 * result + Arrays.hashCode(sqlPath);
        return result;
    }
}
