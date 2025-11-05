public class LeitorJSON implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo JSON: " + caminhoArquivo);
        System.out.println("{ \"nome\": \"João\", \"idade\": 30, \"cidade\": \"São Paulo\" }\n");
    }

    @Override
    public String getFormato() {
        return "JSON";
    }
}