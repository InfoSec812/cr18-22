package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "procs_priv", schema = "mysql", catalog = "")
@IdClass(ProcsPrivPK.class)
public class ProcsPriv {
    private String host;
    private String db;
    private String user;
    private String routineName;
    private Object routineType;
    private String grantor;
    private Object procPriv;
    private Timestamp timestamp;

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
    @Column(name = "Routine_name", nullable = false, length = 64)
    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    @Id
    @Column(name = "Routine_type", nullable = false)
    public Object getRoutineType() {
        return routineType;
    }

    public void setRoutineType(Object routineType) {
        this.routineType = routineType;
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
    @Column(name = "Proc_priv", nullable = false)
    public Object getProcPriv() {
        return procPriv;
    }

    public void setProcPriv(Object procPriv) {
        this.procPriv = procPriv;
    }

    @Basic
    @Column(name = "Timestamp", nullable = false)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcsPriv procsPriv = (ProcsPriv) o;
        return Objects.equals(host, procsPriv.host) &&
                Objects.equals(db, procsPriv.db) &&
                Objects.equals(user, procsPriv.user) &&
                Objects.equals(routineName, procsPriv.routineName) &&
                Objects.equals(routineType, procsPriv.routineType) &&
                Objects.equals(grantor, procsPriv.grantor) &&
                Objects.equals(procPriv, procsPriv.procPriv) &&
                Objects.equals(timestamp, procsPriv.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, db, user, routineName, routineType, grantor, procPriv, timestamp);
    }
}
