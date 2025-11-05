public class LeitorCSV implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo CSV: " + caminhoArquivo);
        System.out.println("Colunas: Nome, Idade, Cidade");
        System.out.println("Linhas: João, 30, São Paulo | Maria, 25, Rio de Janeiro\n");
    }

    @Override
    public String getFormato() {
        return "CSV";
    }
}