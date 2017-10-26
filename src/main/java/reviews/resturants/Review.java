package reviews.resturants;

public class Review {

	private long id;
	private String title;
	private String image;
	private String reviewCategory;
	private String content;
	private String phoneNumber;
	private String address;
	private String hoursOfOperation;

	public long getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public String getContent() {
		return content;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public String getTitle() {
		return title;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public Review(long id, String title, String image, String reviewCategory, String content, String phoneNumber,
			String address, String hoursOfOperation) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.hoursOfOperation = hoursOfOperation;
	}

}
