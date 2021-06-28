package co.com.choucair.certification.reto2.tasks;

import co.com.choucair.certification.reto2.userinterface.PrincipalNoPage;
import co.com.choucair.certification.reto2.userinterface.PrincipalSiPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PrincipalNo implements Task {

    public static PrincipalNo OnPage() {
        return Tasks.instrumented(PrincipalNo.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PrincipalSiPage.Button_Inicio),
                Click.on(PrincipalNoPage.ButtonNo),
                Enter.theValue("100000").into(PrincipalNoPage.Monto_Cuotas),
                Enter.theValue("48").into(PrincipalNoPage.Meses),
                Click.on(PrincipalNoPage.Fecha),
                Click.on(PrincipalNoPage.Fecha_Año),
                Click.on(PrincipalNoPage.Fecha_Mes),
                Click.on(PrincipalNoPage.Fecha_Dia),
                Click.on(PrincipalNoPage.Button_Simul)
        );

    }
}