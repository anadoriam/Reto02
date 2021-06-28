
  @stories
  Feature: Simulador de creditos
   Como Verificar el funcionamiento de la pantalla de simulación de créditos expuesta por el grupo Bancolombia, en cuanto a la presentación de los valores calculados, campos: “Valor de la Cuota”.

    @scenario1
    Scenario: Tasa fija para un credito de libre inversion
      Given Ana simula la cuota de Tasa fija para un credito de libre inversion
      When  con un plazo de 36, 48 y 60 meses con un valor de 10 millones
      Then  la simulacion de la cuota de Tasa fija para un credito de libre inversion fue exitosa