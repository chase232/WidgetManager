package com.oreillyauto.widgetmanager.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oreillyauto.widgetmanager.domain.Widget;
import com.oreillyauto.widgetmanager.service.WidgetService;

@Controller
@RequestMapping("/")
public class WidgetController extends BaseController {

    @Autowired
    WidgetService widgetService;
    
/*    @GetMapping(value = { "widgets" })
    public String getCarParts(Model model) throws Exception {
        return "widgets";
    }*/

    @GetMapping(value = { "widgets" })
    public String getWidgets(Model model) {
        // Get a list of widgets without using the CRUD API or Spring DATA
        // Place the list on the model
        
/*        if (name != null && partnumber.length() > 0) {
            CarPart carPart = carPartsService.getCarPartByPartNumber(partnumber);
            model.addAttribute("carPart", carPart);
        }
        return "partnumber";*/
        
        List<Widget> sodaList = widgetService.getAllSoda();
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "tableMode");
        model.addAttribute("sodaList", sodaList);
        
        return "widgets";
    }
    
    @GetMapping(value = { "widgets/add" })
    public String getAddWidget(Model model) {
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "addMode");  
        return "widgets";
    }
    
    @PostMapping(value = { "widgets/add" })
    public String postAddWidget(Model model, String name, String color, String brand, String update) {
        System.out.println("name=>" + name + " color=>" + color + "brand=>" + brand);
        Widget widget = new Widget();
        widget.setName(name);
        widget.setColor(color);
        widget.setBrand(brand);
        widgetService.saveSoda(widget);
        String action = ("true".equalsIgnoreCase(update)) ? "Updated" : "Saved";
        model.addAttribute("message", "Name " + name + " " + action + " Successfully!");
        return "widgets";
    }

    @ResponseBody
    @GetMapping(value = { "widgets/xEdit" })
    public String getXEditWidget(Model model, Integer id) {
        // AJAX CALL
        // Get the widget by id
        // Convert the widget to a string
        
        // Add error/errorMessage flags to the response
        
        // Return serialized version of your widget
        return "???";
    }

    @GetMapping(value = { "widgets/edit" })
    public String getEditWidget(Model model, Integer id) {
        // NON-AJAX CALL
        // Get the widget by id
        // Add widget to the model
        
        
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "editMode");
        
        return "widgets";
    }
    
    @ResponseBody
    @GetMapping(value = { "widgets/xDelete" })
    public String getXDeleteWidget(Model model, Integer id) {
        // AJAX CALL
        // Get the widget by id
        // Delete it (CRUD API)
        
        // Add error/errorMessage flags to the response
        
        // Return serialized version of your widget
        return "???";
    }

    @GetMapping(value = { "widgets/delete" })
    public String getDeleteWidget(Model model, Integer id) {
        // NON-AJAX CALL
        // Get the widget by id (CRUD API)
        // Delete the widget
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "tableMode");
        
        // Add msg to the model?
        
        return "widgets";
    }
    
}