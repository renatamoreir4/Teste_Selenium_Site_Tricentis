## Time: Guardiãs da Qualidade

Integrantes: <br>
<ul>
      <li> Renata Moreira </li>
    https://github.com/renatamoreir4
</ul>

## Desafio: Automação de testes utilizando Selenium e Cucumber 

Utilizando o site da *Tricentis* 

- 1 casos de testes
- 5 cenários

#### Tecnologias utilizadas:

**Selenium**: Framework responsável por fazer a integração do código Java com a linguagem Gherkin (Cucumber), abrindo o browser e realizando os testes de comportamento

**Junit**: testar o software em Java

**Cucumber**: Framework responsável por traduzir uma linguagem humana em código Java

**Java**: Linguagem de programação utilizada

**Maven**: Gerenciador das dependências para o Java

**Visual Studio Code**: IDE para implementação do projeto 

#### Extensões na IDE:

Java Extension Pack | Cucumber (Gherkin) | Cuke Step Definition Generator | Language support for Java


### Como utilizar:
- Pré requisitos:

Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

Intalar o jdk: https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

- Clonar o projeto

  ```
  git clone https://github.com/jessikagomes/sampleAppTricentis.git
  ```

- Entrar na página do projeto

  ```
  cd Avaliação_Accenture_Final
  ```
- Configurando Selenium no computador:<br>
Fazer o download do Chrome Web Driver e adiconar o arquivo (descompactado) dentro da pasta "driver" na raíz do projeto<br>https://chromedriver.chromium.org/downloads<br>
<br>Exemplo:<br>

<ul>
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
</ul>

- Limpando e validando Maven (Unix):
```bash
./mvnw clean
```

- Limpando e validando Maven (Windows):
```bash
mvnw.cmd clean
```

- Executando teste no Unix:
```bash
./test.sh
```

- Executando teste no Windows:
```bash
test.bat
```

## Estrutura de arquivos

<pre>
    driver <br>
        |-- chromedriver<br> -- Arquivo Selenium WebDriver. 
        Substitua este arquivo com a versão da sua máquina.
    mvwn<br>
    mvnw.cmd
    pom.xml
    -- src
    
    |-- test
    
    |  |-- java
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |-- resources
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |  |  |  |  |-- preencherformulario.feature
      
    |  |-- java
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |  |  |  |  |-- RunCucumberTest.java
    
    |  |  |  |  |  |-- Pages
    
    |  |  |  |  |  |  |-- InsurantPage.java
    
    |  |  |  |  |  |  |-- PriceOptionPage.java
    
    |  |  |  |  |  |  |-- ProductPage.java
    
    |  |  |  |  |  |  |-- SendQuotePage.java
    
    |  |  |  |  |  |  |-- VehiclePage.java
    
    |  |  |  |  |  |-- Servicos
    
    |  |  |  |  |  |  |-- Configuracao.java
    
    |  |  |  |  |  |-- Steps
    
    |  |  |  |  |  |  |-- InsurantSteps.java
    
    |  |  |  |  |  |  |-- PriceOptionSteps.java
    
    |  |  |  |  |  |  |-- ProductSteps.java
    
    |  |  |  |  |  |  |-- SendQuoteSteps.java
    
    |  |  |  |  |  |  |-- VehicleSteps.java

</pre>

## ​Artigos e guias consultados: 

[Cucumber Melhores Práticas](https://cucumber.io/docs/cucumber/)

[Junit Asserts ](https://junit.org/junit5/docs/current/user-guide/)

[Gerador de Dados](https://www.4devs.com.br/gerador_de_pessoas)

[Tutorial Maven](https://www.devmedia.com.br/introducao-ao-maven/25128)

------
## Agradecimento

<h1>Agradeço a Gama Academia e a Accenture por fazer essa realização possivél. Agradeço Também ao meu isntrutor Danilo Aparecido, pela sua paciencia e orientação.</h1>