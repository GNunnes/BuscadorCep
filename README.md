<h1><div align="center">
Consulta de CEP em Java 🚀</div></h1> 



![Java](https://img.shields.io/badge/Language-Java-orange)

**Consulta de CEP** é uma aplicação Java simples e poderosa que permite buscar endereços a partir de números de CEP utilizando a API pública do [ViaCEP](https://viacep.com.br/). Os resultados são exibidos de forma clara no terminal e salvos em arquivos `.json` lindamente formatados!
<br><br>
## ✨ Funcionalidades

- 🔍 Busca de informações completas de CEP de todo o Brasil.
- 💾 Salva o endereço retornado em um arquivo `.json` com o nome do próprio CEP.
- 🛡️ Tratamento elegante de erros e mensagens informativas.
- 🧊 Código enxuto e moderno, utilizando:
  - Java Records
  - Java HttpClient (Java 11+)
  - Gson para serialização JSON <br><br>

<h1><div align="center">Como usar🚀 </div></h1> 
<br><br>
## 1. **Clone o repositório**

git clone https://github.com/GNunnes/BuscadorCep.git
cd nome-do-repositorio
<br><br>

## 2. **Instale as dependências**

*Atenção*: o projeto utiliza a biblioteca [Gson](https://github.com/google/gson). Inclua no seu projeto via Maven, Gradle ou baixe o `.jar` manualmente e inclua no classpath.
<br>
<details>
<summary>Exemplo Maven</summary>

<dependency> <groupId>com.google.code.gson</groupId> <artifactId>gson</artifactId> <version>2.10.1</version> </dependency> ``` </details>
<br>
## 3. Compile o projeto

javac -cp ".;caminho/para/gson.jar" *.java
<br><br>
## 4. Execute o programa

java -cp ".;caminho/para/gson.jar" Principal
<br><br>
## 💡 Exemplo de uso
Insira o CEP desejado quando solicitado.

Digite um número de CEP para consulta:<br>
01310-000<br>
Resultado no terminal:

Endereco[cep=01310-000, logradouro=Avenida Paulista, complemento=de 1001 a 2021 - lado ímpar, localidade=São Paulo, uf=SP]

Além disso, será gerado automaticamente o arquivo 01310-000.json com os dados completos.
<br><br>
## 🗂️ Estrutura do projeto

├── ConsultaCep.java<br>
├── Endereco.java<br>
├── GeradorDeArquivo.java<br>
└── Principal.java
<br><br>
## 📦 Exemplo de saída (01310-000.json)

{<br>
  "cep": "01310-000",<br>
  "logradouro": "Avenida Paulista",<br>
  "complemento": "de 1001 a 2021 - lado ímpar",<br>
  "localidade": "São Paulo",<br>
  "uf": "SP"<br>
}
<br><br>
## ⚙️ Tecnologias Utilizadas <br>
- Java 17+ (recomendado)<br>
- Biblioteca Gson<br>
- API pública ViaCEP
<br><br>
## 🙏 Contribuição
Contribuições são muito bem-vindas! Sinta-se livre para abrir issues e pull requests com melhorias, sugestões ou bugs encontrados.
<br><br>
## 👤 Autor

Gustavo N. Bezerra - [LinkedIn](https://www.linkedin.com/in/gustavo-nunnes) | [GitHub](https://github.com/GNunnes)
