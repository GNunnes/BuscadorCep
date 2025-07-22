public record Endereco (String cep,
                        String logradouro,
                        String complemento,
                        String localidade,
                        String uf){
    //RECORD, internamente já possui os getters|setters e ToString
}
