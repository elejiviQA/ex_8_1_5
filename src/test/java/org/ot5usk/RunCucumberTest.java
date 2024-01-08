package org.ot5usk;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"org.ot5usk.steps"},
        tags = "@all") // @all, @browse, @cart, @search, @purchase, not @purchase
public class RunCucumberTest {
}
