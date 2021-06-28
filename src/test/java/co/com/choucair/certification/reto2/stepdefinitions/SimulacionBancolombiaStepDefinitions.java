package co.com.choucair.certification.reto2.stepdefinitions;

import co.com.choucair.certification.reto2.tasks.OpenUp;

import co.com.choucair.certification.reto2.tasks.PrincipalNo;
import co.com.choucair.certification.reto2.tasks.PrincipalSi;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class SimulacionBancolombiaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }




    @Given("^Ana simula la cuota de Tasa fija para un credito de libre inversion$")
    public void AnaSimulalaCuotaDeTasaFijaParaUnCreditoDeLibreInversion()  {

        OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage(),(PrincipalNo.OnPage()));

    }


    @When("^con un plazo de (\\d+), (\\d+) y (\\d+) meses con un valor de (\\d+) millones$")
    public void conUnPlazoDeYMesesConUnValorDeMillones(int arg1, int arg2, int arg3, int arg4)  {

    }



    @Then("^la simulacion de la cuota de Tasa fija para un credito de libre inversion fue exitosa$")
    public void laSimulacionDeLaCuotaDe_Tasa_fija_para_un_credito_de_libre_inversion_fue_exitosa()  {

    }






}
