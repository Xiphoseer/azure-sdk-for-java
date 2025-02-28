// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MySQL linked service properties.
 */
@Fluent
public final class MySqlLinkedServiceTypeProperties {
    /*
     * The version of the MySQL driver. Type: string. V1 or empty for legacy driver, V2 for new driver. V1 can support connection string and property bag, V2 can only support connection string.
     */
    @JsonProperty(value = "driverVersion")
    private Object driverVersion;

    /*
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "connectionString")
    private Object connectionString;

    /*
     * Server name for connection. Type: string.
     */
    @JsonProperty(value = "server")
    private Object server;

    /*
     * The port for the connection. Type: integer.
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * Username for authentication. Type: string.
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * Database name for connection. Type: string.
     */
    @JsonProperty(value = "database")
    private Object database;

    /*
     * SSL mode for connection. Type: integer. 0: disable, 1: prefer, 2: require, 3: verify-ca, 4: verify-full.
     */
    @JsonProperty(value = "sslMode")
    private Object sslMode;

    /*
     * Use system trust store for connection. Type: integer. 0: enable, 1: disable.
     */
    @JsonProperty(value = "useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @JsonProperty(value = "password")
    private AzureKeyVaultSecretReference password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of MySqlLinkedServiceTypeProperties class.
     */
    public MySqlLinkedServiceTypeProperties() {
    }

    /**
     * Get the driverVersion property: The version of the MySQL driver. Type: string. V1 or empty for legacy driver, V2
     * for new driver. V1 can support connection string and property bag, V2 can only support connection string.
     * 
     * @return the driverVersion value.
     */
    public Object driverVersion() {
        return this.driverVersion;
    }

    /**
     * Set the driverVersion property: The version of the MySQL driver. Type: string. V1 or empty for legacy driver, V2
     * for new driver. V1 can support connection string and property bag, V2 can only support connection string.
     * 
     * @param driverVersion the driverVersion value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withDriverVersion(Object driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the server property: Server name for connection. Type: string.
     * 
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Server name for connection. Type: string.
     * 
     * @param server the server value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the port property: The port for the connection. Type: integer.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The port for the connection. Type: integer.
     * 
     * @param port the port value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string.
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string.
     * 
     * @param username the username value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the database property: Database name for connection. Type: string.
     * 
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: Database name for connection. Type: string.
     * 
     * @param database the database value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the sslMode property: SSL mode for connection. Type: integer. 0: disable, 1: prefer, 2: require, 3:
     * verify-ca, 4: verify-full.
     * 
     * @return the sslMode value.
     */
    public Object sslMode() {
        return this.sslMode;
    }

    /**
     * Set the sslMode property: SSL mode for connection. Type: integer. 0: disable, 1: prefer, 2: require, 3:
     * verify-ca, 4: verify-full.
     * 
     * @param sslMode the sslMode value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withSslMode(Object sslMode) {
        this.sslMode = sslMode;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Use system trust store for connection. Type: integer. 0: enable, 1:
     * disable.
     * 
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Use system trust store for connection. Type: integer. 0: enable, 1:
     * disable.
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the password value.
     */
    public AzureKeyVaultSecretReference password() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @param password the password value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withPassword(AzureKeyVaultSecretReference password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the MySqlLinkedServiceTypeProperties object itself.
     */
    public MySqlLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
    }
}
