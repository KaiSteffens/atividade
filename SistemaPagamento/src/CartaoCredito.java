/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Escola
 */
public class CartaoCredito implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("pagou com credito"+valor);
    }
    
    
}
