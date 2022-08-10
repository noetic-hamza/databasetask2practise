package com.example.demo.Controller;

import com.example.demo.Repository.PartnerRepository;
import com.example.demo.Service.Services;
import com.example.demo.model.Partner;
import com.example.demo.model.PartnerDTO;
import com.example.demo.model.PartnerInterfaceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("books")

public class SimpleController {
    @Autowired
    PartnerRepository partnerRepository;

    @Autowired
    Services services;
    List<PartnerDTO> table = new ArrayList<PartnerDTO>();

    //controller class using response body to get the response after hitting the api
    @RequestMapping(value = "/s_controller", method = RequestMethod.GET)
    public @ResponseBody
    List<Partner> getmessage () {
        return partnerRepository.findAll();

    }
//    @RequestMapping(value = "/new_controller /{id}", method = RequestMethod.GET)
    @GetMapping("/api/{id}")
    @ResponseBody
    public List<PartnerInterfaceDTO> find_partnerbyid (@PathVariable Long id ) {
        PartnerDTO partnerDTO = new PartnerDTO();
        int count = partnerRepository.partnerById(id).size();
        List<PartnerInterfaceDTO> list2=   partnerRepository.partnerById(3L);
            for(int i =0 ; i< count; i++){
                partnerDTO.setEmail(list2.get(i).getemail());
                partnerDTO.setName(list2.get(i).getname());
                table.add(partnerDTO);
            }
            return partnerRepository.partnerById(id);
        }
        @PostMapping("/api1")
    @ResponseBody
    public List<Partner> apicall (){
        PartnerDTO partnerDTO= new PartnerDTO();
        int count = (int) partnerRepository.count()-1;
        List<Partner> list = partnerRepository.findAll();
        for (int i =0 ; i<=count ;i++){
            partnerDTO.setName(list.get(i).getName());
            partnerDTO.setEmail(list.get(i).getEmail());

        }
        return partnerRepository.findAll();
        }



    }

//    @RequestMapping(value="/insert", method = RequestMethod.GET)
//    public @ResponseBody
//   void  insertnew (Partner partner){
//        services.delete(partner);
////        services.insert_partner(partner);
////        System.out.println("Partner successfully added in database !");
//    }


