package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(DbPK.class)
public class Db {
    private String host;
    private String db;
    private String user;
    private Object selectPriv;
    private Object insertPriv;
    private Object updatePriv;
    private Object deletePriv;
    private Object createPriv;
    private Object dropPriv;
    private Object grantPriv;
    private Object referencesPriv;
    private Object indexPriv;
    private Object alterPriv;
    private Object createTmpTablePriv;
    private Object lockTablesPriv;
    private Object createViewPriv;
    private Object showViewPriv;
    private Object createRoutinePriv;
    private Object alterRoutinePriv;
    private Object executePriv;
    private Object eventPriv;
    private Object triggerPriv;

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

    @Basic
    @Column(name = "Select_priv", nullable = false)
    public Object getSelectPriv() {
        return selectPriv;
    }

    public void setSelectPriv(Object selectPriv) {
        this.selectPriv = selectPriv;
    }

    @Basic
    @Column(name = "Insert_priv", nullable = false)
    public Object getInsertPriv() {
        return insertPriv;
    }

    public void setInsertPriv(Object insertPriv) {
        this.insertPriv = insertPriv;
    }

    @Basic
    @Column(name = "Update_priv", nullable = false)
    public Object getUpdatePriv() {
        return updatePriv;
    }

    public void setUpdatePriv(Object updatePriv) {
        this.updatePriv = updatePriv;
    }

    @Basic
    @Column(name = "Delete_priv", nullable = false)
    public Object getDeletePriv() {
        return deletePriv;
    }

    public void setDeletePriv(Object deletePriv) {
        this.deletePriv = deletePriv;
    }

    @Basic
    @Column(name = "Create_priv", nullable = false)
    public Object getCreatePriv() {
        return createPriv;
    }

    public void setCreatePriv(Object createPriv) {
        this.createPriv = createPriv;
    }

    @Basic
    @Column(name = "Drop_priv", nullable = false)
    public Object getDropPriv() {
        return dropPriv;
    }

    public void setDropPriv(Object dropPriv) {
        this.dropPriv = dropPriv;
    }

    @Basic
    @Column(name = "Grant_priv", nullable = false)
    public Object getGrantPriv() {
        return grantPriv;
    }

    public void setGrantPriv(Object grantPriv) {
        this.grantPriv = grantPriv;
    }

    @Basic
    @Column(name = "References_priv", nullable = false)
    public Object getReferencesPriv() {
        return referencesPriv;
    }

    public void setReferencesPriv(Object referencesPriv) {
        this.referencesPriv = referencesPriv;
    }

    @Basic
    @Column(name = "Index_priv", nullable = false)
    public Object getIndexPriv() {
        return indexPriv;
    }

    public void setIndexPriv(Object indexPriv) {
        this.indexPriv = indexPriv;
    }

    @Basic
    @Column(name = "Alter_priv", nullable = false)
    public Object getAlterPriv() {
        return alterPriv;
    }

    public void setAlterPriv(Object alterPriv) {
        this.alterPriv = alterPriv;
    }

    @Basic
    @Column(name = "Create_tmp_table_priv", nullable = false)
    public Object getCreateTmpTablePriv() {
        return createTmpTablePriv;
    }

    public void setCreateTmpTablePriv(Object createTmpTablePriv) {
        this.createTmpTablePriv = createTmpTablePriv;
    }

    @Basic
    @Column(name = "Lock_tables_priv", nullable = false)
    public Object getLockTablesPriv() {
        return lockTablesPriv;
    }

    public void setLockTablesPriv(Object lockTablesPriv) {
        this.lockTablesPriv = lockTablesPriv;
    }

    @Basic
    @Column(name = "Create_view_priv", nullable = false)
    public Object getCreateViewPriv() {
        return createViewPriv;
    }

    public void setCreateViewPriv(Object createViewPriv) {
        this.createViewPriv = createViewPriv;
    }

    @Basic
    @Column(name = "Show_view_priv", nullable = false)
    public Object getShowViewPriv() {
        return showViewPriv;
    }

    public void setShowViewPriv(Object showViewPriv) {
        this.showViewPriv = showViewPriv;
    }

    @Basic
    @Column(name = "Create_routine_priv", nullable = false)
    public Object getCreateRoutinePriv() {
        return createRoutinePriv;
    }

    public void setCreateRoutinePriv(Object createRoutinePriv) {
        this.createRoutinePriv = createRoutinePriv;
    }

    @Basic
    @Column(name = "Alter_routine_priv", nullable = false)
    public Object getAlterRoutinePriv() {
        return alterRoutinePriv;
    }

    public void setAlterRoutinePriv(Object alterRoutinePriv) {
        this.alterRoutinePriv = alterRoutinePriv;
    }

    @Basic
    @Column(name = "Execute_priv", nullable = false)
    public Object getExecutePriv() {
        return executePriv;
    }

    public void setExecutePriv(Object executePriv) {
        this.executePriv = executePriv;
    }

    @Basic
    @Column(name = "Event_priv", nullable = false)
    public Object getEventPriv() {
        return eventPriv;
    }

    public void setEventPriv(Object eventPriv) {
        this.eventPriv = eventPriv;
    }

    @Basic
    @Column(name = "Trigger_priv", nullable = false)
    public Object getTriggerPriv() {
        return triggerPriv;
    }

    public void setTriggerPriv(Object triggerPriv) {
        this.triggerPriv = triggerPriv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Db db1 = (Db) o;
        return Objects.equals(host, db1.host) &&
                Objects.equals(db, db1.db) &&
                Objects.equals(user, db1.user) &&
                Objects.equals(selectPriv, db1.selectPriv) &&
                Objects.equals(insertPriv, db1.insertPriv) &&
                Objects.equals(updatePriv, db1.updatePriv) &&
                Objects.equals(deletePriv, db1.deletePriv) &&
                Objects.equals(createPriv, db1.createPriv) &&
                Objects.equals(dropPriv, db1.dropPriv) &&
                Objects.equals(grantPriv, db1.grantPriv) &&
                Objects.equals(referencesPriv, db1.referencesPriv) &&
                Objects.equals(indexPriv, db1.indexPriv) &&
                Objects.equals(alterPriv, db1.alterPriv) &&
                Objects.equals(createTmpTablePriv, db1.createTmpTablePriv) &&
                Objects.equals(lockTablesPriv, db1.lockTablesPriv) &&
                Objects.equals(createViewPriv, db1.createViewPriv) &&
                Objects.equals(showViewPriv, db1.showViewPriv) &&
                Objects.equals(createRoutinePriv, db1.createRoutinePriv) &&
                Objects.equals(alterRoutinePriv, db1.alterRoutinePriv) &&
                Objects.equals(executePriv, db1.executePriv) &&
                Objects.equals(eventPriv, db1.eventPriv) &&
                Objects.equals(triggerPriv, db1.triggerPriv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, db, user, selectPriv, insertPriv, updatePriv, deletePriv, createPriv, dropPriv, grantPriv, referencesPriv, indexPriv, alterPriv, createTmpTablePriv, lockTablesPriv, createViewPriv, showViewPriv, createRoutinePriv, alterRoutinePriv, executePriv, eventPriv, triggerPriv);
    }
}
