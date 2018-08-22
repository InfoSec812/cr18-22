package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@IdClass(UserPK.class)
public class User {
    private String host;
    private String user;
    private Object selectPriv;
    private Object insertPriv;
    private Object updatePriv;
    private Object deletePriv;
    private Object createPriv;
    private Object dropPriv;
    private Object reloadPriv;
    private Object shutdownPriv;
    private Object processPriv;
    private Object filePriv;
    private Object grantPriv;
    private Object referencesPriv;
    private Object indexPriv;
    private Object alterPriv;
    private Object showDbPriv;
    private Object superPriv;
    private Object createTmpTablePriv;
    private Object lockTablesPriv;
    private Object executePriv;
    private Object replSlavePriv;
    private Object replClientPriv;
    private Object createViewPriv;
    private Object showViewPriv;
    private Object createRoutinePriv;
    private Object alterRoutinePriv;
    private Object createUserPriv;
    private Object eventPriv;
    private Object triggerPriv;
    private Object createTablespacePriv;
    private Object sslType;
    private byte[] sslCipher;
    private byte[] x509Issuer;
    private byte[] x509Subject;
    private int maxQuestions;
    private int maxUpdates;
    private int maxConnections;
    private int maxUserConnections;
    private String plugin;
    private String authenticationString;
    private Object passwordExpired;
    private Timestamp passwordLastChanged;
    private Short passwordLifetime;
    private Object accountLocked;
    private Object createRolePriv;
    private Object dropRolePriv;
    private Short passwordReuseHistory;
    private Short passwordReuseTime;

    @Id
    @Column(name = "Host", nullable = false, length = 60)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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
    @Column(name = "Reload_priv", nullable = false)
    public Object getReloadPriv() {
        return reloadPriv;
    }

    public void setReloadPriv(Object reloadPriv) {
        this.reloadPriv = reloadPriv;
    }

    @Basic
    @Column(name = "Shutdown_priv", nullable = false)
    public Object getShutdownPriv() {
        return shutdownPriv;
    }

    public void setShutdownPriv(Object shutdownPriv) {
        this.shutdownPriv = shutdownPriv;
    }

    @Basic
    @Column(name = "Process_priv", nullable = false)
    public Object getProcessPriv() {
        return processPriv;
    }

    public void setProcessPriv(Object processPriv) {
        this.processPriv = processPriv;
    }

    @Basic
    @Column(name = "File_priv", nullable = false)
    public Object getFilePriv() {
        return filePriv;
    }

