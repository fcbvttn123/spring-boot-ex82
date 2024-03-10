package ca.sheridancollege.vutran.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.vutran.beans.Appointment;
import ca.sheridancollege.vutran.repo.AppointmentRepo;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppointmentServiceImplementation implements AppointmentService {
	
	private AppointmentRepo ar;

	@Override
	public List<Appointment> findAll() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	@Override
	public Appointment findById(Long id) {
		// TODO Auto-generated method stub
		return ar.findById(id).get();
	}

	@Override
	public List<Appointment> findByTitle(String title) {
		// TODO Auto-generated method stub
		return ar.findByTitle(title);
	}

	@Override
	public Appointment save(Appointment a) {
		// TODO Auto-generated method stub
		return ar.save(a);
	}

}
