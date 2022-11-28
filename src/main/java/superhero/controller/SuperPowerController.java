/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superhero.controller;

import jakarta.servlet.http.HttpServletRequest;
import jdk.jfr.Frequency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import superhero.dao.PowerDao;
import superhero.model.Power;

import java.util.List;

/**
 *
 * @author ciruf
 */
@Controller
@RequestMapping("/super-powers")
public class SuperPowerController {

    @Autowired
    PowerDao powerDao;
    
    @GetMapping
    public String getSuperPowers(Model model) {

        List<Power> powers = powerDao.getAllPowers();
        model.addAttribute("powers", powers);
        return "SuperPower";
    }
    
    @PostMapping
    public String createSuperPower(int powerId, String powerDescription) {
        Power power = new Power();
        power.setPowerId(powerId);
        power.setPowerDescription(powerDescription);
        powerDao.addPower(power);
        return "redirect:/SuperPower";

    }
    
    @GetMapping("/{id}")
    public String getSuperPower(@PathVariable int id) {
        return "NOT IMPLEMENTED: Get specific super power";
    }
    
    @PutMapping("/{id}")
    public String updateSuperPower(@PathVariable int id) {
        return "NOT IMPLEMENTED: Update specific super power";
    }
    
    @DeleteMapping("/{id}")
    public String deleteSuperPower(@PathVariable int id) {
        return "NOT IMPLEMENTED: Delete specific super power";
    }
    
}
