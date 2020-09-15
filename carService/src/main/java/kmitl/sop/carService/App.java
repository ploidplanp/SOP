package kmitl.sop.carService;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
    
    ArrayList<Car> cars = new ArrayList<Car>();
    
    @RequestMapping(value = "/get")
	public ResponseEntity<ArrayList<Car>> getAllCar() {
		return new ResponseEntity<ArrayList<Car>>(cars, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/car", method = RequestMethod.POST)
	public ResponseEntity<ArrayList<Car>> createCar(@RequestBody Car dataCars) {
		cars.add(dataCars);
		return new ResponseEntity<ArrayList<Car>>(cars, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/car/{index}", method = RequestMethod.PATCH)
	public ResponseEntity<ArrayList<Car>> editCar(@RequestBody Car datacar, @PathVariable("index") int index) {
		cars.set(index - 1, datacar);
		return new ResponseEntity<ArrayList<Car>>(cars, HttpStatus.OK);
	}
    
    @RequestMapping(value = "/car/{index}")
	public ResponseEntity<Car> getCar(@PathVariable("index") int index) {
		return new ResponseEntity<Car>(cars.get(index - 1), HttpStatus.OK);
	}
    
    @RequestMapping(value = "/car/{index}", method = RequestMethod.DELETE)
	public ResponseEntity<ArrayList<Car>> deleteCar(@PathVariable("index") int index) {
		cars.remove(index - 1);
		return new ResponseEntity<ArrayList<Car>>(cars, HttpStatus.OK);
	}
}
