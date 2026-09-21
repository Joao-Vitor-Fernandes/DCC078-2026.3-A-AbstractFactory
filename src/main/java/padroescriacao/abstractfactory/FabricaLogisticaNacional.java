package padroescriacao.abstractfactory;

public class FabricaLogisticaNacional implements FabricaLogistica {

    @Override
    public Etiqueta createEtiqueta() {
        return new EtiquetaNacional();
    }

    @Override
    public NotaFiscal createNotaFiscal() {
        return new NotaFiscalNacional();
    }
}