    public void setFilePriv(Object filePriv) {
        this.filePriv = filePriv;
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
    @Column(name = "Show_db_priv", nullable = false)
    public Object getShowDbPriv() {
        return showDbPriv;
    }

    public void setShowDbPriv(Object showDbPriv) {
        this.showDbPriv = showDbPriv;
    }

    @Basic
    @Column(name = "Super_priv", nullable = false)
    public Object getSuperPriv() {
        return superPriv;
    }

    public void setSuperPriv(Object superPriv) {
        this.superPriv = superPriv;
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
    @Column(name = "Execute_priv", nullable = false)
    public Object getExecutePriv() {
        return executePriv;
    }

    public void setExecutePriv(Object executePriv) {
        this.executePriv = executePriv;
    }

    @Basic
    @Column(name = "Repl_slave_priv", nullable = false)
    public Object getReplSlavePriv() {
        return replSlavePriv;
    }

    public void setReplSlavePriv(Object replSlavePriv) {
        this.replSlavePriv = replSlavePriv;
    }

    @Basic
    @Column(name = "Repl_client_priv", nullable = false)
    public Object getReplClientPriv() {
        return replClientPriv;
    }

    public void setReplClientPriv(Object replClientPriv) {
        this.replClientPriv = replClientPriv;
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
    @Column(name = "Create_user_priv", nullable = false)
    public Object getCreateUserPriv() {
        return createUserPriv;
    }

    public void setCreateUserPriv(Object createUserPriv) {
        this.createUserPriv = createUserPriv;
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

    @Basic
    @Column(name = "Create_tablespace_priv", nullable = false)
    public Object getCreateTablespacePriv() {
        return createTablespacePriv;
    }

    public void setCreateTablespacePriv(Object createTablespacePriv) {
        this.createTablespacePriv = createTablespacePriv;
    }

    @Basic
    @Column(name = "ssl_type", nullable = false)
    public Object getSslType() {
        return sslType;
    }

    public void setSslType(Object sslType) {
        this.sslType = sslType;
    }

    @Basic
    @Column(name = "ssl_cipher", nullable = false)
    public byte[] getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(byte[] sslCipher) {
        this.sslCipher = sslCipher;
    }

    @Basic
    @Column(name = "x509_issuer", nullable = false)
    public byte[] getX509Issuer() {
        return x509Issuer;
    }

    public void setX509Issuer(byte[] x509Issuer) {
        this.x509Issuer = x509Issuer;
    }

    @Basic
    @Column(name = "x509_subject", nullable = false)
    public byte[] getX509Subject() {
        return x509Subject;
    }

    public void setX509Subject(byte[] x509Subject) {
        this.x509Subject = x509Subject;
    }

    @Basic
    @Column(name = "max_questions", nullable = false)
    public int getMaxQuestions() {
        return maxQuestions;
    }

    public void setMaxQuestions(int maxQuestions) {
        this.maxQuestions = maxQuestions;
    }

    @Basic
    @Column(name = "max_updates", nullable = false)
    public int getMaxUpdates() {
        return maxUpdates;
    }

    public void setMaxUpdates(int maxUpdates) {
        this.maxUpdates = maxUpdates;
    }

    @Basic
    @Column(name = "max_connections", nullable = false)
    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    @Basic
    @Column(name = "max_user_connections", nullable = false)
    public int getMaxUserConnections() {
        return maxUserConnections;
    }

    public void setMaxUserConnections(int maxUserConnections) {
        this.maxUserConnections = maxUserConnections;
    }

    @Basic
    @Column(name = "plugin", nullable = false, length = 64)
    public String getPlugin() {
        return plugin;
    }

    public void setPlugin(String plugin) {
        this.plugin = plugin;
    }

    @Basic
    @Column(name = "authentication_string", nullable = true, length = -1)
    public String getAuthenticationString() {
        return authenticationString;
    }

    public void setAuthenticationString(String authenticationString) {
        this.authenticationString = authenticationString;
    }

    @Basic
    @Column(name = "password_expired", nullable = false)
    public Object getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Object passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    @Basic
    @Column(name = "password_last_changed", nullable = true)
    public Timestamp getPasswordLastChanged() {
        return passwordLastChanged;
    }

    public void setPasswordLastChanged(Timestamp passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    @Basic
    @Column(name = "password_lifetime", nullable = true)
    public Short getPasswordLifetime() {
        return passwordLifetime;
    }

    public void setPasswordLifetime(Short passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
    }

    @Basic
    @Column(name = "account_locked", nullable = false)
    public Object getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(Object accountLocked) {
        this.accountLocked = accountLocked;
    }

    @Basic
    @Column(name = "Create_role_priv", nullable = false)
    public Object getCreateRolePriv() {
        return createRolePriv;
    }

    public void setCreateRolePriv(Object createRolePriv) {
        this.createRolePriv = createRolePriv;
    }

    @Basic
    @Column(name = "Drop_role_priv", nullable = false)
    public Object getDropRolePriv() {
        return dropRolePriv;
    }

    public void setDropRolePriv(Object dropRolePriv) {
        this.dropRolePriv = dropRolePriv;
    }

    @Basic
    @Column(name = "Password_reuse_history", nullable = true)
    public Short getPasswordReuseHistory() {
        return passwordReuseHistory;
    }

    public void setPasswordReuseHistory(Short passwordReuseHistory) {
        this.passwordReuseHistory = passwordReuseHistory;
    }

    @Basic
    @Column(name = "Password_reuse_time", nullable = true)
    public Short getPasswordReuseTime() {
        return passwordReuseTime;
    }

    public void setPasswordReuseTime(Short passwordReuseTime) {
        this.passwordReuseTime = passwordReuseTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return maxQuestions == user1.maxQuestions &&
                maxUpdates == user1.maxUpdates &&
                maxConnections == user1.maxConnections &&
                maxUserConnections == user1.maxUserConnections &&
                Objects.equals(host, user1.host) &&
                Objects.equals(user, user1.user) &&
                Objects.equals(selectPriv, user1.selectPriv) &&
                Objects.equals(insertPriv, user1.insertPriv) &&
                Objects.equals(updatePriv, user1.updatePriv) &&
                Objects.equals(deletePriv, user1.deletePriv) &&
                Objects.equals(createPriv, user1.createPriv) &&
                Objects.equals(dropPriv, user1.dropPriv) &&
                Objects.equals(reloadPriv, user1.reloadPriv) &&
                Objects.equals(shutdownPriv, user1.shutdownPriv) &&
                Objects.equals(processPriv, user1.processPriv) &&
                Objects.equals(filePriv, user1.filePriv) &&
                Objects.equals(grantPriv, user1.grantPriv) &&
                Objects.equals(referencesPriv, user1.referencesPriv) &&
                Objects.equals(indexPriv, user1.indexPriv) &&
                Objects.equals(alterPriv, user1.alterPriv) &&
                Objects.equals(showDbPriv, user1.showDbPriv) &&
                Objects.equals(superPriv, user1.superPriv) &&
                Objects.equals(createTmpTablePriv, user1.createTmpTablePriv) &&
                Objects.equals(lockTablesPriv, user1.lockTablesPriv) &&
                Objects.equals(executePriv, user1.executePriv) &&
                Objects.equals(replSlavePriv, user1.replSlavePriv) &&
                Objects.equals(replClientPriv, user1.replClientPriv) &&
                Objects.equals(createViewPriv, user1.createViewPriv) &&
                Objects.equals(showViewPriv, user1.showViewPriv) &&
                Objects.equals(createRoutinePriv, user1.createRoutinePriv) &&
                Objects.equals(alterRoutinePriv, user1.alterRoutinePriv) &&
                Objects.equals(createUserPriv, user1.createUserPriv) &&
                Objects.equals(eventPriv, user1.eventPriv) &&
                Objects.equals(triggerPriv, user1.triggerPriv) &&
                Objects.equals(createTablespacePriv, user1.createTablespacePriv) &&
                Objects.equals(sslType, user1.sslType) &&
                Arrays.equals(sslCipher, user1.sslCipher) &&
                Arrays.equals(x509Issuer, user1.x509Issuer) &&
                Arrays.equals(x509Subject, user1.x509Subject) &&
                Objects.equals(plugin, user1.plugin) &&
                Objects.equals(authenticationString, user1.authenticationString) &&
                Objects.equals(passwordExpired, user1.passwordExpired) &&
                Objects.equals(passwordLastChanged, user1.passwordLastChanged) &&
                Objects.equals(passwordLifetime, user1.passwordLifetime) &&
                Objects.equals(accountLocked, user1.accountLocked) &&
                Objects.equals(createRolePriv, user1.createRolePriv) &&
                Objects.equals(dropRolePriv, user1.dropRolePriv) &&
                Objects.equals(passwordReuseHistory, user1.passwordReuseHistory) &&
                Objects.equals(passwordReuseTime, user1.passwordReuseTime);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(host, user, selectPriv, insertPriv, updatePriv, deletePriv, createPriv, dropPriv, reloadPriv, shutdownPriv, processPriv, filePriv, grantPriv, referencesPriv, indexPriv, alterPriv, showDbPriv, superPriv, createTmpTablePriv, lockTablesPriv, executePriv, replSlavePriv, replClientPriv, createViewPriv, showViewPriv, createRoutinePriv, alterRoutinePriv, createUserPriv, eventPriv, triggerPriv, createTablespacePriv, sslType, maxQuestions, maxUpdates, maxConnections, maxUserConnections, plugin, authenticationString, passwordExpired, passwordLastChanged, passwordLifetime, accountLocked, createRolePriv, dropRolePriv, passwordReuseHistory, passwordReuseTime);
        result = 31 * result + Arrays.hashCode(sslCipher);
        result = 31 * result + Arrays.hashCode(x509Issuer);
        result = 31 * result + Arrays.hashCode(x509Subject);
        return result;
    }
}
