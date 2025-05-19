package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities.Client;

public interface ClientRepository  extends JpaRepository<Client , Long> {
}
