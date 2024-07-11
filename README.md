# Calculadora Básica
## Descrição
Este é um projeto de uma calculadora básica desenvolvida em Java utilizando Spring Boot. A calculadora permite realizar operações aritméticas simples, como adição, subtração, multiplicação e divisão, através de uma API REST.

## Funcionalidades
* Adição: Somar dois números.

* Subtração: Subtrair o segundo número do primeiro.

* Multiplicação: Multiplicar dois números.
* Divisão: Dividir o primeiro número pelo segundo, com validação para divisão por zero.
## Estrutura do Projeto
#### O projeto segue a arquitetura Model-View-Controller (MVC) e está organizado da seguinte forma:
* Model: Contém a classe Operacao, que representa uma operação aritmética.

* Service: Contém a classe CalculadoraService, responsável pela lógica de cálculo.

* Controller: Contém a classe CalculadoraController, que expõe os endpoints REST.

## Dependências
* Spring web

## Como Executar
* Clone o repositório

![image](https://github.com/MatosRafael/Calculadora-basica/assets/160555727/a1e4bb79-aefa-4aae-881c-75f7294931c6)

git clone https://github.com/MatosRafael/Calculadora-basica.git

* Navegue até o diretório do projeto:

![image](https://github.com/MatosRafael/Calculadora-basica/assets/160555727/482e4c96-e875-40bc-948c-215ea7d5ef6d)

cd Calculadora-basica

* Compile e execute o projeto:

![image](https://github.com/MatosRafael/Calculadora-basica/assets/160555727/a54b8c3a-0854-4cbd-9925-335d7d9f6450)

./mvnw spring-boot:run

* A API estará disponível em http://localhost:8080.

## Endpoints da API
* Calcular
* Descrição: Realiza a operação aritmética especificada.
* URL: /calculadora/calcular
* Método: POST
* Corpo da Requisição:

![image](https://github.com/MatosRafael/Calculadora-basica/assets/160555727/e5c54c83-903c-45ab-b7a4-27d8840cd70a)

* Exemplo de Resposta:

![image](https://github.com/MatosRafael/Calculadora-basica/assets/160555727/3bd1fb63-95a9-4bb6-99f2-2c3ddcf71cf7)





