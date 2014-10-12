package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@Entity
class Booking {

	private String bookingName;

	@Id
	@GeneratedValue
	private long id;

	public String getBookingName() {
		return bookingName;
	}

	public long getId() {
		return id;
	}

	Booking() {
	}

	@Override
	public String toString() {
		return "Booking{" +
				"bookingName='" + bookingName + '\'' +
				", id=" + id +
				'}';
	}

	public Booking(String bookingName) {
		this.bookingName = bookingName;
	}
}

/**
 * Spring Data JPA-powered <em>repository</em> interface.
 * Supports common operations like {@link #findAll()} and {@link #save(Object)} against JPA entities.
 * This particular repository deals in {@link demo.Booking booking} objects.
 */
interface BookingRepository extends JpaRepository<Booking, Long> {
	Collection<Booking> findByBookingName(@Param("bookingName") String bookingName);
}

/**
 * Handles REST-API calls for {@link demo.Booking booking data}.
 */
@RestController
@RequestMapping("/bookings")
class BookingRestController {

	@Autowired
	BookingRepository bookingRepository;

	@RequestMapping(method = RequestMethod.POST)
	Booking add(@RequestBody Booking b) {
		return this.bookingRepository.save(b);
	}

	@RequestMapping(method = RequestMethod.GET)
	Collection<Booking> all() {
		return this.bookingRepository.findAll();
	}
}
