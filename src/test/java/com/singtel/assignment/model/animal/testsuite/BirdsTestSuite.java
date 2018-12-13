package com.singtel.assignment.model.animal.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.singtel.assignment.model.animal.bird.BirdTest;
import com.singtel.assignment.model.animal.bird.ChickenTest;
import com.singtel.assignment.model.animal.bird.DuckTest;
import com.singtel.assignment.model.animal.bird.ParrotTest;
import com.singtel.assignment.model.animal.bird.RoosterTest;
import com.singtel.assignment.model.animal.bird.RoosterWithoutInheritanceTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BirdTest.class,
   ChickenTest.class,
   DuckTest.class,
   ParrotTest.class,
   RoosterTest.class,
   RoosterWithoutInheritanceTest.class
})

public class BirdsTestSuite {

}
