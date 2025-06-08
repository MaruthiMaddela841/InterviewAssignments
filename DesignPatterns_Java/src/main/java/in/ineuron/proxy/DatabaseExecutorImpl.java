package in.ineuron.proxy;

public class DatabaseExecutorImpl implements DatabaseExecutor {

	@Override
	public void executeDatabase(String query) {
		
		System.out.println(query);

	}

}
