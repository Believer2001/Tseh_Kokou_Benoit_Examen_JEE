package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities;


import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("CI")
public class CreditImmobilier  extends  Credit{
    private String typeBienFinance;

}
