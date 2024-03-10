package ca.sheridancollege.vutran.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.vutran.beans.Appointment;
import ca.sheridancollege.vutran.service.AppointmentService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/appointment")
@AllArgsConstructor
public class AppointmentController {
	private AppointmentService ar;
	
	@GetMapping(value= {"", "/"})
	public List<Appointment> getAllAppointment() {
		return ar.findAll();
	}
	
	@PostMapping(value= {"", "/"})
	public Appointment addAppointment(@RequestBody Appointment a) {
		return ar.save(a);
	}
}
