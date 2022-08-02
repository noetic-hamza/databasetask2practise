package com.example.demo.Controller;

import com.example.demo.Service.Services;
import com.example.demo.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerPartner {
//    @Autowired
//    PartnerRepository partnerRepository;

    @Autowired
    Services services;



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
@RequestMapping (value= "/newinsert" , method= RequestMethod.POST)
@ResponseBody
    public void insert (@RequestBody Partner partner ) {
    System.out.println(partner);
    services.insert_partner(partner);
}
@RequestMapping(value = "/delete" , method = RequestMethod.GET)
    public void delete (@RequestBody Partner partner){
    services.delete(partner);
}
    @RequestMapping(value = "/find" , method = RequestMethod.GET)
    public void find_partner (){
        services.findAllpartner();
    }






}
