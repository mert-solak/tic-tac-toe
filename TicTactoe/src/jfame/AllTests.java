package jfame;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import classes.TestArtifical_Intelligence;
import classes.TestControls;
import classes.TestStorage;

@RunWith(Suite.class)
@SuiteClasses({ TestPlayingPage.class, TestMainPage.class, TestMultiPlayer.class, TestSinglePlayer.class, TestStorage.class, TestControls.class, TestArtifical_Intelligence.class })
public class AllTests {

}
