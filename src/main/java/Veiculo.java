public class Veiculo {

    public boolean liberarParaViagem() {
        return VeiculoFacade.verificarPendenciasViagem(this);
    }
}