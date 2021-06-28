package co.com.choucair.certification.reto2.tasks;

import co.com.choucair.certification.reto2.userinterface.PrincipalSiPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class PrincipalSi implements Task {

    public static PrincipalSi OnThePage(){
        return Tasks.instrumented(PrincipalSi.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(PrincipalSiPage.Button_Inicio),
                Click.on(PrincipalSiPage.Buttonsi),
                Enter.theValue("10000000").into(PrincipalSiPage.MONTO),
                Enter.theValue("48").into(PrincipalSiPage.MESES),
                Click.on(PrincipalSiPage.Fecha),
                Click.on(PrincipalSiPage.Fecha_Año),
                Click.on(PrincipalSiPage.Fecha_Mes),
                Click.on(PrincipalSiPage.Fecha_Dia),
                Enter.theValue("64").into(PrincipalSiPage.MESES),
                Click.on(PrincipalSiPage.Button_Simul)
        );

    }



}
