package padroescriacao.abstractfactory;

public class FabricaLogisticaInternacional implements FabricaLogistica {

    @Override
    public Etiqueta createEtiqueta() {
        return new EtiquetaInternacional();
    }

    @Override
    public NotaFiscal createNotaFiscal() {
        return new NotaFiscalInternacional();
    }
}
