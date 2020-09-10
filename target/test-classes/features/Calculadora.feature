#language: pt
#enconding: UTF-8

@Calculadora
Funcionalidade: Calculadora mobile

@cenario1
Cenario: Somar dois numeros
	Quando eu digitar o numero "2"
	E eu acionar a tecla "plus"
	E eu digitar o numero "2"
	Entao a calculadora apresenta o resultado "4"
	
@cenario2
Cenario: Multiplicar dois numeros
	Quando eu digitar o numero "4"
	E eu acionar a tecla "multiply"
	E eu digitar o numero "4"
	Entao a calculadora apresenta o resultado "16"
	
@cenario3
Cenario: Subtrair dois numeros
	Quando eu digitar o numero "4"
	E eu acionar a tecla "minus"
	E eu digitar o numero "2"
	Entao a calculadora apresenta o resultado "2"
	
@cenario4
Cenario: Dividir dois numeros
	Quando eu digitar o numero "6"
	E eu acionar a tecla "divide"
	E eu digitar o numero "2"
	Entao a calculadora apresenta o resultado "3"

