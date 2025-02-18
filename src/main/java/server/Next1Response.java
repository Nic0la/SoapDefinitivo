
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per next1Response complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="next1Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "next1Response",namespace = "http://next1resp.rand/" ,propOrder = {
    "_return"
})
public class Next1Response {

    @XmlElement(name = "return")
    protected int _return;

    /**
     * Recupera il valore della propriet� return.
     * 
     */
    public int getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della propriet� return.
     * 
     */
    public void setReturn(int value) {
        this._return = value;
    }

}
