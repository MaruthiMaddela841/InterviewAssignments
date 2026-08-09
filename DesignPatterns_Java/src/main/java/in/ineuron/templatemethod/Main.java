package in.ineuron.templatemethod;

public class Main {

	public static void main(String[] args) {
		
		// To design the skeleton of an algorithm, for an operation
		// defering some steps to subclasses. Template method let
		// subclasses redefine certain steps of an algorithm without
		// changing the algorithm structure
		System.out.println("==========Neural Network===========");
		ModelTrainer neuralTrainer= new NeuralNetworkTrainer();
		neuralTrainer.trainPipeLine("data/images/");
		
		System.out.println("==========Neural Network===========");
		ModelTrainer decisionTrainer= new DecisionTreeTrainer();
		decisionTrainer.trainPipeLine("data/iris.csv/");

	}

}
