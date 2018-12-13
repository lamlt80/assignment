package com.singtel.assignment.model.animal.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.singtel.assignment.model.animal.fish.ClownfishTest;
import com.singtel.assignment.model.animal.fish.DolphinTest;
import com.singtel.assignment.model.animal.fish.FishTest;
import com.singtel.assignment.model.animal.fish.SharkTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   FishTest.class,
   ClownfishTest.class,
   SharkTest.class,
   DolphinTest.class
})
public class FishTestSuite {

}
