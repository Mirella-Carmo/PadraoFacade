public class Manutencao extends Setor {

    private static Manutencao manutencao = new Manutencao();

    private Manutencao() {};

    public static Manutencao getInstancia() {
        return manutencao;
    }
}