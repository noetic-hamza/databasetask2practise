package com.example.demo.Repository;

import com.example.demo.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
//    @Query(value = "SELECT * FROM partner", nativeQuery = true)
//    List<Partner> findpartners ();
//
//    @Query (value= "select * from partner where id=:partner_id ", nativeQuery = true)
//    List<Partner> partnerById(Long partner_id);
//
//    @Transactional
//    @Modifying
//    @Query (value ="INSERT INTO partner (id , name , email)" +
//            "VALUES (:partner_id,:partner_name ,:partner_email)",nativeQuery = true)
//    void addPartner(Long partner_id, String partner_name, String partner_email);
//
//
//    @Transactional
//    @Modifying
//    @Query (value = "delete from partner where id=:partner_id and name=:partner_name ", nativeQuery = true)
//    void delete_partner(Long partner_id, String partner_name);
//
//    @Transactional
//    @Modifying @Query (value = "Update partner SET id=:partner_id WHERE name=:partner_name ", nativeQuery = true)
//    void update_partner(Long partner_id, String partner_name);

}
