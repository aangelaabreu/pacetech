algoritmo "conversor"
// Função :
// Autor :
// Data : 10/03/2022
// Seção de Declarações 
var
menuOpcao, hora: literal
vTemp, aux: real
vetorTemp: vetor[1..4] de real
vetorHora: vetor[1..4] de literal
i, j: inteiro
procedimento lerCelsius()
inicio
   para i de 1 ate 4 faca
      escreval ("Digite a temperatura em Celsius:")
      leia(vTemp)
      vetorTemp[i] <- vTemp
      escreval ("Digite a hora da medição:")
      leia(hora)
      vetorHora[i] <- hora
   fimpara
   
   ordenar()

   para i de 1 ate 4 faca
      escreval ("Temperatura ", vetorTemp[i], " graus Celsius, registrada as ", vetorHora[i], "h corresponde a ", vetorTemp[i] * 1.8 + 32," graus Fahrenheit", vetorTemp[i], vetorHora[i], vetorTemp[i] * 1.8 + 32)
   fimpara
fimprocedimento

procedimento lerFahrenheit()
inicio
   para i de 1 ate 4 faca
      escreval ("Digite a temperatura em Fahrenheit:")
      leia(vTemp)
      vetorTemp[i] <- vTemp
      escreval ("Digite a hora da medição:")
      leia(hora)
      vetorHora[i] <- hora
   fimpara

   ordenar()

   para i de 1 ate 4 faca
      escreval ("Temperatura ", vetorTemp[i], " graus Fahrenheit, registrada as ", vetorHora[i], "h corresponde a ", (vetorTemp[i] - 32)/1.8, " graus Celsius")
   fimpara
fimprocedimento

procedimento ordenar()
inicio
   para i de 1 ate 4 faca
        para j de 1 ate 4 faca
           se vetorTemp[i] < vetorTemp[j] entao
              aux <- vetorTemp[j]
              vetorTemp[j] <- vetorTemp[i]
              vetorTemp[i] <- aux
           fimse
        fimpara
   fimpara
fimprocedimento

inicio
escreval ("Escolha a conversão de temperatura:")
escreval ("1- Celsius para Fahrenheit")
escreval ("2- Fahrenheit para Celsius")
escreval ("3- Sair")
leia(menuOpcao)

se menuOpcao = "1" entao
   lerCelsius()
entao
se menuOpcao = "2" entao
   lerFahrenheit()
fimse
fimse
fimalgoritmo
