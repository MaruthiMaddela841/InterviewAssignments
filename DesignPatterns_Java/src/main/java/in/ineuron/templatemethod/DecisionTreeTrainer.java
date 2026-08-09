package in.ineuron.templatemethod;

public class DecisionTreeTrainer extends ModelTrainer{

	@Override
	public void trainModel() {
		System.out.println("[DecisionTree] Building Decision Tree with max_depth=5");
	}

	@Override
	public void evaluateModel() {
		System.out.println("[DecisionTree] Computing classification report (precision/recall)");
	}

}
