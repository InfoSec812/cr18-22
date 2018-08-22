package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "columns_priv", schema = "mysql", catalog = "")
@IdClass(ColumnsPrivPK.class)
public class ColumnsPriv {
    private String host;
    private String db;
    private String user;
    private String tableName;
    private String columnName;
    private Timestamp timestamp;
    private Object columnPriv;

    @Id
    @Column(name = "Host", nullable = false, length = 60)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Id
    @Column(name = "Db", nullable = false, length = 64)
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Id
    @Column(name = "User", nullable = false, length = 32)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Id
    @Column(name = "Table_name", nullable = false, length = 64)
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Id
    @Column(name = "Column_name", nullable = false, length = 64)
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Basic
    @Column(name = "Timestamp", nullable = false)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "Column_priv", nullable = false)
    public Object getColumnPriv() {
        return columnPriv;
    }

    public void setColumnPriv(Object columnPriv) {
        this.columnPriv = columnPriv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnsPriv that = (ColumnsPriv) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(db, that.db) &&
                Objects.equals(user, that.user) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(columnName, that.columnName) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(columnPriv, that.columnPriv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, db, user, tableName, columnName, timestamp, columnPriv);
    }
}
