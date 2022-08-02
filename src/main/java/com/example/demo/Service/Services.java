package com.example.demo.Service;

import com.example.demo.Repository.PartnerRepository;
import com.example.demo.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    @Autowired
    PartnerRepository partnerRepository;
//
//    public void delete( Long id,  String name) {
//        partnerRepository.delete_partner(id, name);
//        System.out.println("Partner deleted successfully  having id :" + id + "and partner name" + name);
//    }
//    public List<Partner> getAllPartners(){
//        return partnerRepository.findpartners();
//    }
//
//
//    public List<Partner> partnerid (Long id) {
//        return partnerRepository.partnerById(id);
//    }
//    public void update ( Long id,  String name ) {
//        partnerRepository.update_partner(id, name);
//        System.out.println("Partner Id updated successsfully ! New id:"+ id + "and name: "+ name);
//
//    }
    public void insert_partner (Partner partner) {
//        partnerRepository.addPartner(id, name, email);
//        System.out.println("Partner added successfully ! new partner_id  : \n"+ id +
//                "name \n" + name +
        partnerRepository.save(partner);

        System.out.println("Success");


    }
    public void findAllpartner () {
        partnerRepository.findAll();
    }


    public void delete(Partner partner) {
        partnerRepository.delete(partner);
        System.out.println("Deleted succesfully");
    }
}
