package com.restaurantServices.menuItems.controller;


import com.restaurantServices.menuItems.MenuItem;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuItemController {

    @RequestMapping(value="/menuItems", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<MenuItem> getItems() {
        return MenuItem
    }
}
