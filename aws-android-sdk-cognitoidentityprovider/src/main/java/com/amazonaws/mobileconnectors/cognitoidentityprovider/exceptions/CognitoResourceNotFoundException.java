/*
 * Copyright 2013-2016 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions;

public class CognitoResourceNotFoundException extends CognitoIdentityProviderException {
    private static final long serialVersionUID = -7875174258893803243L;

    public CognitoResourceNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public CognitoResourceNotFoundException(String message) {
        super(message);
    }
}