
package hibernate27.embeddad;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adres {
    
    //@Column(name="BARKOD")
    private String state;
   // @Column(name="SEHIR")
    private String city;
   // @Column(name="CODES")
    private String pincode;

    public Adres(){}
    public Adres(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    
    
    
    
    
}
