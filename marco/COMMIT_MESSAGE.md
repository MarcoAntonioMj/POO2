feat : iniciando projeto exerc 1

Criando projeto maven para a primeira atividade

feat : novas classes
nesse commit criei uma nova pasta chamada model e add as 3 classes do programa

feat : Adicionando classes no Passgaeiro
Criei novas classes no arquivo passageiro coleta nome e coleta idade

feat : Adicionando classes no Voo
Add novas  variaveis classe voo
    private int numero;
    private String origem;
    private String destino;
    private int capacidade;

feat : arrumando logica classe pesso e voo

criei get e settes para as classes



feat : Criando classe Reserva
foi criado a classe reserva com seus get e setters correspondente.


Feat : começando classe principal SistemaDeReserv
Nos três primeiros passos, eu criei a classe SistemaDeReservas no pacote com.atividade1. Em seguida, declarei três variáveis de instância: voos, passageiros e reservas. Essas variáveis são listas do tipo ArrayList, que serão usadas para armazenar os objetos de voos, passageiros e reservas.

Além disso, implementei um construtor padrão para a classe SistemaDeReservas, onde as listas foram inicializadas com objetos ArrayList.

Agora posso prosseguir com os próximos passos, que envolvem a implementação dos métodos necessários na classe SistemaDeReservas para cadastrar voos, cadastrar passageiros, realizar reservas, cancelar reservas e consultar disponibilidade.

Refactor : excluido classe desnce Passageiros :
Retirei a classe Solicitardados ja que ela não vai ser usada agora.


Feat : add novos metodos na classe Sistema de reservas :
Eu adicionei os seguintes métodos à classe SistemaDeReservas:

cadastrarVoo(Voo voo): Este método recebe um objeto do tipo Voo como parâmetro e o adiciona à lista de voos (voos).
cadastrarPassageiro(Passageiro passageiro): Este método recebe um objeto do tipo Passageiro como parâmetro e o adiciona à lista de passageiros (passageiros).
realizarReserva(Reserva reserva): Este método recebe um objeto do tipo Reserva como parâmetro e o adiciona à lista de reservas (reservas).
cancelarReserva(Reserva reserva): Este método recebe um objeto do tipo Reserva como parâmetro e o remove da lista de reservas (reservas).
consultarDisponibilidade(Voo voo): Este método recebe um objeto do tipo Voo como parâmetro. Ele verifica a disponibilidade com base nas reservas existentes para o voo fornecido. Ele retorna true se houver lugares disponíveis e false caso contrário.
Esses métodos adicionados permitem cadastrar voos, cadastrar passageiros, realizar reservas, cancelar reservas e consultar a disponibilidade de voos com base nas reservas existentes.

A classe SistemaDeReservas está pronta para ser utilizada para manipular os voos, passageiros e reservas. Certifique-se de chamar esses métodos com os objetos corretos para realizar as operações desejadas.
