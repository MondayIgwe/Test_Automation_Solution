package com.starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.serenity.pageObjects.testBaseSeup;
import com.starter.steps.MathWizSteps;

import java_cup.runtime.Symbol;

@RunWith(SerenityRunner.class)
@Narrative(text={"Maths is important."})
public class WhenAddingNumbers  {

	String s = ""+"";
    @Steps
    MathWizSteps michael;

    @Test
    public void addingSums()throws Exception {
        // Given
        michael.startsWith(1);

        // When
        Object result = michael.adds(2);
        System.out.println("The result is "+result);

        // Then
        michael.shouldHave(3);
        
        michael.countries(234,"Nigeria");
    }
}
