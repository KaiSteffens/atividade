/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class main {
    
    
    public static void main(String[] args) {
        CalculoSalario kai=new Analista();
        kai.calcularSalario();
        
        CalculoSalario tauhan=new Gerente();
        tauhan.calcularSalario();
        
        CalculoSalario lu=new Desenvolvedor();
        lu.calcularSalario();
    }
}
