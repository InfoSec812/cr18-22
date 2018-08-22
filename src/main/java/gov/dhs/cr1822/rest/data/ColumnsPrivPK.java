package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ColumnsPrivPK implements Serializable {
    private String host;
    private String db;
    private String user;
    private String tableName;
    private String columnName;

    @Column(name = "Host", nullable = false, length = 60)
    @Id
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Column(name = "Db", nullable = false, length = 64)
    @Id
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Column(name = "User", nullable = false, length = 32)
    @Id
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Column(name = "Table_name", nullable = false, length = 64)
    @Id
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Column(name = "Column_name", nullable = false, length = 64)
    @Id
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnsPrivPK that = (ColumnsPrivPK) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(db, that.db) &&
                Objects.equals(user, that.user) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(columnName, that.columnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, db, user, tableName, columnName);
    }
}
