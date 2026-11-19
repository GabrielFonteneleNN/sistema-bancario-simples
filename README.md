## SISTEMA BANCÁRIO SIMPLES

Projeto desenvolvido em Java com foco na prática, fixação e aprendizado
dos conceitos de Lógica de Programação Orientada a Objetos (POO).

---

### FUNCIONALIDADES DO SISTEMA

**-Depósito:** Adicionar saldo à conta bancária.

**-Saque:** Realizar o saque do saldo disponível na conta.

OBS: Esse sistema tem um saque inteligênte. Caso o saldo seja insuficiente
para o saque, o sistema irá informar ao usuário que sua conta tem saldo insuficiente
e irá perguntar se ele deseja utilizar o cheque especial disponível 
para realizar o saque.

**-Pagamento de Boleto:**

Utiliza a mesma lógica e estrutura do método de saque. Caso saldo seja insuficiênte, o sistema irá perguntar se o usuário deseja utilizar o cheque 
disponivel para realizar o pagamento.

-Verificação de Cheque Especial em uso:

Idêntifica se a conta utilizou o limite emergencial e calcula a cobrança de 20% em cima do valor utilizado do cheque especial.

---

### CONCEITOS UTILIZADOS

Encapsulamento: Atributos protegidos como private com controle de acesso via getters e métodos específicos.

Imutabilidade com final: Preservação do valor original do cheque especial para histórico e cálculo de taxas.

Reutilização de Código: Método pagarBoleto delegando execução para o método saque.

Entrada Dinâmica: Interação em tempo real com o usuário através de java.util.Scanner.