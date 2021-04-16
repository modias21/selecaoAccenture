package Runners;

import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue = "Steps",
        plugin = {"pretty", "html:target/report-html"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTest {}
