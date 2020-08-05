package com.raghav.managingtransactions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.util.Assert;

public class AppRunner implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(AppRunner.class);

	private final BookingService bookingService;

	//Constructor
	public AppRunner(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	@Override
	public void run(String... args) throws Exception {
		bookingService.book("Jatinder", "Raghav", "Satnam");
		Assert.isTrue(bookingService.findAllBookings().size()==3,
				"First booking should work with no problem");
		logger.info("Jatinder, Raghav, Shyam are booked");
		try {
			bookingService.book("Aman", "Divyesh");
		} catch (RuntimeException e) {
			logger.info("v--- The following exception is expect because 'Divyesh' is too " +
					"big for the DB ---v");
			logger.error(e.getMessage());
		}

		for(String person: bookingService.findAllBookings()) {
			logger.info("So far, " + person + " is booked.");
		}
		logger.info("You shouldn't see Aman or Divyesh. Divyesh violated DB constraints, "+ 
				" and Satnam was rolled back in the same TX");

		Assert.isTrue(bookingService.findAllBookings().size() == 3,
				"'Samuel' should have triggered a rollback");

		try {
			bookingService.book("Buddy", null);
		} catch (RuntimeException e) {
			logger.info("v--- The following exception is expect because null is not " +
					"valid for the DB ---v");
			logger.error(e.getMessage());
		}

		for (String person : bookingService.findAllBookings()) {
			logger.info("So far, " + person + " is booked.");
		}
		logger.info("You shouldn't see Buddy or null. null violated DB constraints, and " +
				"Buddy was rolled back in the same TX");
		Assert.isTrue(bookingService.findAllBookings().size() == 3,
				"'null' should have triggered a rollback");
	}

}
