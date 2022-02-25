package examQuestions.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class BrandImplementation{
	  public List<String> getModelName(List<Brand> list){
		    return list.stream().map(o->o.getModel()).collect(Collectors.toList());
		  }

		  public Brand getModelDetails(List<Brand> list, String model, int speed){
		    return list.stream().filter(o->o.getModel().equals(model)).findFirst().orElse(null);
		    
		  }
		}