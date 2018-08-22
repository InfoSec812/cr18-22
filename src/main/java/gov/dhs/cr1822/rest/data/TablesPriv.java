package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "tables_priv", schema = "mysql", catalog = "")
@IdClass(TablesPrivPK.class)
public class TablesPriv {
    private String host;
    private String db;
    private String user;
    private String tableName;
    private String grantor;
    private Timestamp timestamp;
    private Object tablePriv;
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

    @Basic
    @Column(name = "Grantor", nullable = false, length = 93)
    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
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
    @Column(name = "Table_priv", nullable = false)
    public Object getTablePriv() {
        return tablePriv;
    }

    public void setTablePriv(Object tablePriv) {
        this.tablePriv = tablePriv;
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
        TablesPriv that = (TablesPriv) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(db, that.db) &&
                Objects.equals(user, that.user) &&
                Objects.equals(tableName, that.tableName) &&
                Objects.equals(grantor, that.grantor) &&
                Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(tablePriv, that.tablePriv) &&
                Objects.equals(columnPriv, that.columnPriv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, db, user, tableName, grantor, timestamp, tablePriv, columnPriv);
    }
}
