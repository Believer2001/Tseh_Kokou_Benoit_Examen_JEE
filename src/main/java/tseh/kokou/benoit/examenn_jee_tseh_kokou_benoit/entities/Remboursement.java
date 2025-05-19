package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.enums.Type;

import javax.swing.*;
import java.util.Date;


@Entity
@Data @NoArgsConstructor  @AllArgsConstructor

public class Remboursement {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Date datePaiement;
    private double montant;
    private Type type;
    @ManyToOne
    private   Credit credit;
}
