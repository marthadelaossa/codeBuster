package com.codebuster.www.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
         features = "src/test/resources/features/",
        glue = "com.codebuster.www.stepDefinitions",
        tags="@CASO0001",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CodeBusterRunner {
}
