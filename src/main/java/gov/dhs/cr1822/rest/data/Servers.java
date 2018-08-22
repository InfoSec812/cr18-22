package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Servers {
    private String serverName;
    private String host;
    private String db;
    private String username;
    private String password;
    private int port;
    private String socket;
    private String wrapper;
    private String owner;

    @Id
    @Column(name = "Server_name", nullable = false, length = 64)
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Basic
    @Column(name = "Host", nullable = false, length = 64)
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Basic
    @Column(name = "Db", nullable = false, length = 64)
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    @Basic
    @Column(name = "Username", nullable = false, length = 64)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Password", nullable = false, length = 64)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "Socket", nullable = false, length = 64)
    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    @Basic
    @Column(name = "Wrapper", nullable = false, length = 64)
    public String getWrapper() {
        return wrapper;
    }

    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    @Basic
    @Column(name = "Owner", nullable = false, length = 64)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servers servers = (Servers) o;
        return port == servers.port &&
                Objects.equals(serverName, servers.serverName) &&
                Objects.equals(host, servers.host) &&
                Objects.equals(db, servers.db) &&
                Objects.equals(username, servers.username) &&
                Objects.equals(password, servers.password) &&
                Objects.equals(socket, servers.socket) &&
                Objects.equals(wrapper, servers.wrapper) &&
                Objects.equals(owner, servers.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverName, host, db, username, password, port, socket, wrapper, owner);
    }
}
