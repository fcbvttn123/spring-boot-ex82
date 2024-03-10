package ca.sheridancollege.vutran.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private LocalDate date;
	// 2024-03-09
	private LocalTime time;
	// 10:15:30
}



/*
[
 {
   "id": 1,
   "title": "Appointment 1",
   "date": "2024-03-01",
   "time": "10:15:30"
 },
 {
   "id": 2,
   "title": "Appointment 2",
   "date": "2024-03-02",
   "time": "11:15:30"
 },
 {
   "id": 3,
   "title": "Appointment 3",
   "date": "2024-03-03",
   "time": "12:15:30"
 },
 {
   "id": 4,
   "title": "Appointment 4",
   "date": "2024-03-04",
   "time": "13:15:30"
 },
 {
   "id": 5,
   "title": "Appointment 5",
   "date": "2024-03-05",
   "time": "14:15:30"
 }
]
*/

