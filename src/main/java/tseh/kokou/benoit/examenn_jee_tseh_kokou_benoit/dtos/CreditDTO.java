package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.dtos;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities.Client;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities.Remboursement;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.enums.Statut;

import java.util.Date;
import java.util.List;

public class CreditDTO {

    private String id;
    private Date dateDemande;
    private Statut statut;
    private Date dateAcceptation;
    private double montant;
    private double dureeRemboursement;
    private double tauxInteret;
    private List<RemboursementDTO> remboursements;
}
