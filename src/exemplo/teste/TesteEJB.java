/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.teste;

import exemplo.ejb.HelloWorldRemote;
import javax.naming.InitialContext;

/**
 *
 * @author gustavosa
 */
public class TesteEJB {
    public static void main(String[] args) throws Exception {
        InitialContext ctx = new InitialContext(); //Utilizacao do ejb que esta no servidor
        HelloWorldRemote ejb = (HelloWorldRemote) ctx.lookup("exemplo.ejb.HelloWorldRemote"); //Solicitacao do componente com detreminado nome
        System.out.println(ejb.olaMundo());
    }
}
