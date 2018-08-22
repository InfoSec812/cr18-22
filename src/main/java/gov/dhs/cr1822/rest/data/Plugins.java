package gov.dhs.cr1822.rest.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Plugins {
    private String pluginName;
    private String pluginVersion;
    private String pluginStatus;
    private String pluginType;
    private String pluginTypeVersion;
    private String pluginLibrary;
    private String pluginLibraryVersion;
    private String pluginAuthor;
    private String pluginDescription;
    private String pluginLicense;
    private String loadOption;

    @Basic
    @Column(name = "PLUGIN_NAME", nullable = false, length = 64)
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    @Basic
    @Column(name = "PLUGIN_VERSION", nullable = false, length = 20)
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    @Basic
    @Column(name = "PLUGIN_STATUS", nullable = false, length = 10)
    public String getPluginStatus() {
        return pluginStatus;
    }

    public void setPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    @Basic
    @Column(name = "PLUGIN_TYPE", nullable = false, length = 80)
    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    @Basic
    @Column(name = "PLUGIN_TYPE_VERSION", nullable = false, length = 20)
    public String getPluginTypeVersion() {
        return pluginTypeVersion;
    }

    public void setPluginTypeVersion(String pluginTypeVersion) {
        this.pluginTypeVersion = pluginTypeVersion;
    }

    @Basic
    @Column(name = "PLUGIN_LIBRARY", nullable = true, length = 64)
    public String getPluginLibrary() {
        return pluginLibrary;
    }

    public void setPluginLibrary(String pluginLibrary) {
        this.pluginLibrary = pluginLibrary;
    }

    @Basic
    @Column(name = "PLUGIN_LIBRARY_VERSION", nullable = true, length = 20)
    public String getPluginLibraryVersion() {
        return pluginLibraryVersion;
    }

    public void setPluginLibraryVersion(String pluginLibraryVersion) {
        this.pluginLibraryVersion = pluginLibraryVersion;
    }

    @Basic
    @Column(name = "PLUGIN_AUTHOR", nullable = true, length = 64)
    public String getPluginAuthor() {
        return pluginAuthor;
    }

    public void setPluginAuthor(String pluginAuthor) {
        this.pluginAuthor = pluginAuthor;
    }

    @Basic
    @Column(name = "PLUGIN_DESCRIPTION", nullable = true, length = 65535)
    public String getPluginDescription() {
        return pluginDescription;
    }

    public void setPluginDescription(String pluginDescription) {
        this.pluginDescription = pluginDescription;
    }

    @Basic
    @Column(name = "PLUGIN_LICENSE", nullable = true, length = 80)
    public String getPluginLicense() {
        return pluginLicense;
    }

    public void setPluginLicense(String pluginLicense) {
        this.pluginLicense = pluginLicense;
    }

    @Basic
    @Column(name = "LOAD_OPTION", nullable = false, length = 64)
    public String getLoadOption() {
        return loadOption;
    }

    public void setLoadOption(String loadOption) {
        this.loadOption = loadOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plugins plugins = (Plugins) o;
        return Objects.equals(pluginName, plugins.pluginName) &&
                Objects.equals(pluginVersion, plugins.pluginVersion) &&
                Objects.equals(pluginStatus, plugins.pluginStatus) &&
                Objects.equals(pluginType, plugins.pluginType) &&
                Objects.equals(pluginTypeVersion, plugins.pluginTypeVersion) &&
                Objects.equals(pluginLibrary, plugins.pluginLibrary) &&
                Objects.equals(pluginLibraryVersion, plugins.pluginLibraryVersion) &&
                Objects.equals(pluginAuthor, plugins.pluginAuthor) &&
                Objects.equals(pluginDescription, plugins.pluginDescription) &&
                Objects.equals(pluginLicense, plugins.pluginLicense) &&
                Objects.equals(loadOption, plugins.loadOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName, pluginVersion, pluginStatus, pluginType, pluginTypeVersion, pluginLibrary, pluginLibraryVersion, pluginAuthor, pluginDescription, pluginLicense, loadOption);
    }
}
