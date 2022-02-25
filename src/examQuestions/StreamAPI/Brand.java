package examQuestions.StreamAPI;

public class Brand{
	  String model;
	  int speed;
	  
	  public Brand(String model, int speed){
	    this.model = model;
	    this.speed = speed;
	  }
	  
	  public void setModel(String model) {
	    this.model = model;
	  }

	  public void setSpeed(int speed) {
	    this.speed = speed;
	  }

	  public String getModel() {
	    return model;
	  }

	  public int getSpeed() {
	    return speed;
	  }
	  
	      @Override
	    public String toString() {
	        return "Brand{" +
	                "model='" + model + '\'' +
	                ", speed=" + speed +
	                '}';
	    }
	}