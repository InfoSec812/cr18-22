package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Schemata {
    private String catalogName;
    private String schemaName;
    private String defaultCharacterSetName;
    private String defaultCollationName;
    private byte[] sqlPath;

    @Basic
    @Column(name = "CATALOG_NAME", nullable = false, length = 64)
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    @Basic
    @Column(name = "SCHEMA_NAME", nullable = false, length = 64)
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Basic
    @Column(name = "DEFAULT_CHARACTER_SET_NAME", nullable = false, length = 64)
    public String getDefaultCharacterSetName() {
        return defaultCharacterSetName;
    }

    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    @Basic
    @Column(name = "DEFAULT_COLLATION_NAME", nullable = false, length = 64)
    public String getDefaultCollationName() {
        return defaultCollationName;
    }

    public void setDefaultCollationName(String defaultCollationName) {
        this.defaultCollationName = defaultCollationName;
    }

    @Basic
    @Column(name = "SQL_PATH", nullable = true)
    public byte[] getSqlPath() {
        return sqlPath;
    }

    public void setSqlPath(byte[] sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schemata schemata = (Schemata) o;
        return Objects.equals(catalogName, schemata.catalogName) &&
                Objects.equals(schemaName, schemata.schemaName) &&
                Objects.equals(defaultCharacterSetName, schemata.defaultCharacterSetName) &&
                Objects.equals(defaultCollationName, schemata.defaultCollationName) &&
                Arrays.equals(sqlPath, schemata.sqlPath);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(catalogName, schemaName, defaultCharacterSetName, defaultCollationName);
        result = 31 * result + Arrays.hashCode(sqlPath);
        return result;
    }
}
