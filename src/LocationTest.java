import org.junit.Assert;
import org.junit.Test;

public class LocationTest {

	@Test
	public void testLocations() {
		Assert.assertEquals("Location values incorrect", Location.KITCHEN, Location.valueOf("KITCHEN"));
		Assert.assertEquals("Location values incorrect", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		Assert.assertEquals("Location values incorrect", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
		Assert.assertEquals("Location values incorrect", Location.BALLROOM, Location.valueOf("BALLROOM"));
		Assert.assertEquals("Location values incorrect", Location.STUDY, Location.valueOf("STUDY"));
		Assert.assertEquals("Location values incorrect", Location.HALL, Location.valueOf("HALL"));
		Assert.assertEquals("Location values incorrect", Location.LOUNGE, Location.valueOf("LOUNGE"));
		Assert.assertEquals("Location values incorrect", Location.LIBRARY, Location.valueOf("LIBRARY"));
		Assert.assertEquals("Location values incorrect", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
	}

}
