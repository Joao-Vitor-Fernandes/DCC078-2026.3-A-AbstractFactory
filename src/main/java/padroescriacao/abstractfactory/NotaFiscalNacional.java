package padroescriacao.abstractfactory;

public class NotaFiscalNacional implements NotaFiscal{

    public String emitir() {
        return "Nota Fiscal Eletrônica (NF-e) Nacional";
    }
}
