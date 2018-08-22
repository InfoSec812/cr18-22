package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Columns {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;
    private int ordinalPosition;
    private String columnDefault;
    private String isNullable;
    private String dataType;
    private Long characterMaximumLength;
    private Long characterOctetLength;
    private Long numericPrecision;
    private Long numericScale;
    private Integer datetimePrecision;
    private String characterSetName;
    private String collationName;
    private String columnType;
    private Object columnKey;
    private String extra;
    private String privileges;
    private String columnComment;
    private String generationExpression;
    private Integer srsId;

    @Basic
    @Column(name = "TABLE_CATALOG", nullable = false, length = 64)
    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    @Basic
    @Column(name = "TABLE_SCHEMA", nullable = false, length = 64)
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    @Basic
    @Column(name = "TABLE_NAME", nullable = false, length = 64)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "COLUMN_NAME", nullable = true, length = 64)
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Basic
    @Column(name = "ORDINAL_POSITION", nullable = false)
    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Basic
    @Column(name = "COLUMN_DEFAULT", nullable = true, length = -1)
    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    @Basic
    @Column(name = "IS_NULLABLE", nullable = false, length = 3)
    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
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
    public Long getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Long numericPrecision) {
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
    @Column(name = "COLUMN_TYPE", nullable = false, length = -1)
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Basic
    @Column(name = "COLUMN_KEY", nullable = false)
    public Object getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(Object columnKey) {
        this.columnKey = columnKey;
    }

    @Basic
    @Column(name = "EXTRA", nullable = true, length = 57)
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Basic
    @Column(name = "PRIVILEGES", nullable = true, length = 154)
    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    @Basic
    @Column(name = "COLUMN_COMMENT", nullable = false, length = -1)
    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    @Basic
    @Column(name = "GENERATION_EXPRESSION", nullable = false, length = -1)
    public String getGenerationExpression() {
        return generationExpression;
    }

    public void setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
    }

    @Basic
    @Column(name = "SRS_ID", nullable = true)
    public Integer getSrsId() {
        return srsId;
    }

    public void setSrsId(Integer srsId) {
        this.srsId = srsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Columns columns = (Columns) o;
        return ordinalPosition == columns.ordinalPosition &&
                Objects.equals(tableCatalog, columns.tableCatalog) &&
                Objects.equals(tableSchema, columns.tableSchema) &&
                Objects.equals(tableName, columns.tableName) &&
                Objects.equals(columnName, columns.columnName) &&
                Objects.equals(columnDefault, columns.columnDefault) &&
                Objects.equals(isNullable, columns.isNullable) &&
                Objects.equals(dataType, columns.dataType) &&
                Objects.equals(characterMaximumLength, columns.characterMaximumLength) &&
                Objects.equals(characterOctetLength, columns.characterOctetLength) &&
                Objects.equals(numericPrecision, columns.numericPrecision) &&
                Objects.equals(numericScale, columns.numericScale) &&
                Objects.equals(datetimePrecision, columns.datetimePrecision) &&
                Objects.equals(characterSetName, columns.characterSetName) &&
                Objects.equals(collationName, columns.collationName) &&
                Objects.equals(columnType, columns.columnType) &&
                Objects.equals(columnKey, columns.columnKey) &&
                Objects.equals(extra, columns.extra) &&
                Objects.equals(privileges, columns.privileges) &&
                Objects.equals(columnComment, columns.columnComment) &&
                Objects.equals(generationExpression, columns.generationExpression) &&
                Objects.equals(srsId, columns.srsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableCatalog, tableSchema, tableName, columnName, ordinalPosition, columnDefault, isNullable, dataType, characterMaximumLength, characterOctetLength, numericPrecision, numericScale, datetimePrecision, characterSetName, collationName, columnType, columnKey, extra, privileges, columnComment, generationExpression, srsId);
    }
}
