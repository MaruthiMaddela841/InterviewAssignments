package in.ineuron.templatemethod;

public abstract class ModelTrainer {

	final void trainPipeLine(String dataPath) {
		loadData(dataPath);
		preProcessData();
		trainModel();
		evaluateModel();
		saveModel();
	}

	public void loadData(String dataPath) {
		System.out.println("[Common] Loading Dataset from "+dataPath);
	}

	public void preProcessData() {
		System.out.println("[Common] Splitting into train/test and normalizing");
	}

	public abstract void trainModel();

	public abstract void evaluateModel();

	public void saveModel() {
		System.out.println("[Common] Saving model to disk as default");
	}
}
