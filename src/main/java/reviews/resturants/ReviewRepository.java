package reviews.resturants;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {

	public ReviewRepository() {

		Review restaurant = new Review(10000000000000001L, "Bravo Cucina Italiana", "/images/BravoCrosswoods.jpg",
				"Italian",
				"Bring your appetite and your zest for life to our BRAVO Cucina Italiana Italian Restaurant at our Crosswoods location, and you can experience your own little slice of Italy right here in Columbus Ohio. Enjoy traditional classics with a twist in an elegant, family-friendly setting that's perfect for any occasion. It's all right here waiting at BRAVO Cucina Italiana, the best Italian Restaurant in Columbus.",
				"(614) 888-3881", "7470 Vantage Drive\r\n" + "Columbus, OH 43235",
				"Mon-Thu: 11:30am-9:30pm \r\n" + "Fri & Sat: 11:30am-10pm \r\n" + "Sun: 11am-9pm");

		reviews.put(10000000000000001L, restaurant);

		Review restaurant1 = new Review(10000000000000002L, "J. Alexander's", " ", "American", null, null, null, null);
		Review restaurant2 = new Review(10000000000000003L, "Chile Verde", " ", "Mexican", null, null, null, null);
		Review restaurant3 = new Review(10000000000000004L, "Condado Taco's", " ", "Mexican", null, null, null, null);
		Review restaurant4 = new Review(10000000000000005L, "Outback Steak House", " ", "American", null, null, null,
				null);
		Review restaurant5 = new Review(10000000000000006L, "Buci Di Bepo", " ", "American", null, null, null, null);
		Review restaurant6 = new Review(10000000000000007L, "Sushi Time", " ", "Asian", null, null, null, null);
		Review restaurant7 = new Review(10000000000000008L, "House of Japan", " ", "Asian", null, null, null, null);

	}

	Map<Long, Review> reviews = new HashMap<>();

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Collection<Review> findOne(Long id) {
		return reviews.values();

	}
}