package gov.dhs.cr1822.rest.data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "slave_master_info", schema = "mysql", catalog = "")
public class SlaveMasterInfo {
    private int numberOfLines;
    private String masterLogName;
    private long masterLogPos;
    private String host;
    private String userName;
    private String userPassword;
    private int port;
    private int connectRetry;
    private byte enabledSsl;
    private String sslCa;
    private String sslCapath;
    private String sslCert;
    private String sslCipher;
    private String sslKey;
    private byte sslVerifyServerCert;
    private double heartbeat;
    private String bind;
    private String ignoredServerIds;
    private String uuid;
    private long retryCount;
    private String sslCrl;
    private String sslCrlpath;
    private byte enabledAutoPosition;
    private String channelName;
    private String tlsVersion;
    private String publicKeyPath;
    private byte getPublicKey;

    @Basic
    @Column(name = "Number_of_lines", nullable = false)
    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    @Basic
    @Column(name = "Master_log_name", nullable = false, length = -1)
    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    @Basic
    @Column(name = "Master_log_pos", nullable = false)
    public long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    @Basic
    @Column(name = "Host", nullable = true, length = 64)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Basic
    @Column(name = "User_name", nullable = true, length = -1)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "User_password", nullable = true, length = -1)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "Port", nullable = false)
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Basic
    @Column(name = "Connect_retry", nullable = false)
    public int getConnectRetry() {
        return connectRetry;
    }

    public void setConnectRetry(int connectRetry) {
        this.connectRetry = connectRetry;
    }

    @Basic
    @Column(name = "Enabled_ssl", nullable = false)
    public byte getEnabledSsl() {
        return enabledSsl;
    }

    public void setEnabledSsl(byte enabledSsl) {
        this.enabledSsl = enabledSsl;
    }

    @Basic
    @Column(name = "Ssl_ca", nullable = true, length = -1)
    public String getSslCa() {
        return sslCa;
    }

    public void setSslCa(String sslCa) {
        this.sslCa = sslCa;
    }

    @Basic
    @Column(name = "Ssl_capath", nullable = true, length = -1)
    public String getSslCapath() {
        return sslCapath;
    }

    public void setSslCapath(String sslCapath) {
        this.sslCapath = sslCapath;
    }

    @Basic
    @Column(name = "Ssl_cert", nullable = true, length = -1)
    public String getSslCert() {
        return sslCert;
    }

    public void setSslCert(String sslCert) {
        this.sslCert = sslCert;
    }

    @Basic
    @Column(name = "Ssl_cipher", nullable = true, length = -1)
    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    @Basic
    @Column(name = "Ssl_key", nullable = true, length = -1)
    public String getSslKey() {
        return sslKey;
    }

    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    @Basic
    @Column(name = "Ssl_verify_server_cert", nullable = false)
    public byte getSslVerifyServerCert() {
        return sslVerifyServerCert;
    }

    public void setSslVerifyServerCert(byte sslVerifyServerCert) {
        this.sslVerifyServerCert = sslVerifyServerCert;
    }

    @Basic
    @Column(name = "Heartbeat", nullable = false, precision = 0)
    public double getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(double heartbeat) {
        this.heartbeat = heartbeat;
    }

    @Basic
    @Column(name = "Bind", nullable = true, length = -1)
    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    @Basic
    @Column(name = "Ignored_server_ids", nullable = true, length = -1)
    public String getIgnoredServerIds() {
        return ignoredServerIds;
    }

    public void setIgnoredServerIds(String ignoredServerIds) {
        this.ignoredServerIds = ignoredServerIds;
    }

    @Basic
    @Column(name = "Uuid", nullable = true, length = -1)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "Retry_count", nullable = false)
    public long getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(long retryCount) {
        this.retryCount = retryCount;
    }

    @Basic
    @Column(name = "Ssl_crl", nullable = true, length = -1)
    public String getSslCrl() {
        return sslCrl;
    }

    public void setSslCrl(String sslCrl) {
        this.sslCrl = sslCrl;
    }

    @Basic
    @Column(name = "Ssl_crlpath", nullable = true, length = -1)
    public String getSslCrlpath() {
        return sslCrlpath;
    }

    public void setSslCrlpath(String sslCrlpath) {
        this.sslCrlpath = sslCrlpath;
    }

    @Basic
    @Column(name = "Enabled_auto_position", nullable = false)
    public byte getEnabledAutoPosition() {
        return enabledAutoPosition;
    }

    public void setEnabledAutoPosition(byte enabledAutoPosition) {
        this.enabledAutoPosition = enabledAutoPosition;
    }

    @Id
    @Column(name = "Channel_name", nullable = false, length = 64)
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Basic
    @Column(name = "Tls_version", nullable = true, length = -1)
    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    @Basic
    @Column(name = "Public_key_path", nullable = true, length = -1)
    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }

    @Basic
    @Column(name = "Get_public_key", nullable = false)
    public byte getGetPublicKey() {
        return getPublicKey;
    }

    public void setGetPublicKey(byte getPublicKey) {
        this.getPublicKey = getPublicKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlaveMasterInfo that = (SlaveMasterInfo) o;
        return numberOfLines == that.numberOfLines &&
                masterLogPos == that.masterLogPos &&
                port == that.port &&
                connectRetry == that.connectRetry &&
                enabledSsl == that.enabledSsl &&
                sslVerifyServerCert == that.sslVerifyServerCert &&
                Double.compare(that.heartbeat, heartbeat) == 0 &&
                retryCount == that.retryCount &&
                enabledAutoPosition == that.enabledAutoPosition &&
                getPublicKey == that.getPublicKey &&
                Objects.equals(masterLogName, that.masterLogName) &&
                Objects.equals(host, that.host) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userPassword, that.userPassword) &&
                Objects.equals(sslCa, that.sslCa) &&
                Objects.equals(sslCapath, that.sslCapath) &&
                Objects.equals(sslCert, that.sslCert) &&
                Objects.equals(sslCipher, that.sslCipher) &&
                Objects.equals(sslKey, that.sslKey) &&
                Objects.equals(bind, that.bind) &&
                Objects.equals(ignoredServerIds, that.ignoredServerIds) &&
                Objects.equals(uuid, that.uuid) &&
                Objects.equals(sslCrl, that.sslCrl) &&
                Objects.equals(sslCrlpath, that.sslCrlpath) &&
                Objects.equals(channelName, that.channelName) &&
                Objects.equals(tlsVersion, that.tlsVersion) &&
                Objects.equals(publicKeyPath, that.publicKeyPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLines, masterLogName, masterLogPos, host, userName, userPassword, port, connectRetry, enabledSsl, sslCa, sslCapath, sslCert, sslCipher, sslKey, sslVerifyServerCert, heartbeat, bind, ignoredServerIds, uuid, retryCount, sslCrl, sslCrlpath, enabledAutoPosition, channelName, tlsVersion, publicKeyPath, getPublicKey);
    }
}
