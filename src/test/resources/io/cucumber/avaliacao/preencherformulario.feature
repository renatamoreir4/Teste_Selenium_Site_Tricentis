# language: pt

Funcionalidade: validando formulario
    Validando o formulario de seguro de automovel da tricentis

  Cenário: Entrar no site da tricentis e preencher o formulario da aba “Enter Vehicle Data”
    Dado que estou no site da tricentis
    E seleciono uma marca
    E seleciono o modelo
    E digito a capacidade do cilindro
    E digito o desempenho do motor
    E insiro a data 
    E seleciono o numero de assento 
    E seleciono o tipo de direcao
    E seleciono novamente o numero de assento
    E seleciono o tipo de combustivel 
    E digito a carga util
    E digito o peso total util
    E digito no campo preco de tabela 
    E digito no campo numero da placa do carro 
    E digito no campo milhagem anual 
    Entao clico no next para insurant 
  
  Cenário: Estou no site da tricentis e preenchendo o formulario da aba “Enter insurant Data”
        
    Dado que digito o primeiro nome
    E digito o segundo nome
    E insiro a data de nascimento
    E seleciono um genero
    E digito o endereco
    E seleciono um pais
    E digito um CEP
    E digito a cidade
    E seleciono uma ocupacao
    E seleciono um hobbies
    E insiro o local na rede de internet
    Entao clico em next para product

      
    
  Cenario: Preencher Enter Product Data
    Quando seleciono uma data 
    E seleciono um valor
    E seleciono uma nota
    E seleciono uma cobertura 
    E seleciono produtos opcionais 
    E seleciono uma cortesia
    Entao clico em next para ver a tabela de precos
  
  Cenario: Escolher tipo de Select Price Option
    Quando escolhe uma opcao 
    Entao clico em Next para receber

  Cenario: Preencher os campos Send Quote
    E preencho o email 
    E digito um telefone 
    E escolho um nome de usuario
    E escolho uma senha 
    E confirmo a senha 
    E comento 
    Quando clico em Send
    Entao Verifico a mensagem "Sending e-mail success!"
    E clico no botao Ok
 
    