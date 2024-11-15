package strategy;
public class ComportamentoDefensivo implements Comportamento{
    
    @Override
    public void mover(){
        System.out.println("Defendendo...");
    }

}
//Anotações para estudar depois
/*
*A classe implementou mover por causa da interface
*E determinou o que acontece se for usada
*/
