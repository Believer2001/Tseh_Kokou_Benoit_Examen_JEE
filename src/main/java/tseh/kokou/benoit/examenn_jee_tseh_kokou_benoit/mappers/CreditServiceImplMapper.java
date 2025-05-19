package tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.dtos.ClientDTO;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.dtos.CreditPersonnelDTO;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.dtos.RemboursementDTO;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities.Client;
import tseh.kokou.benoit.examenn_jee_tseh_kokou_benoit.entities.Remboursement;

public class CreditServiceImplMapper {

    public ClientDTO fromClientToClientDTO(Client client)
    {
        ClientDTO clientDTO = new ClientDTO();
        BeanUtils.copyProperties(client, clientDTO);
         return  clientDTO;
    }

    public  Client fromClientDTOToclient(ClientDTO clientDT0)
    {
        Client client = new Client();
        BeanUtils.copyProperties(clientDT0,client);
         return  client;
    }

     public RemboursementDTO fromRemboursementToRemboursementDTo(Remboursement remboursement)
     {
          RemboursementDTO remboursementDTO = new RemboursementDTO();
           BeanUtils.copyProperties(remboursement ,remboursementDTO);
            return  remboursementDTO;
     }

     public  Remboursement fromRemboursemntDTOToRembooursement(RemboursementDTO remboursementDTO)
     {
          Remboursement remboursement = new Remboursement();
          BeanUtils.copyProperties(remboursementDTO ,remboursement);
           return  remboursement;
     }








}
