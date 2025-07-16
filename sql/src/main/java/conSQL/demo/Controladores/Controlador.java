/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conSQL.demo.Controladores;

import conSQL.demo.Entidades.Demo;
import conSQL.demo.repositorio.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author REG
 */
@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class Controlador {
    
    private final DemoRepository demoRepository;

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }
    
    @GetMapping("/guardar")
    public String guardar() {
        
        Demo d = new Demo();
        d.setProp("prop");
        Long id = demoRepository.save(d).getId();
        System.out.println(id);
        System.out.println(demoRepository.findAll().size());
        System.out.println(demoRepository.findAll());
        return id.toString();
    }
    
    @GetMapping("/borrarTodo")
    public void borrarTodo() {
        demoRepository.deleteAll();
    }
}
