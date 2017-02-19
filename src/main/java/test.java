import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

import Client.ActivityClient;

public class test {

	@Test
	public void testGetActivity() {
		ActivityClient activityClient = new ActivityClient();
		assertThat(activityClient.get("1")).hasFieldOrProperty("name");
	}
}
