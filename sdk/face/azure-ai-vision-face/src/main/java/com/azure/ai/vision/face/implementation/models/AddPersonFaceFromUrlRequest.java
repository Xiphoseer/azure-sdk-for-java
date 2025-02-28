// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AddPersonFaceFromUrlRequest model.
 */
@Immutable
public final class AddPersonFaceFromUrlRequest {

    /*
     * URL of input image.
     */
    @Generated
    @JsonProperty(value = "url")
    private final String url;

    /**
     * Creates an instance of AddPersonFaceFromUrlRequest class.
     *
     * @param url the url value to set.
     */
    @Generated
    @JsonCreator
    public AddPersonFaceFromUrlRequest(@JsonProperty(value = "url") String url) {
        this.url = url;
    }

    /**
     * Get the url property: URL of input image.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }
}
