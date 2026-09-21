package padroescriacao.abstractfactory;

public class NotaFiscalInternacional implements NotaFiscal{

    public String emitir() {
        return "Documento Fiscal Internacional (Invoice Internacional)";
    }
}
