package MinhaCorrida;

public class App {

    public static void main(String[] args) {
        Veiculo monza = new Veiculo (new MotorMonza());
        Veiculo opala = new Veiculo (new MotorOpala());
        Veiculo porsche = new Veiculo (new MotorPorsche());
        Veiculo bmw = new Veiculo (new MotorBMW());
        
        System.out.println (monza.acelerar());
        System.out.println (opala.acelerar());
        System.out.println (porsche.acelerar());
        System.out.println (bmw.acelerar());
        
    }
}
