package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DbPK implements Serializable {
    private String host;
    private String db;
    private String user;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbPK dbPK = (DbPK) o;
        return Objects.equals(host, dbPK.host) &&
                Objects.equals(db, dbPK.db) &&
                Objects.equals(user, dbPK.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, db, user);
    }
}
