package classes;


import junit.framework.TestCase;


import jfame.MultiPlayer;
import jfame.PlayingPage;
import jfame.SinglePlayer;

public class TestStorage extends TestCase {
	Storage strTest = new Storage();
	SinglePlayer sPlayer;
	PlayingPage pPlayer;
	MultiPlayer mPlayer;
	Controls ctr;
	Artifical_Intelligence aiObj;

	public void testStorageConstructor() {
		try{
			new Storage();
		}catch(Exception e){
			fail(e.getMessage());
		}
	}
	public void testgetSingleObject(){
		strTest.setSinglePlayerObject(sPlayer);
		assertEquals(sPlayer,strTest.getSingleObject());
	}
	public void testsetSinglePlayerObject(){
		SinglePlayer singleP = null;
		strTest.setSinglePlayerObject(singleP);
		assertEquals(sPlayer,singleP);
	}
	public void testgetPlayingPageObject(){
		strTest.setPlayingPageObject(pPlayer);
		assertEquals(pPlayer,strTest.getPlayingPageObject());
	}
	public void testsetPlayingPageObject(){
		PlayingPage ptr = null;
		strTest.setPlayingPageObject(ptr);
		assertEquals(ptr,pPlayer);
	}
	public void testgetMultiPlayerObject(){
		strTest.setMultiPlayerObject(mPlayer);
		assertEquals(mPlayer,strTest.getMultiPlayerObject());
	}
	public void testsetMultiPlayerObject(){
		MultiPlayer ptr = null;
		strTest.setMultiPlayerObject(ptr);
		assertEquals(ptr,mPlayer);
	}
	public void testgetControlsObject(){
		strTest.setControlsObject(ctr);
		assertEquals(ctr,strTest.getControlsObject());
	}
	public void testsetControlsObject(){
		Controls contr = null;
		strTest.setControlsObject(contr);
		assertEquals(contr,ctr);
	}
	public void testgetArtifical_IntelligenceObject(){
		strTest.setArtifical_IntelligenceObject(aiObj);
		assertEquals(aiObj,strTest.getArtifical_IntelligenceObject());
	}
	public void testsetArtifical_IntelligenceObject(){
		Artifical_Intelligence ai = null;
		strTest.setArtifical_IntelligenceObject(ai);
		assertEquals(ai,aiObj);
	}
	public void testgetSingleMultiFlag(){
		strTest.setSingleMultiFlag(true);
		assertEquals(true,strTest.getSingleMultiFlag());
	}
	public void testsetSingleMultiFlag(){
		boolean flag = true;
		strTest.setSingleMultiFlag(true);
		assertEquals(true,flag);
	}
}
