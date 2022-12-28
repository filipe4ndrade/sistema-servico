# Sistema de Serviço

João Pinheiro, jardineiro na cidade de Nova Esperança, está precisando de uma página/sistema WEB para registar os
seus serviços realizados. Implemente um sistema utilizando ReactJS no front-end com uma API Spring no Back-end.

As regras que você deverá implementar neste momento são as seguintes:

1- Cadastro de serviços realizados (front e back) com os seguintes atributos: nome do cliente, data de início, data de término,
   descrição do serviço, valor do serviço, valor pago, data do pagamento e status ("pendente", "realizado" ou "canceladp");

2- Opções para inserir, alterar e excluir serviços no banco de dados;

3- Botão para "listar todos os serviços" e aqueles que esão com "pagamento pendente". Pagamentos pendentes podem ser aqueles sem o 
preenchimento do campo valor pago ou valor pago é igual a 0 ou sem preenchimento da data de pagamento - você deverá decidir a regra;
