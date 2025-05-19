package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.enums.Statut;

import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

@Inheritance(strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name = "Type",length =4,discriminatorType = DiscriminatorType.STRING)
public class Credit {

    @Id  @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Date dateDemande;
    private Statut statut;
    private Date dateAcceptation;
    private double montant;
    private double dureeRemboursement;
    private double tauxInteret;
    @ManyToOne
    private  Client client;
    @OneToMany(mappedBy = "credit", fetch = FetchType.LAZY)
    private List<Remboursement> remboursements;
}
