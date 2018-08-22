package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Parameters {
    private String specificCatalog;
    private String specificSchema;
    private String specificName;
    private long ordinalPosition;
    private String parameterMode;
    private String parameterName;
    private String dataType;
    private Long characterMaximumLength;
    private Long characterOctetLength;
    private Integer numericPrecision;
    private Long numericScale;
    private Integer datetimePrecision;
    private String characterSetName;
    private String collationName;
    private String dtdIdentifier;
    private Object routineType;

    @Basic
    @Column(name = "SPECIFIC_CATALOG", nullable = false, length = 64)
    public String getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    @Basic
    @Column(name = "SPECIFIC_SCHEMA", nullable = false, length = 64)
    public String getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    @Basic
    @Column(name = "SPECIFIC_NAME", nullable = false, length = 64)
    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    @Basic
    @Column(name = "ORDINAL_POSITION", nullable = false)
    public long getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(long ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Basic
    @Column(name = "PARAMETER_MODE", nullable = true, length = 5)
    public String getParameterMode() {
        return parameterMode;
    }

    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode;
    }

    @Basic
    @Column(name = "PARAMETER_NAME", nullable = true, length = 64)
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
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
    public Long getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Long numericScale) {
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
    @Column(name = "DTD_IDENTIFIER", nullable = false, length = -1)
    public String getDtdIdentifier() {
        return dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    @Basic
    @Column(name = "ROUTINE_TYPE", nullable = false)
    public Object getRoutineType() {
        return routineType;
    }

    public void setRoutineType(Object routineType) {
        this.routineType = routineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameters that = (Parameters) o;
        return ordinalPosition == that.ordinalPosition &&
                Objects.equals(specificCatalog, that.specificCatalog) &&
                Objects.equals(specificSchema, that.specificSchema) &&
                Objects.equals(specificName, that.specificName) &&
                Objects.equals(parameterMode, that.parameterMode) &&
                Objects.equals(parameterName, that.parameterName) &&
                Objects.equals(dataType, that.dataType) &&
                Objects.equals(characterMaximumLength, that.characterMaximumLength) &&
                Objects.equals(characterOctetLength, that.characterOctetLength) &&
                Objects.equals(numericPrecision, that.numericPrecision) &&
                Objects.equals(numericScale, that.numericScale) &&
                Objects.equals(datetimePrecision, that.datetimePrecision) &&
                Objects.equals(characterSetName, that.characterSetName) &&
                Objects.equals(collationName, that.collationName) &&
                Objects.equals(dtdIdentifier, that.dtdIdentifier) &&
                Objects.equals(routineType, that.routineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specificCatalog, specificSchema, specificName, ordinalPosition, parameterMode, parameterName, dataType, characterMaximumLength, characterOctetLength, numericPrecision, numericScale, datetimePrecision, characterSetName, collationName, dtdIdentifier, routineType);
    }
}
