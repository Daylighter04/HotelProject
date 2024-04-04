package com.hotel.demo;

import com.hotel.demo.repository.HotelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Service
public class HotelApplication {
	private final HotelRepository hotelRepository;

	public HotelApplication(HotelRepository hoteleiroRepository) {
		this.hotelRepository = hoteleiroRepository;
	}

    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);
    }

    public HotelRepository findById(long id) throws HotelNotFoundException {
		return (HotelRepository) hotelRepository.findById(id)
				.orElseThrow(() -> new HotelNotFoundException("Hoteleiro não encontrado com o ID: " + id));
	}

	private static class HotelNotFoundException extends Exception {
		public HotelNotFoundException(String string) {
		}
	}
}
