package com.eccomers.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import com.eccomers.utils.BeforeSuite;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/ScenariosWeb.feature",
        glue = {"com/eccomers/stepDefinitios", "com/eccomers/hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
        },
        stepNotifications = true,
        monochrome = true,
        tags = "@Login2"
)


public class RunnerP {
    @BeforeSuite
    public static void test() {
    }
}
