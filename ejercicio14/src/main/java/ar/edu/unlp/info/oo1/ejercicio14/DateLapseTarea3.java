package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseTarea3 implements DateLapse{
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapseTarea3(LocalDate from, LocalDate to) {
		this.from = from;
		this.sizeInDays = (int)from.until(to, ChronoUnit.DAYS);
	}
		
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.equals(this.from) || other.isAfter(this.from)) 
				&& (other.equals(this.getTo()) || other.isBefore(this.getTo()));
	}
	
	public boolean overlaps(DateLapse other) {
		return (this.includesDate(other.getFrom()) || this.includesDate(other.getTo()))
				|| (this.getFrom().isAfter(other.getFrom()) && this.getTo().isBefore(other.getTo()));
	}
}
