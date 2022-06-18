package com.example.demo3.controller;

import com.example.demo3.model.newDTO;
import com.example.demo3.service.iNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class newAPI {
    //@RequestMapping(value = "new", method = RequestMethod.POST)
    @Autowired
    private iNewService newService;
    @PostMapping(value = "/new")

    public newDTO createNew(@RequestBody newDTO model){
        return newService.save(model);
    }
    //@RequestMapping(value ="new", method = RequestMethod.PUT)
    @PutMapping("new")
    public newDTO updateNew(@RequestBody newDTO model){
         return model;
    }
  //  @DeleteMapping(value= "new")
  //  public void newDTO deleteNew(@RequestBody long[] id){};

    @GetMapping("newAPI")
    public String testAPI(){
        return "success";
    }
    @GetMapping("test")
    public String test(){
        return "test";
    }
}

