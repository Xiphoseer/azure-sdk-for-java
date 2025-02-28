// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The liveness classification for target face.
 */
@Immutable
public final class LivenessOutputsTarget {

    /*
     * The face region where the liveness classification was made on.
     */
    @Generated
    @JsonProperty(value = "faceRectangle")
    private final FaceRectangle faceRectangle;

    /*
     * The file name which contains the face rectangle where the liveness classification was made on.
     */
    @Generated
    @JsonProperty(value = "fileName")
    private final String fileName;

    /*
     * The time offset within the file of the frame which contains the face rectangle where the liveness classification was made on.
     */
    @Generated
    @JsonProperty(value = "timeOffsetWithinFile")
    private final int timeOffsetWithinFile;

    /*
     * The image type which contains the face rectangle where the liveness classification was made on.
     */
    @Generated
    @JsonProperty(value = "imageType")
    private final FaceImageType imageType;

    /**
     * Creates an instance of LivenessOutputsTarget class.
     *
     * @param faceRectangle the faceRectangle value to set.
     * @param fileName the fileName value to set.
     * @param timeOffsetWithinFile the timeOffsetWithinFile value to set.
     * @param imageType the imageType value to set.
     */
    @Generated
    @JsonCreator
    private LivenessOutputsTarget(@JsonProperty(value = "faceRectangle") FaceRectangle faceRectangle,
        @JsonProperty(value = "fileName") String fileName,
        @JsonProperty(value = "timeOffsetWithinFile") int timeOffsetWithinFile,
        @JsonProperty(value = "imageType") FaceImageType imageType) {
        this.faceRectangle = faceRectangle;
        this.fileName = fileName;
        this.timeOffsetWithinFile = timeOffsetWithinFile;
        this.imageType = imageType;
    }

    /**
     * Get the faceRectangle property: The face region where the liveness classification was made on.
     *
     * @return the faceRectangle value.
     */
    @Generated
    public FaceRectangle getFaceRectangle() {
        return this.faceRectangle;
    }

    /**
     * Get the fileName property: The file name which contains the face rectangle where the liveness classification was
     * made on.
     *
     * @return the fileName value.
     */
    @Generated
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Get the timeOffsetWithinFile property: The time offset within the file of the frame which contains the face
     * rectangle where the liveness classification was made on.
     *
     * @return the timeOffsetWithinFile value.
     */
    @Generated
    public int getTimeOffsetWithinFile() {
        return this.timeOffsetWithinFile;
    }

    /**
     * Get the imageType property: The image type which contains the face rectangle where the liveness classification
     * was made on.
     *
     * @return the imageType value.
     */
    @Generated
    public FaceImageType getImageType() {
        return this.imageType;
    }
}
