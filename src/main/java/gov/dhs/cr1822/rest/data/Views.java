package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Views {
    private String tableCatalog;
    private String tableSchema;
    private String tableName;
    private String viewDefinition;
    private Object checkOption;
    private Object isUpdatable;
    private String definer;
    private String securityType;
    private String characterSetClient;
    private String collationConnection;

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
    @Column(name = "VIEW_DEFINITION", nullable = true, length = -1)
    public String getViewDefinition() {
        return viewDefinition;
    }

    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    @Basic
    @Column(name = "CHECK_OPTION", nullable = true)
    public Object getCheckOption() {
        return checkOption;
    }

    public void setCheckOption(Object checkOption) {
        this.checkOption = checkOption;
    }

    @Basic
    @Column(name = "IS_UPDATABLE", nullable = true)
    public Object getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(Object isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    @Basic
    @Column(name = "DEFINER", nullable = true, length = 93)
    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    @Basic
    @Column(name = "SECURITY_TYPE", nullable = true, length = 7)
    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Views views = (Views) o;
        return Objects.equals(tableCatalog, views.tableCatalog) &&
                Objects.equals(tableSchema, views.tableSchema) &&
                Objects.equals(tableName, views.tableName) &&
                Objects.equals(viewDefinition, views.viewDefinition) &&
                Objects.equals(checkOption, views.checkOption) &&
                Objects.equals(isUpdatable, views.isUpdatable) &&
                Objects.equals(definer, views.definer) &&
                Objects.equals(securityType, views.securityType) &&
                Objects.equals(characterSetClient, views.characterSetClient) &&
                Objects.equals(collationConnection, views.collationConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableCatalog, tableSchema, tableName, viewDefinition, checkOption, isUpdatable, definer, securityType, characterSetClient, collationConnection);
    }
}
