package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "TABLE_PRIVILEGES", schema = "information_schema", catalog = "")
public class TablePrivileges {
    private String grantee;
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String privilegeType;
    private String isGrantable;

    @Basic
    @Column(name = "GRANTEE", nullable = false, length = 81)
    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    @Basic
    @Column(name = "TABLE_CATALOG", nullable = false, length = 512)
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
    @Column(name = "PRIVILEGE_TYPE", nullable = false, length = 64)
    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    @Basic
    @Column(name = "IS_GRANTABLE", nullable = false, length = 3)
    public String getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TablePrivileges that = (TablePrivileges) o;
        return Objects.equals(grantee, that.grantee) &&
                Objects.equals(tableCatalog, that.tableCatalog) &&
                Objects.equals(tableSchema, that.tableSchema) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(privilegeType, that.privilegeType) &&
                Objects.equals(isGrantable, that.isGrantable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantee, tableCatalog, tableSchema, tableName, privilegeType, isGrantable);
    }
}
