@XmlSchema(
        namespace = XmlConstants.NS,
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix= XmlConstants.NS_A_PREFIX, namespaceURI=XmlConstants.NS_A)
        }
)
package net.schoen.trantor.entities;

import net.schoen.trantor.config.XmlConstants;

import javax.xml.XMLConstants;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
