package gov.dhs.cr1822.rest.data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ProcsPrivPK implements Serializable {
    private String host;
    private String db;
    private String user;
    private String routineName;
    private Object routineType;

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

    @Column(name = "Routine_name", nullable = false, length = 64)
    @Id
    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    @Column(name = "Routine_type", nullable = false)
    @Id
    public Object getRoutineType() {
        return routineType;
    }

    public void setRoutineType(Object routineType) {
        this.routineType = routineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcsPrivPK that = (ProcsPrivPK) o;
        return Objects.equals(host, that.host) &&
                Objects.equals(db, that.db) &&
                Objects.equals(user, that.user) &&
                Objects.equals(routineName, that.routineName) &&
                Objects.equals(routineType, that.routineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, db, user, routineName, routineType);
    }
}
