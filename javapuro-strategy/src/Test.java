public class Test {
    public static void main(String[] args){
        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();//Define os comportamentos
        Comportamento normal = new ComportamentoNormal();//com base nas classes
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento fugitivo = new ComportamentoFugitivo();

        Robo robo = new Robo();//Simualação de movimentos do Robô
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(fugitivo);
        robo.mover();
        robo.mover();
        
    }
}
