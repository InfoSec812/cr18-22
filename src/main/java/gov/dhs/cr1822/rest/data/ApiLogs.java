package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "api_logs", schema = "example_database", catalog = "")
public class ApiLogs {
    private int id;
    private String action;
    private String controller;
    private String uri;
    private String userGuid;
    private Integer count;
    private String querySourceEntity;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "action", nullable = true, length = 255)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "controller", nullable = true, length = 255)
    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    @Basic
    @Column(name = "uri", nullable = true, length = -1)
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Basic
    @Column(name = "user_guid", nullable = true, length = 255)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Basic
    @Column(name = "count", nullable = true)
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "query_source_entity", nullable = true, length = 255)
    public String getQuerySourceEntity() {
        return querySourceEntity;
    }

    public void setQuerySourceEntity(String querySourceEntity) {
        this.querySourceEntity = querySourceEntity;
    }

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiLogs apiLogs = (ApiLogs) o;
        return id == apiLogs.id &&
                Objects.equals(action, apiLogs.action) &&
                Objects.equals(controller, apiLogs.controller) &&
                Objects.equals(uri, apiLogs.uri) &&
                Objects.equals(userGuid, apiLogs.userGuid) &&
                Objects.equals(count, apiLogs.count) &&
                Objects.equals(querySourceEntity, apiLogs.querySourceEntity) &&
                Objects.equals(createdAt, apiLogs.createdAt) &&
                Objects.equals(updatedAt, apiLogs.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, action, controller, uri, userGuid, count, querySourceEntity, createdAt, updatedAt);
    }
}
