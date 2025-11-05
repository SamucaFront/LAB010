public class LeitorTXT implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo TXT: " + caminhoArquivo);
        System.out.println("Conteúdo: Este é um texto simples.\n");
    }

    @Override
    public String getFormato() {
        return "TXT";
    }
}