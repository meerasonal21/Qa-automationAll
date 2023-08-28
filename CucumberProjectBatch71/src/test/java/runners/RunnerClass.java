package runners;
import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\vivek\\Desktop\\Java tutorial\\CucumberProjectBatch71\\src\\test\\java\\features"},//the path of the feature files
		glue={"stepdefinations"}//step Defination Package Name
		)
public class RunnerClass {

}
