package ca.sheridancollege.vutran.service;

import java.util.List;

import ca.sheridancollege.vutran.beans.Appointment;

public interface AppointmentService {
	public List<Appointment> findAll();
	public Appointment findById(Long id);
	public List<Appointment> findByTitle(String title);
	public Appointment save(Appointment a);
}
