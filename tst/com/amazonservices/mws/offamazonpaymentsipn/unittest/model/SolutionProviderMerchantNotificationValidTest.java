/*******************************************************************************
 *  Copyright 2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at:
 *  http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the
 *  specific language governing permissions and limitations under the
 *  License.
 * *****************************************************************************
 */
package com.amazonservices.mws.offamazonpaymentsipn.unittest.model;

import org.junit.Test;

import com.amazonservices.mws.offamazonpaymentsipn.unittest.model.IpnModelTest;
import com.amazonservices.mws.offamazonpaymentsipn.model.SolutionProviderMerchantNotification;

import static junit.framework.Assert.assertNotNull;

public class SolutionProviderMerchantNotificationValidTest extends IpnModelTest<SolutionProviderMerchantNotification> {

    @Override
    protected String getXMLTestFile() {
        return "SolutionProviderMerchantNotificationValid.xml";
    }

    @Override
    protected Class<SolutionProviderMerchantNotification> getTestClassType() {
        return SolutionProviderMerchantNotification.class;
    }

    @Test
    public void testObjectToXML() throws Exception {
        testForNull();
    }

    @Test
    public void testXMLToObject() throws Exception {
        testSchema();
    }

    @Test
    public void toXMLShouldNotReturnNullForObjectWithAllFieldsPopulated() throws Exception {
        String xmlFragment = getTestClassObject().toXMLFragment();

        assertNotNull(xmlFragment);
    }

    @Test
    public void toJSONShouldNotReturnNullForObjectWithAllFieldsPopulated() throws Exception {
        String jsonFragment = getTestClassObject().toJSONFragment();

        assertNotNull(jsonFragment);
    }
}