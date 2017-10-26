package reviews.resturants;

import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestaurantControler {

	@Resource
	private ReviewRepository reviews;

	@RequestMapping("/restaurant")
	public String showRestaurant(Model model) {

		model.addAttribute("modelRestaurant", restaurant);
		return "restaurant-template";

	}

	@RequestMapping("/allRestaurant")
	public String showAll(Model model) {

		Collection<Review> restaurants = reviews.findAll();

		model.addAttribute("modelAllRestaurant", restaurants);
		return "restaurant-all-template";
	}

}