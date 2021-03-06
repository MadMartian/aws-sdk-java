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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DoubleColumnStatisticsData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DoubleColumnStatisticsDataJsonUnmarshaller implements Unmarshaller<DoubleColumnStatisticsData, JsonUnmarshallerContext> {

    public DoubleColumnStatisticsData unmarshall(JsonUnmarshallerContext context) throws Exception {
        DoubleColumnStatisticsData doubleColumnStatisticsData = new DoubleColumnStatisticsData();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MinimumValue", targetDepth)) {
                    context.nextToken();
                    doubleColumnStatisticsData.setMinimumValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("MaximumValue", targetDepth)) {
                    context.nextToken();
                    doubleColumnStatisticsData.setMaximumValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfNulls", targetDepth)) {
                    context.nextToken();
                    doubleColumnStatisticsData.setNumberOfNulls(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfDistinctValues", targetDepth)) {
                    context.nextToken();
                    doubleColumnStatisticsData.setNumberOfDistinctValues(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return doubleColumnStatisticsData;
    }

    private static DoubleColumnStatisticsDataJsonUnmarshaller instance;

    public static DoubleColumnStatisticsDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DoubleColumnStatisticsDataJsonUnmarshaller();
        return instance;
    }
}
