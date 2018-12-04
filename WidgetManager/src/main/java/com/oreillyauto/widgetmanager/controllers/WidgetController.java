package com.oreillyauto.widgetmanager.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oreillyauto.widgetmanager.domain.Widget;
import com.oreillyauto.widgetmanager.service.WidgetService;

@Controller
@RequestMapping("/")
public class WidgetController extends BaseController {

    @Autowired
    WidgetService widgetService;

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
    public String postAddWidget(Model model, String name, String color, String brand) {
        System.out.println("name=>" + name + " color=>" + color + "brand=>" + brand);
        Widget widget = new Widget();
        widget.setName(name);
        widget.setColor(color);
        widget.setBrand(brand);
        widgetService.saveSoda(widget);
        model.addAttribute("message", name + " " + "Saved" + " Successfully!");
        
        List<Widget> sodaList = widgetService.getAllSoda();
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "tableMode");
        model.addAttribute("sodaList", sodaList);
        return "widgets";
    }

    
    @PostMapping(value = { "widgets/edit/{id}" })
    public String postEditWidget(@PathVariable("id") Integer id, Model model, String name,
                                String color, String brand, String update) {
        System.out.println("Id=>" + id + "name=>" + name + " color=>" + color + "brand=>" + brand);
        Widget widget = new Widget();
        widget.setId(id);
        widget.setName(name);
        widget.setColor(color);
        widget.setBrand(brand);
        widgetService.saveSoda(widget);
        String action = ("true".equalsIgnoreCase(update)) ? "Updated" : "Saved";
        model.addAttribute("message", name + " " + action + " Successfully!");
        
        List<Widget> sodaList = widgetService.getAllSoda();
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "tableMode");
        model.addAttribute("sodaList", sodaList);
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

    @GetMapping(value = { "widgets/edit/{id}" })
    public String getEditWidget(@PathVariable("id") Integer id, Model model) {
        // NON-AJAX CALL
        // Get the widget by id
        // Add widget to the model
        
        Widget widget = widgetService.getWidgetById(id);
        //Widget widget2 = widgetService.getWidgetByName(name);
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "editMode");
        model.addAttribute("widget", widget);
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

    @GetMapping(value = { "widgets/{id}/delete" })
    public String getDeleteWidget(Model model, @PathVariable Integer id) {
        // NON-AJAX CALL
        // Get the widget by id (CRUD API)
        // Delete the widget
        Widget widget = widgetService.getWidgetById(id);
        widgetService.deleteWidgetByWidgetId(widget);
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "tableMode");
        model.addAttribute("message"," Deleted Successfully!");
        
        // Add msg to the model?
        List<Widget> sodaList = widgetService.getAllSoda();
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "tableMode");
        model.addAttribute("sodaList", sodaList);
        
        return "widgets";
    }
    
    @GetMapping(value = {"widgets/sortName"})
    public String sortName(Model model) {
        
        List<Widget> sodaList = widgetService.getSortedSoda();
        
        // Place a flag on the model so we know that we are working with: 
        model.addAttribute("mode", "tableMode");
        model.addAttribute("sodaList", sodaList);
        
        return "widgets";
    }
    
    @GetMapping(value = {"widgets/ajaxTable"})
    public String getTable(Model model) {
        return "widgetsajax";
    }
    
    @ResponseBody
    @GetMapping(value = "widgets/getSodas")
    public List<Widget> getSodas(){
        List<Widget> sodaList = widgetService.getAllSodaForAjax();
        return sodaList;
    }
}









