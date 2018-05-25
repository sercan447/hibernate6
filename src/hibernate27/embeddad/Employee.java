
package hibernate27.embeddad;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Personel_Verileri")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Numaralandri")
    private int id;
    @Column(name="Isimler" , nullable = true, length = 48,unique = true)
    private String name;
    
    @Column(name="Passis",length = 50,unique = false,nullable = true)
    private String epass;
    
    @Embedded
    @AttributeOverrides(
            {
                @AttributeOverride(name="state",column=@Column(name="Street_Override")),
                @AttributeOverride(name="city" , column=@Column(name="City_Override")),
                @AttributeOverride(name="pincode",column=@Column(name="Pincode_Overrides"))
            }
    )
    private Adres adress;

    public Employee(){}
    
    public Employee(String name, String epass, Adres adress) {
        this.name = name;
        this.epass = epass;
        this.adress = adress;
    }

    
    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEpass() {
        return epass;
    }

    public void setEpass(String epass) {
        this.epass = epass;
    }

    public Adres getAdress() {
        return adress;
    }

    public void setAdress(Adres adress) {
        this.adress = adress;
    }
    
    
    
}
