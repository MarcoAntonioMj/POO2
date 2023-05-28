### feat: Iniciando projeto - Exercício 1

Neste commit, iniciei um novo projeto Maven para a primeira atividade.

### feat: Novas classes

Neste commit, adicionei uma nova pasta chamada "model" e incluí as três classes do programa.

### feat: Adicionando métodos na classe Passageiro

Neste commit, adicionei novos métodos à classe Passageiro para coletar o nome e a idade do passageiro.

### feat: Adicionando variáveis na classe Voo

Neste commit, adicionei novas variáveis à classe Voo:

- private int numero;
- private String origem;
- private String destino;
- private int capacidade;

### feat: Arrumando lógica nas classes Passageiro e Voo

Neste commit, adicionei os getters e setters necessários às classes Passageiro e Voo.

### feat: Criando classe Reserva

Neste commit, criei a classe Reserva e adicionei seus respectivos getters e setters.

### feat: Começando classe principal - SistemaDeReservas

Neste commit, iniciei a implementação da classe principal SistemaDeReservas. Foram adicionadas as variáveis de instância voos, passageiros e reservas. Além disso, implementei o construtor padrão que inicializa as listas com objetos do tipo ArrayList.

Agora, posso prosseguir com os próximos passos, que envolvem a implementação dos métodos necessários na classe SistemaDeReservas para cadastrar voos, cadastrar passageiros, realizar reservas, cancelar reservas e consultar disponibilidade.

### refactor: Excluída classe desnecessária - Passageiros

Neste commit, removi a classe SolicitarDados, pois ela não será usada no momento.

### feat: Adicionando novos métodos na classe SistemaDeReservas

Neste commit, adicionei os seguintes métodos à classe SistemaDeReservas:

- cadastrarVoo(Voo voo): Este método recebe um objeto do tipo Voo como parâmetro e o adiciona à lista de voos (voos).
- cadastrarPassageiro(Passageiro passageiro): Este método recebe um objeto do tipo Passageiro como parâmetro e o adiciona à lista de passageiros (passageiros).
- realizarReserva(Reserva reserva): Este método recebe um objeto do tipo Reserva como parâmetro e o adiciona à lista de reservas (reservas).
- cancelarReserva(Reserva reserva): Este método recebe um objeto do tipo Reserva como parâmetro e o remove da lista de reservas (reservas).
- consultarDisponibilidade(Voo voo): Este método recebe um objeto do tipo Voo como parâmetro. Ele verifica a disponibilidade com base nas reservas existentes para o voo fornecido. - Retorna true se houver lugares disponíveis e false caso contrário.
- Esses métodos adicionados permitem cadastrar voos, cadastrar passageiros, realizar reservas, cancelar reservas e consultar a disponibilidade de voos com base nas reservas - - existentes.

A classe SistemaDeReservas está pronta para ser utilizada para manipular os voos, passageiros e reservas. Certifique-se de chamar esses métodos com os objetos corretos para realizar as operações desejadas.


## refactor : add mensagem de saidas nos metodos
Refatoração do código para melhor legibilidade e modularidade.
