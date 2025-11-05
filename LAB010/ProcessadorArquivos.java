public class ProcessadorArquivos {
    public void processar(LeitorArquivo leitor, String caminho) {
        System.out.println("Processando arquivo (" + leitor.getFormato() + ")...");
        leitor.lerArquivo(caminho);
    }

    public static void main(String[] args) {
        ProcessadorArquivos processador = new ProcessadorArquivos();

        LeitorArquivo txt = new LeitorTXT();
        LeitorArquivo csv = new LeitorCSV();
        LeitorArquivo json = new LeitorJSON();

        processador.processar(txt, "documento.txt");
        processador.processar(csv, "dados.csv");
        processador.processar(json, "config.json");
    }
}