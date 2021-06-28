package co.com.choucair.certification.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalSiPage extends PageObject {

    public static final Target Button_Inicio= Target.the("Boton Continuar")
            .located(By.xpath("//BUTTON[@id='boton-seleccion-tarjeta']"));

    public static final Target Buttonsi = Target.the("Seleccione SI")
            .located(By.xpath("(//LABEL[@class='mat-radio-label'])[1]"));

    public static final Target MONTO = Target.the("Digite un monto")
            .located(By.xpath("//INPUT[@id='valor-simulacion']"));

    public static final Target MESES = Target.the("Digite los meses de plazo entre 48 y 84")
            .located(By.xpath("//INPUT[@id='valor-plazo']"));

    public static final Target Fecha= Target.the("Click en fecha")
            .located(By.xpath("//INPUT[@id='campo-fecha']"));

    public static final Target Fecha_Año = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 1985 ']"));

    public static final Target Fecha_Mes = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' JUL ']"));

    public static final Target Fecha_Dia = Target.the("Digite una fecha debe ser mayor de 18 y 84 años")
            .located(By.xpath("//DIV[@class='mat-calendar-body-cell-content'][text()=' 24 ']"));


    public static final Target Button_Simul = Target.the("Boton Validar")
            .located(By.xpath("//BUTTON[@id='boton-simular']"));




}
