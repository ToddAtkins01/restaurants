package reviews.resturants;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantControler {
	@RequestMapping("/restaurant")
	public String showRestaurant(Model model) {
		Restaurant restaurant = new Restaurant("J. Alexander's", "American");
		model.addAttribute("modelRestaurant", restaurant);
		return "restaurant-template";

	}

	@RequestMapping("/allRestaurant")
	public String showAll(Model model) {
		Restaurant restaurant = new Restaurant("Bravo", "Italian");
		Restaurant restaurant2 = new Restaurant("Chile Verde", "Mexican");
		Restaurant restaurant3 = new Restaurant("Condado Taco's", "Mexican");
		Restaurant restaurant4 = new Restaurant("Outback Steak House", "American");
		Restaurant restaurant5 = new Restaurant("Buci Di Bepo", "Italian");
		Restaurant restaurant6 = new Restaurant("Sushi Time", "Asian");
		Restaurant restaurant7 = new Restaurant("House of Japan", "Asian");
		Collection<Restaurant> restaurants = Arrays.asList(restaurant, restaurant2, restaurant3, restaurant4, restaurant5, restaurant6, restaurant7);

		model.addAttribute("modelAllRestaurant", restaurants);
		return "restaurant-all-template";
	}
}