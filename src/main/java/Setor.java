import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Veiculo> veiculosComPendencia = new ArrayList<Veiculo>();

    public void addVeiculoPendente(Veiculo veiculo) {
        this.veiculosComPendencia.add(veiculo);
    }

    public boolean verificarVeiculoComPendencia(Veiculo veiculo) {
        return this.veiculosComPendencia.contains(veiculo);
    }
}