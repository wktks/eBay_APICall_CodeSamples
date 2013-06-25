//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				New container for site-specific buyer requirements.
 * 			
 * 
 * <p>Java class for SiteBuyerRequirementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteBuyerRequirementDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkedPayPalAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumBuyerPolicyViolations" type="{urn:ebay:apis:eBLBaseComponents}MaximumBuyerPolicyViolationsDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumItemRequirements" type="{urn:ebay:apis:eBLBaseComponents}MaximumItemRequirementsDetailsType" minOccurs="0"/>
 *         &lt;element name="MaximumUnpaidItemStrikesInfo" type="{urn:ebay:apis:eBLBaseComponents}MaximumUnpaidItemStrikesInfoDetailsType" minOccurs="0"/>
 *         &lt;element name="MinimumFeedbackScore" type="{urn:ebay:apis:eBLBaseComponents}MinimumFeedbackScoreDetailsType" minOccurs="0"/>
 *         &lt;element name="ShipToRegistrationCountry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VerifiedUserRequirements" type="{urn:ebay:apis:eBLBaseComponents}VerifiedUserRequirementsDetailsType" minOccurs="0"/>
 *         &lt;element name="DetailVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteBuyerRequirementDetailsType", propOrder = {
    "linkedPayPalAccount",
    "maximumBuyerPolicyViolations",
    "maximumItemRequirements",
    "maximumUnpaidItemStrikesInfo",
    "minimumFeedbackScore",
    "shipToRegistrationCountry",
    "verifiedUserRequirements",
    "detailVersion",
    "updateTime"
})
public class SiteBuyerRequirementDetailsType {

    @XmlElement(name = "LinkedPayPalAccount")
    protected Boolean linkedPayPalAccount;
    @XmlElement(name = "MaximumBuyerPolicyViolations")
    protected MaximumBuyerPolicyViolationsDetailsType maximumBuyerPolicyViolations;
    @XmlElement(name = "MaximumItemRequirements")
    protected MaximumItemRequirementsDetailsType maximumItemRequirements;
    @XmlElement(name = "MaximumUnpaidItemStrikesInfo")
    protected MaximumUnpaidItemStrikesInfoDetailsType maximumUnpaidItemStrikesInfo;
    @XmlElement(name = "MinimumFeedbackScore")
    protected MinimumFeedbackScoreDetailsType minimumFeedbackScore;
    @XmlElement(name = "ShipToRegistrationCountry")
    protected Boolean shipToRegistrationCountry;
    @XmlElement(name = "VerifiedUserRequirements")
    protected VerifiedUserRequirementsDetailsType verifiedUserRequirements;
    @XmlElement(name = "DetailVersion")
    protected String detailVersion;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;

    /**
     * Gets the value of the linkedPayPalAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkedPayPalAccount() {
        return linkedPayPalAccount;
    }

    /**
     * Sets the value of the linkedPayPalAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkedPayPalAccount(Boolean value) {
        this.linkedPayPalAccount = value;
    }

    /**
     * Gets the value of the maximumBuyerPolicyViolations property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumBuyerPolicyViolationsDetailsType }
     *     
     */
    public MaximumBuyerPolicyViolationsDetailsType getMaximumBuyerPolicyViolations() {
        return maximumBuyerPolicyViolations;
    }

    /**
     * Sets the value of the maximumBuyerPolicyViolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumBuyerPolicyViolationsDetailsType }
     *     
     */
    public void setMaximumBuyerPolicyViolations(MaximumBuyerPolicyViolationsDetailsType value) {
        this.maximumBuyerPolicyViolations = value;
    }

    /**
     * Gets the value of the maximumItemRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumItemRequirementsDetailsType }
     *     
     */
    public MaximumItemRequirementsDetailsType getMaximumItemRequirements() {
        return maximumItemRequirements;
    }

    /**
     * Sets the value of the maximumItemRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumItemRequirementsDetailsType }
     *     
     */
    public void setMaximumItemRequirements(MaximumItemRequirementsDetailsType value) {
        this.maximumItemRequirements = value;
    }

    /**
     * Gets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumUnpaidItemStrikesInfoDetailsType }
     *     
     */
    public MaximumUnpaidItemStrikesInfoDetailsType getMaximumUnpaidItemStrikesInfo() {
        return maximumUnpaidItemStrikesInfo;
    }

    /**
     * Sets the value of the maximumUnpaidItemStrikesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumUnpaidItemStrikesInfoDetailsType }
     *     
     */
    public void setMaximumUnpaidItemStrikesInfo(MaximumUnpaidItemStrikesInfoDetailsType value) {
        this.maximumUnpaidItemStrikesInfo = value;
    }

    /**
     * Gets the value of the minimumFeedbackScore property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumFeedbackScoreDetailsType }
     *     
     */
    public MinimumFeedbackScoreDetailsType getMinimumFeedbackScore() {
        return minimumFeedbackScore;
    }

    /**
     * Sets the value of the minimumFeedbackScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumFeedbackScoreDetailsType }
     *     
     */
    public void setMinimumFeedbackScore(MinimumFeedbackScoreDetailsType value) {
        this.minimumFeedbackScore = value;
    }

    /**
     * Gets the value of the shipToRegistrationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipToRegistrationCountry() {
        return shipToRegistrationCountry;
    }

    /**
     * Sets the value of the shipToRegistrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipToRegistrationCountry(Boolean value) {
        this.shipToRegistrationCountry = value;
    }

    /**
     * Gets the value of the verifiedUserRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedUserRequirementsDetailsType }
     *     
     */
    public VerifiedUserRequirementsDetailsType getVerifiedUserRequirements() {
        return verifiedUserRequirements;
    }

    /**
     * Sets the value of the verifiedUserRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedUserRequirementsDetailsType }
     *     
     */
    public void setVerifiedUserRequirements(VerifiedUserRequirementsDetailsType value) {
        this.verifiedUserRequirements = value;
    }

    /**
     * Gets the value of the detailVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailVersion() {
        return detailVersion;
    }

    /**
     * Sets the value of the detailVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailVersion(String value) {
        this.detailVersion = value;
    }

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

}