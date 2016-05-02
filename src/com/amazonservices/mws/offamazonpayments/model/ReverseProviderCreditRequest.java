/*******************************************************************************
 *  Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonservices.mws.offamazonpayments.model;

import com.amazonservices.mws.offamazonpayments.OffAmazonPaymentsServiceException;
import com.amazonservices.mws.offamazonpayments.common.JSONFragmentBuilder;
import com.amazonservices.mws.offamazonpayments.common.ReflectionFragmentBuilder;
import com.amazonservices.mws.offamazonpayments.common.ModelConstants;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellerId" type="{http://mws.amazonservices.com/schema/OffAmazonPayments/2013-01-01}NonEmptyString"/>
 *         &lt;element name="MWSAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmazonProviderCreditId" type="{http://mws.amazonservices.com/schema/OffAmazonPayments/2013-01-01}String32"/>
 *         &lt;element name="CreditReversalReferenceId" type="{http://mws.amazonservices.com/schema/OffAmazonPayments/2013-01-01}String32"/>
 *         &lt;element name="CreditReversalAmount" type="{http://mws.amazonservices.com/schema/OffAmazonPayments/2013-01-01}Price"/>
 *         &lt;element name="CreditReversalNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sellerId",
    "MWSAuthToken",
    "amazonProviderCreditId",
    "creditReversalReferenceId",
    "creditReversalAmount",
    "creditReversalNote"
})
@XmlRootElement(name = "ReverseProviderCreditRequest")
public class ReverseProviderCreditRequest {

    @XmlElement(name = "SellerId", required = true)
    protected String sellerId;
    @XmlElement(name="MWSAuthToken")
    protected String MWSAuthToken;
    @XmlElement(name = "AmazonProviderCreditId", required = true)
    protected String amazonProviderCreditId;
    @XmlElement(name = "CreditReversalReferenceId", required = true)
    protected String creditReversalReferenceId;
    @XmlElement(name = "CreditReversalAmount", required = true)
    protected Price creditReversalAmount;
    @XmlElement(name = "CreditReversalNote")
    protected String creditReversalNote;

    /**
     * Default constructor
     * 
     */
    public ReverseProviderCreditRequest() {
        super();
    }

    /**
     * Value constructor without MWSAuthToken param, for non-delegated requests
     *
     */
    public ReverseProviderCreditRequest(final String sellerId, final String amazonProviderCreditId, final String creditReversalReferenceId, final Price creditReversalAmount, final String creditReversalNote) {
        this(sellerId, amazonProviderCreditId, creditReversalReferenceId, creditReversalAmount, creditReversalNote, ModelConstants.EMPTY_MWS_AUTH_TOKEN);
    }

    /**
     * Value constructor
     *
     */
    public ReverseProviderCreditRequest(final String sellerId, final String amazonProviderCreditId, final String creditReversalReferenceId, final Price creditReversalAmount, final String creditReversalNote, final String MWSAuthToken) {
        this.sellerId = sellerId;
        this.MWSAuthToken = MWSAuthToken;
        this.amazonProviderCreditId = amazonProviderCreditId;
        this.creditReversalReferenceId = creditReversalReferenceId;
        this.creditReversalAmount = creditReversalAmount;
        this.creditReversalNote = creditReversalNote;
    }

    /**
     * Gets the value of the sellerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerId() {
        return sellerId;
    }

    /**
     * Sets the value of the sellerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerId(String value) {
        this.sellerId = value;
    }

    public boolean isSetSellerId() {
        return (this.sellerId!= null);
    }

    /**
     * Get the value of MWSAuthToken.
     *
     * @return The value of MWSAuthToken.
     */
    public String getMWSAuthToken() {
        return MWSAuthToken;
    }

    /**
     * Set the value of MWSAuthToken.
     *
     * @param MWSAuthToken
     *            The new value to set.
     */
    public void setMWSAuthToken(String MWSAuthToken) {
        this.MWSAuthToken = MWSAuthToken;
    }

    /**
     * Check to see if MWSAuthToken is set.
     *
     * @return true if MWSAuthToken is set.
     */
    public boolean isSetMWSAuthToken() {
        return MWSAuthToken != null;
    }

    /**
     * Gets the value of the amazonProviderCreditId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmazonProviderCreditId() {
        return amazonProviderCreditId;
    }

    /**
     * Sets the value of the amazonProviderCreditId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmazonProviderCreditId(String value) {
        this.amazonProviderCreditId = value;
    }

    public boolean isSetAmazonProviderCreditId() {
        return (this.amazonProviderCreditId!= null);
    }

    /**
     * Gets the value of the creditReversalReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReversalReferenceId() {
        return creditReversalReferenceId;
    }

    /**
     * Sets the value of the creditReversalReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReversalReferenceId(String value) {
        this.creditReversalReferenceId = value;
    }

    public boolean isSetCreditReversalReferenceId() {
        return (this.creditReversalReferenceId!= null);
    }

    /**
     * Gets the value of the creditReversalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getCreditReversalAmount() {
        return creditReversalAmount;
    }

    /**
     * Sets the value of the creditReversalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setCreditReversalAmount(Price value) {
        this.creditReversalAmount = value;
    }

    public boolean isSetCreditReversalAmount() {
        return (this.creditReversalAmount!= null);
    }

    /**
     * Gets the value of the creditReversalNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditReversalNote() {
        return creditReversalNote;
    }

    /**
     * Sets the value of the creditReversalNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditReversalNote(String value) {
        this.creditReversalNote = value;
    }

    public boolean isSetCreditReversalNote() {
        return (this.creditReversalNote!= null);
    }

    /**
     * Sets the value of the SellerId property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public ReverseProviderCreditRequest withSellerId(String value) {
        setSellerId(value);
        return this;
    }

    /**
     * Sets the value of the AmazonProviderCreditId property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public ReverseProviderCreditRequest withAmazonProviderCreditId(String value) {
        setAmazonProviderCreditId(value);
        return this;
    }

    /**
     * Sets the value of the CreditReversalReferenceId property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public ReverseProviderCreditRequest withCreditReversalReferenceId(String value) {
        setCreditReversalReferenceId(value);
        return this;
    }

    /**
     * Sets the value of the CreditReversalAmount property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public ReverseProviderCreditRequest withCreditReversalAmount(Price value) {
        setCreditReversalAmount(value);
        return this;
    }

    /**
     * Sets the value of the CreditReversalNote property.
     * 
     * @param value
     * @return
     *     this instance
     */
    public ReverseProviderCreditRequest withCreditReversalNote(String value) {
        setCreditReversalNote(value);
        return this;
    }

    /**
     *
     * JSON fragment representation of this object
     *
     * @return JSON fragment for this object. Name for outer
     * object expected to be set by calling method. This fragment
     * returns inner properties representation only
     *
     */
    @Deprecated
    public String toJSONFragment() throws OffAmazonPaymentsServiceException {
        return new ReflectionFragmentBuilder(this, new JSONFragmentBuilder()).build();
    }
}