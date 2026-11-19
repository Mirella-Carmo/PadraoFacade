public class VeiculoFacade {

    public static boolean verificarPendenciasViagem(Veiculo veiculo) {
        if (Documentacao.getInstancia().verificarVeiculoComPendencia(veiculo)) {
            return false;
        }
        if (Manutencao.getInstancia().verificarVeiculoComPendencia(veiculo)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarVeiculoComPendencia(veiculo)) {
            return false;
        }
        return true;
    }
}