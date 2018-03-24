package ruuner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features",glue={"stepDefinations"})
public class TestRunner {

}
