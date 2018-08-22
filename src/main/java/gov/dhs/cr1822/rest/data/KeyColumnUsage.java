package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "KEY_COLUMN_USAGE", schema = "information_schema", catalog = "")
public class KeyColumnUsage {
    private String constraintCatalog;
    private String constraintSchema;
    private String constraintName;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String columnName;
    private int ordinalPosition;
    private byte[] positionInUniqueConstraint;
    private byte[] referencedTableSchema;
    private byte[] referencedTableName;
    private byte[] referencedColumnName;

    @Basic
    @Column(name = "CONSTRAINT_CATALOG", nullable = false, length = 64)
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    @Basic
    @Column(name = "CONSTRAINT_SCHEMA", nullable = false, length = 64)
    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    @Basic
    @Column(name = "CONSTRAINT_NAME", nullable = true, length = 64)
    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

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
    @Column(name = "POSITION_IN_UNIQUE_CONSTRAINT", nullable = true)
    public byte[] getPositionInUniqueConstraint() {
        return positionInUniqueConstraint;
    }

    public void setPositionInUniqueConstraint(byte[] positionInUniqueConstraint) {
        this.positionInUniqueConstraint = positionInUniqueConstraint;
    }

    @Basic
    @Column(name = "REFERENCED_TABLE_SCHEMA", nullable = true)
    public byte[] getReferencedTableSchema() {
        return referencedTableSchema;
    }

    public void setReferencedTableSchema(byte[] referencedTableSchema) {
        this.referencedTableSchema = referencedTableSchema;
    }

    @Basic
    @Column(name = "REFERENCED_TABLE_NAME", nullable = true)
    public byte[] getReferencedTableName() {
        return referencedTableName;
    }

    public void setReferencedTableName(byte[] referencedTableName) {
        this.referencedTableName = referencedTableName;
    }

    @Basic
    @Column(name = "REFERENCED_COLUMN_NAME", nullable = true)
    public byte[] getReferencedColumnName() {
        return referencedColumnName;
    }

    public void setReferencedColumnName(byte[] referencedColumnName) {
        this.referencedColumnName = referencedColumnName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyColumnUsage that = (KeyColumnUsage) o;
        return ordinalPosition == that.ordinalPosition &&
                Objects.equals(constraintCatalog, that.constraintCatalog) &&
                Objects.equals(constraintSchema, that.constraintSchema) &&
                Objects.equals(constraintName, that.constraintName) &&
                Objects.equals(tableCatalog, that.tableCatalog) &&
                Objects.equals(tableSchema, that.tableSchema) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(columnName, that.columnName) &&
                Arrays.equals(positionInUniqueConstraint, that.positionInUniqueConstraint) &&
                Arrays.equals(referencedTableSchema, that.referencedTableSchema) &&
                Arrays.equals(referencedTableName, that.referencedTableName) &&
                Arrays.equals(referencedColumnName, that.referencedColumnName);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(constraintCatalog, constraintSchema, constraintName, tableCatalog, tableSchema, tableName, columnName, ordinalPosition);
        result = 31 * result + Arrays.hashCode(positionInUniqueConstraint);
        result = 31 * result + Arrays.hashCode(referencedTableSchema);
        result = 31 * result + Arrays.hashCode(referencedTableName);
        result = 31 * result + Arrays.hashCode(referencedColumnName);
        return result;
    }
}
