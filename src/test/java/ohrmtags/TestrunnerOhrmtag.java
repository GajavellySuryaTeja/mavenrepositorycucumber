package ohrmtags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Ohrmfeature",
glue ="ohrmtags" ,
dryRun = false,
monochrome=true,
tags="@Test1 and @Test2")
public class TestrunnerOhrmtag {

}
