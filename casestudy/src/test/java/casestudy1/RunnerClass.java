package casestudy1;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="featureFiles", glue= { "casestudy1" } ,tags="@product")
public class RunnerClass {

}

