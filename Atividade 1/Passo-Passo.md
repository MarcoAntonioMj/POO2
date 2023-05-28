# Sistema de Reservas de Voos
Este é um projeto Maven que implementa um sistema de reservas de voos. O sistema permite cadastrar voos, cadastrar passageiros, realizar reservas, cancelar reservas e consultar a disponibilidade de voos com base nas reservas existentes.

## Funcionalidades
O sistema possui as seguintes funcionalidades:

- Cadastrar Voos: Utilize o método cadastrarVoo(Voo voo) da classe SistemaDeReservas para cadastrar um voo. O objeto voo deve ser passado como parâmetro.
- Cadastrar Passageiros: Utilize o método cadastrarPassageiro(Passageiro passageiro) da classe SistemaDeReservas para cadastrar um passageiro. O objeto passageiro deve ser passado como parâmetro.
- Realizar Reservas: Utilize o método realizarReserva(Reserva reserva) da classe SistemaDeReservas para realizar uma reserva. O objeto reserva deve ser passado como parâmetro.
- Cancelar Reservas: Utilize o método cancelarReserva(Reserva reserva) da classe SistemaDeReservas para cancelar uma reserva. O objeto reserva deve ser passado como parâmetro.
- Consultar Disponibilidade: Utilize o método consultarDisponibilidade(Voo voo) da classe SistemaDeReservas para verificar a disponibilidade de lugares em um voo. O objeto voo deve ser passado como parâmetro. O método retorna true se houver lugares disponíveis e false caso contrário.
-
## Classes e Estrutura do Projeto
O projeto está estruturado da seguinte forma:

- Pasta model: Contém as classes do programa.
- Classe Passageiro: Representa um passageiro, com métodos para coletar o nome e a idade do passageiro.
- Classe Voo: Representa um voo, com variáveis para armazenar o número do voo, a origem, o destino e a capacidade.
- Classe Reserva: Representa uma reserva, com getters e setters para os atributos.
- Classe SistemaDeReservas: Classe principal do sistema, responsável por gerenciar os voos, passageiros e reservas. Possui métodos para cadastrar voos, cadastrar passageiros, realizar reservas, cancelar reservas e consultar a disponibilidade de voos.

## Uso do Projeto
Inicie o projeto Maven.
Utilize os métodos da classe SistemaDeReservas para interagir com o sistema.
Certifique-se de passar os objetos corretos como parâmetros para os métodos desejados.
As saídas dos métodos foram adicionadas para fornecer informações relevantes durante a execução.
Certifique-se de seguir a ordem correta para utilizar as funcionalidades do sistema. É recomendado revisar os commits anteriores para entender as etapas de desenvolvimento do projeto.

Observação: A classe SolicitarDados foi removida no último commit, pois não é mais necessária no momento.

Sinta-se à vontade para explorar o código fonte e realizar as operações de reservas de voos conforme sua necessidade.
