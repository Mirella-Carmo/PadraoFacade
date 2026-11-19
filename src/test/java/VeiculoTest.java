import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveRetornarPendenciaDocumentacaoViagem() {
        Veiculo veiculo = new Veiculo();
        Documentacao.getInstancia().addVeiculoPendente(veiculo);

        assertEquals(false, veiculo.liberarParaViagem());
    }

    @Test
    void deveRetornarPendenciaManutencaoViagem() {
        Veiculo veiculo = new Veiculo();
        Manutencao.getInstancia().addVeiculoPendente(veiculo);

        assertEquals(false, veiculo.liberarParaViagem());
    }

    @Test
    void deveRetornarPendenciaFinanceiroViagem() {
        Veiculo veiculo = new Veiculo();
        Financeiro.getInstancia().addVeiculoPendente(veiculo);

        assertEquals(false, veiculo.liberarParaViagem());
    }

    @Test
    void deveRetornarVeiculoSemPendenciaViagem() {
        Veiculo veiculo = new Veiculo();

        assertEquals(true, veiculo.liberarParaViagem());
    }
}