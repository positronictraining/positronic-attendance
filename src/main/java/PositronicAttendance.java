import io.orchestrate.client.Client;
import io.orchestrate.client.OrchestrateClient;

public class PositronicAttendance {
	Client orchestrate;
	public PositronicAttendance(String apiKey) {
		orchestrate = OrchestrateClient.builder(apiKey).build();
	}
}
