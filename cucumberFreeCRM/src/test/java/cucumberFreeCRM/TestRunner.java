package cucumberFreeCRM;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features/freeCRM.feature",glue= {"cucumberFreeCRM"},
monochrome=true,
plugin= {"pretty","html:reports/htmlReportCRM/html",
"json:reports/JsonReportCRM/Cucumber.json",
"junit:reports/junitReportCRM/report.xml"})
public class TestRunner 
{

}