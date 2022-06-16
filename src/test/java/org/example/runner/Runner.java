package org.example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//main//resources//Features",
        glue = "org.example.stepDefinitions",
         tags = "@regression",

        plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber.json" },
        dryRun = false

)
public class Runner {
//        plugin = {
//                "pretty",
//                        "html:target/cucumber.html",
//                        "json:target/cucumber.json",
//                        "junit:target/cukes.xml",
//                        "rerun:target/rerun.txt",
//
//        },

}
