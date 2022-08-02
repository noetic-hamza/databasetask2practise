package com.example.demo.Repository;

import com.example.demo.model.Partner;
import com.example.demo.model.PartnerDTO;
import com.example.demo.model.PartnerInterfaceDTO;
import com.example.demo.model.RetryDTO;
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
    @Query (value= "select name,email from partner where id=:partner_id", nativeQuery = true)
    List<PartnerInterfaceDTO> partnerById(Long partner_id);

    @Query(value = "select count(*),num_of_attempts from tbl_retry " +
            "where ctimestamp between'2022-08-01 00:00:00' and '2022-08-02 23:59:59' and tbl_charging_id in" +
            "(select id from tbl_charging where left(origintimestamp::text, 10)='2022-08-02') group by " +
            "num_of_attempts", nativeQuery = true)
    List<RetryDTO> ExtractRecord();
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
