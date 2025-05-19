package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.dtos;

import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.enums.Statut;

import java.util.Date;
import java.util.List;

public class CreditProfesssionnelDTO {
    private String id;
    private Date dateDemande;
    private Statut statut;
    private Date dateAcceptation;
    private double montant;
    private double dureeRemboursement;
    private double tauxInteret;
    private List<RemboursementDTO> remboursements;
    private String raisonSocial;

}
