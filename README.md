## Locadora de Veículos

Repositório destinado à entrega da atividade prática da disciplina de **Modelagem de Padrões de Projeto**, ministrada pela professora **Cristiane Palomar**.

## Sobre a Atividade
O objetivo deste trabalho foi desenvolver o back-end, o front-end e o diagrama de classes para um sistema de locadora de veículos, garantindo a aplicação de padrões de projeto. O sistema cria veículos de diferentes categorias, monta pacotes de locação completos e controla a frota disponível.

Para resolver o contexto do problema, a arquitetura utilizou:
***Abstract Factory:** Para montar os pacotes de locação completos, unindo o veículo escolhido, seguro e assistência 24h.
***Factory Method:** Para instanciar as categorias específicas de veículos, que incluem Carros, Motos, Caminhões e Vans.
***Singleton:** Aplicado na classe `ControleFrota` para manter o inventário global de veículos disponíveis.

## O que foi entregue neste repositório:
- **Diagrama de Classes:** Representação visual da arquitetura, detalhando as interfaces e as classes concretas dos padrões Singleton, Factory Method e Abstract Factory.
- **Back-end:** Código estruturando a regra de negócios, a criação dos veículos e a validação de disponibilidade da frota. O sistema roda inteiramente em memória, sem acesso a banco.
- **Front-end:** Interface do usuário para interação com o sistema, escolha da categoria do veículo e seleção do tipo de pacote (Econômico ou Premium).

## Tecnologias Utilizadas:
- *JAVA*
- *Draw.io*

## Equipe e Responsabilidades:
- **Rafaela Riganti:** Diagrama de Classes e Back-end.
- **Sophia Araujo:** Integração dos padrões Singleton e Factory.
- **Maria Julia Loureiro:** Front-end.
