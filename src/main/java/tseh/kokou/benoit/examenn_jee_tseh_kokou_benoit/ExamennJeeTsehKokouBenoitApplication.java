package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities.*;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.enums.Statut;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.enums.Type;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.repositories.ClientRepository;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.repositories.CreditRepository;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.repositories.RemboursementRepository;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ExamennJeeTsehKokouBenoitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamennJeeTsehKokouBenoitApplication.class, args);
    }





    @Bean
    CommandLineRunner start(ClientRepository clientRepository,
                            CreditRepository creditRepository,
                            RemboursementRepository remboursementRepository)
    {
        return args -> {
            Stream.of("Hassan","Yassine","Aicha").forEach(name->{
                Client client = new Client();
                client.setNom(name);
                client.setEmail(name+"@gmail.com");
                clientRepository.save(client);
            });

            clientRepository.findAll().forEach(client -> {
                CreditPersonnel creditPersonnel = new CreditPersonnel();
                creditPersonnel.setDateDemande(new Date());
                creditPersonnel.setMontant(Math.random()*1000);
                creditPersonnel.setDateAcceptation(new Date());
                creditPersonnel.setMotif("besoin personnerm");
                creditPersonnel.setClient(client);
                creditPersonnel.setStatut(Statut.EN_COURS);
                creditRepository.save(creditPersonnel);



                    CreditImmobilier creditImmobilier = new CreditImmobilier();
                    creditImmobilier.setDateDemande(new Date());
                    creditImmobilier.setClient(client);
                    creditImmobilier.setMontant(Math.random()*1000);
                    creditImmobilier.setDateAcceptation(new Date());
                    creditImmobilier.setTypeBienFinance("maison");
                    creditImmobilier.setStatut(Statut.EN_COURS);
                    creditRepository.save(creditImmobilier);




                CreditProfessionnel creditProfessionnel= new CreditProfessionnel();
                creditProfessionnel.setDateDemande(new Date());
                creditProfessionnel.setClient(client);
                creditProfessionnel.setMontant(Math.random()*1000);
                creditProfessionnel .setDateAcceptation(new Date());
                creditProfessionnel.setRaisonSocial("investissement");
                creditProfessionnel.setStatut(Statut.EN_COURS);
                creditRepository.save(creditImmobilier);

            });


            creditRepository.findAll().forEach(credit->{
                for(int i =0;i<10;i++)
                {
                    Remboursement remboursement =new Remboursement();
                    remboursement.setMontant(Math.random()*1200);
                    remboursement.setDatePaiement(new Date());
                    remboursement.setCredit(credit);
                    remboursement.setType(Math.random()>0.5? Type.MENSUALITE:Type.REMBOURSEMENT_ANTIICIPE);
                    remboursementRepository.save(remboursement);
                }
            });


        };

    }


}
