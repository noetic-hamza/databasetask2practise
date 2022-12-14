package com.example.demo.Controller;

import com.example.demo.Repository.PartnerRepository;
import com.example.demo.Service.Services;
import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class ControllerPartner {
    @Autowired
    PartnerRepository partnerRepository;

    @Autowired
    Services services;


    List<PartnerDTO> table = new ArrayList<PartnerDTO>();
    List<PartnerDTO> table1 = new ArrayList<PartnerDTO>();

    //    @GetMapping("/all")
//    public List<Partner> getAll(){
//        return services.getAllPartners();
//    }
//    @GetMapping ("/id_partner/{id}")
//    public List<Partner> partnerid (@PathVariable Long id) {
//        return services.partnerid(id);
//    }
//    @GetMapping ("/delete_partner/{id}/{name}")
//    public void delete (@PathVariable Long id, @PathVariable String name ) {
//        services.delete(id, name);
//        System.out.println("Partner deleted successfully  having id :"+  id+ "and partner name" + name);
//
//    }
//    @PostMapping ("/update/{id}/{name}")
//    public void update (@PathVariable Long id, @PathVariable String name ) {
//       services.update(id, name);
//        System.out.println("Partner Id updated successsfully ! New id:"+ id + "and name: "+ name);
//
//    }
//    @PostMapping("/insert/{id}/{name}/{email}")
//    public void insert_partner (@PathVariable Long id, @PathVariable String name, @PathVariable String email){
////        services.insert_partner(id,name,email);
//}
    @RequestMapping(value = "/newinsert", method = RequestMethod.POST)
    @ResponseBody
    public void insert(@RequestBody Partner partner) {
        System.out.println(partner);
        services.insert_partner(partner);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public void delete(@RequestBody Partner partner) {
        services.delete(partner);
    }

    @RequestMapping(value = "/findall", method = RequestMethod.GET)
    public void find_partner() {
        services.findAllpartner();

    }
    @RequestMapping(value = "/testing", method = RequestMethod.POST)
    public String hello() throws InterruptedException {

//        TimeUnit.SECONDS.sleep(60);
        System.out.println("In API thread called");
        Thread.sleep(10000);

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

        return "noetic";

    }

        @RequestMapping(value = "/findbyid" , method = RequestMethod.GET)
    public List<PartnerInterfaceDTO> find_partnerbyid (){
        PartnerDTO partnerDTO= new PartnerDTO();

        int count = partnerRepository.partnerById(3L).size();
            List<PartnerInterfaceDTO> list2=   partnerRepository.partnerById(3L);
            for(int i =0 ; i< count; i++){
                partnerDTO.setEmail(list2.get(i).getemail());
                partnerDTO.setName(list2.get(i).getname());
                table.add(partnerDTO);
            }
//        System.out.println(count);
//            for (long j =0 ; j<=count ; j++ ){
//                partnerRepository.findAllById(Collections.singleton(j));
//                table1.add(partnerDTO);
//            }
//
        return partnerRepository.partnerById(3L);
    }
//    @RequestMapping(value = "/retyCount", method = RequestMethod.GET)
//    public List<RetryDTO> find_partnerbyid() {
//        Retry r = new Retry();
//
//        int count = partnerRepository.ExtractRecord().size();
//        List<RetryDTO> list2 = partnerRepository.ExtractRecord();
//
//        for (int i = 0; i < count; i++) {
//            r.setCount(count);
//            r.setNoOfAttenpts(list2.get(i).getNoOfAttempts());
//            table.add(r);
//        }
//        System.out.println(table);
////        return partnerRepository.partnerById(3L);
//
//        return list2;
//
//    }
}
