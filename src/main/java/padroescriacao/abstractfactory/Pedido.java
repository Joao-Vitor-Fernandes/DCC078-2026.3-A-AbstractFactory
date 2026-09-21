package padroescriacao.abstractfactory;

public class Pedido {

    private Etiqueta etiqueta;
    private NotaFiscal notaFiscal;

    public Pedido(FabricaLogistica fabrica) {
        this.etiqueta = fabrica.createEtiqueta();
        this.notaFiscal = fabrica.createNotaFiscal();
    }

    public String emitirEtiqueta() {
        return this.etiqueta.emitir();
    }

    public String emitirNotaFiscal() {
        return this.notaFiscal.emitir();
    }
}
