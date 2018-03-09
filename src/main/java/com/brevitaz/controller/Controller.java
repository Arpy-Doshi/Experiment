package com.brevitaz.controller;

import com.brevitaz.dao.Dao;
import com.brevitaz.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class Controller
{
    @Autowired
    Dao dao;



    @RequestMapping(method = RequestMethod.POST)
    public boolean create(@RequestBody Model model)
    {
        return dao.create(model);
    }
}
