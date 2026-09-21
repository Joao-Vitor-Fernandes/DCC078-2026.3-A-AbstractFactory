package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveEmitirEtiquetaNacional() {
        FabricaLogistica fabrica = new FabricaLogisticaNacional();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Etiqueta de Envio Nacional (Correios/Transportadora)", pedido.emitirEtiqueta());
    }

    @Test
    void deveEmitirEtiquetaInternacional() {
        FabricaLogistica fabrica = new FabricaLogisticaInternacional();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Etiqueta de Envio Internacional (Exportação)", pedido.emitirEtiqueta());
    }

    @Test
    void deveEmitirNotaFiscalNacional() {
        FabricaLogistica fabrica = new FabricaLogisticaNacional();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Nota Fiscal Eletrônica (NF-e) Nacional", pedido.emitirNotaFiscal());
    }

    @Test
    void deveEmitirNotaFiscalInternacional() {
        FabricaLogistica fabrica = new FabricaLogisticaInternacional();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Documento Fiscal Internacional (Invoice Internacional)", pedido.emitirNotaFiscal());
    }
}
