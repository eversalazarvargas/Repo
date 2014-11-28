
package acc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="second_last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birth_day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birth_month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birth_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "firstName",
    "lastName",
    "secondLastName",
    "birthDay",
    "birthMonth",
    "birthYear"
})
public class Person {

    @XmlElement(name = "first_name", required = true)
    protected String firstName;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(name = "second_last_name", required = true)
    protected String secondLastName;
    @XmlElement(name = "birth_day")
    protected int birthDay;
    @XmlElement(name = "birth_month")
    protected int birthMonth;
    @XmlElement(name = "birth_year")
    protected int birthYear;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the secondLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLastName() {
        return secondLastName;
    }

    /**
     * Sets the value of the secondLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLastName(String value) {
        this.secondLastName = value;
    }

    /**
     * Gets the value of the birthDay property.
     * 
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * Sets the value of the birthDay property.
     * 
     */
    public void setBirthDay(int value) {
        this.birthDay = value;
    }

    /**
     * Gets the value of the birthMonth property.
     * 
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * Sets the value of the birthMonth property.
     * 
     */
    public void setBirthMonth(int value) {
        this.birthMonth = value;
    }

    /**
     * Gets the value of the birthYear property.
     * 
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the value of the birthYear property.
     * 
     */
    public void setBirthYear(int value) {
        this.birthYear = value;
    }

}
