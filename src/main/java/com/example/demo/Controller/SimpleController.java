package com.example.demo.Controller;

import com.example.demo.Repository.PartnerRepository;
import com.example.demo.Service.Services;
import com.example.demo.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("books")

public class SimpleController {
    @Autowired
    PartnerRepository partnerRepository;

    @Autowired
    Services services;

    @RequestMapping(value = "/s_controller", method = RequestMethod.GET)
    public @ResponseBody
    List<Partner> getmessage () {
        return partnerRepository.findAll();

    }

//    @RequestMapping(value="/insert", method = RequestMethod.GET)
//    public @ResponseBody
//   void  insertnew (Partner partner){
//        services.delete(partner);
////        services.insert_partner(partner);
////        System.out.println("Partner successfully added in database !");
//    }
}
