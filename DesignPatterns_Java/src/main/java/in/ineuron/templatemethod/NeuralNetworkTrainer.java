package in.ineuron.templatemethod;

public class NeuralNetworkTrainer extends ModelTrainer{

	@Override
	public void trainModel() {
		System.out.println("[NeuralNetwork] Training neural network for 100 epochs");
	}

	@Override
	public void evaluateModel() {
		System.out.println("[NeuralNetwork] Evaluating accuracy and loss on validating set");
	}
	
	@Override
	public void saveModel() {
		System.out.println("[NeuralNetwork] Serializing Network heights to .h5 file");
	}

}
