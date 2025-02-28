// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The updatable properties of the AssetEndpointProfile.
 */
@Fluent
public final class AssetEndpointProfileUpdateProperties {
    /*
     * The local valid URI specifying the network address/DNS name of a southbound device. The scheme part of the targetAddress URI specifies the type of the device. The additionalConfiguration field holds further connector type specific configuration.
     */
    @JsonProperty(value = "targetAddress")
    private String targetAddress;

    /*
     * Defines the client authentication mechanism to the server.
     */
    @JsonProperty(value = "userAuthentication")
    private UserAuthentication userAuthentication;

    /*
     * Defines the authentication mechanism for the southbound connector connecting to the shop floor/OT device.
     */
    @JsonProperty(value = "transportAuthentication")
    private TransportAuthentication transportAuthentication;

    /*
     * Contains connectivity type specific further configuration (e.g. OPC UA, Modbus, ONVIF).
     */
    @JsonProperty(value = "additionalConfiguration")
    private String additionalConfiguration;

    /**
     * Creates an instance of AssetEndpointProfileUpdateProperties class.
     */
    public AssetEndpointProfileUpdateProperties() {
    }

    /**
     * Get the targetAddress property: The local valid URI specifying the network address/DNS name of a southbound
     * device. The scheme part of the targetAddress URI specifies the type of the device. The additionalConfiguration
     * field holds further connector type specific configuration.
     * 
     * @return the targetAddress value.
     */
    public String targetAddress() {
        return this.targetAddress;
    }

    /**
     * Set the targetAddress property: The local valid URI specifying the network address/DNS name of a southbound
     * device. The scheme part of the targetAddress URI specifies the type of the device. The additionalConfiguration
     * field holds further connector type specific configuration.
     * 
     * @param targetAddress the targetAddress value to set.
     * @return the AssetEndpointProfileUpdateProperties object itself.
     */
    public AssetEndpointProfileUpdateProperties withTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
        return this;
    }

    /**
     * Get the userAuthentication property: Defines the client authentication mechanism to the server.
     * 
     * @return the userAuthentication value.
     */
    public UserAuthentication userAuthentication() {
        return this.userAuthentication;
    }

    /**
     * Set the userAuthentication property: Defines the client authentication mechanism to the server.
     * 
     * @param userAuthentication the userAuthentication value to set.
     * @return the AssetEndpointProfileUpdateProperties object itself.
     */
    public AssetEndpointProfileUpdateProperties withUserAuthentication(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
        return this;
    }

    /**
     * Get the transportAuthentication property: Defines the authentication mechanism for the southbound connector
     * connecting to the shop floor/OT device.
     * 
     * @return the transportAuthentication value.
     */
    public TransportAuthentication transportAuthentication() {
        return this.transportAuthentication;
    }

    /**
     * Set the transportAuthentication property: Defines the authentication mechanism for the southbound connector
     * connecting to the shop floor/OT device.
     * 
     * @param transportAuthentication the transportAuthentication value to set.
     * @return the AssetEndpointProfileUpdateProperties object itself.
     */
    public AssetEndpointProfileUpdateProperties
        withTransportAuthentication(TransportAuthentication transportAuthentication) {
        this.transportAuthentication = transportAuthentication;
        return this;
    }

    /**
     * Get the additionalConfiguration property: Contains connectivity type specific further configuration (e.g. OPC UA,
     * Modbus, ONVIF).
     * 
     * @return the additionalConfiguration value.
     */
    public String additionalConfiguration() {
        return this.additionalConfiguration;
    }

    /**
     * Set the additionalConfiguration property: Contains connectivity type specific further configuration (e.g. OPC UA,
     * Modbus, ONVIF).
     * 
     * @param additionalConfiguration the additionalConfiguration value to set.
     * @return the AssetEndpointProfileUpdateProperties object itself.
     */
    public AssetEndpointProfileUpdateProperties withAdditionalConfiguration(String additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAuthentication() != null) {
            userAuthentication().validate();
        }
        if (transportAuthentication() != null) {
            transportAuthentication().validate();
        }
    }
}
