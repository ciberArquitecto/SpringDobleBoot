/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conSQL.demo.repositorio;

import conSQL.demo.Entidades.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author REG
 */
public interface DemoRepository extends JpaRepository<Demo, Long>  {
    
    
    
}
