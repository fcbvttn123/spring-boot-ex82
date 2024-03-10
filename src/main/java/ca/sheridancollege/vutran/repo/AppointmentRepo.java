package ca.sheridancollege.vutran.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.vutran.beans.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
	public List<Appointment> findByTitle(String title);
}
