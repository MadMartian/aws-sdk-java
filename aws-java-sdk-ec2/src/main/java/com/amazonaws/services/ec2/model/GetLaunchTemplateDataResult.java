/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLaunchTemplateDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The instance data.
     * </p>
     */
    private ResponseLaunchTemplateData launchTemplateData;

    /**
     * <p>
     * The instance data.
     * </p>
     * 
     * @param launchTemplateData
     *        The instance data.
     */

    public void setLaunchTemplateData(ResponseLaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    /**
     * <p>
     * The instance data.
     * </p>
     * 
     * @return The instance data.
     */

    public ResponseLaunchTemplateData getLaunchTemplateData() {
        return this.launchTemplateData;
    }

    /**
     * <p>
     * The instance data.
     * </p>
     * 
     * @param launchTemplateData
     *        The instance data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLaunchTemplateDataResult withLaunchTemplateData(ResponseLaunchTemplateData launchTemplateData) {
        setLaunchTemplateData(launchTemplateData);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLaunchTemplateData() != null)
            sb.append("LaunchTemplateData: ").append(getLaunchTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLaunchTemplateDataResult == false)
            return false;
        GetLaunchTemplateDataResult other = (GetLaunchTemplateDataResult) obj;
        if (other.getLaunchTemplateData() == null ^ this.getLaunchTemplateData() == null)
            return false;
        if (other.getLaunchTemplateData() != null && other.getLaunchTemplateData().equals(this.getLaunchTemplateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateData() == null) ? 0 : getLaunchTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public GetLaunchTemplateDataResult clone() {
        try {
            return (GetLaunchTemplateDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
