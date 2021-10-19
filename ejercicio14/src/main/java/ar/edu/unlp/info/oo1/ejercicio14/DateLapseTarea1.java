package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseTarea1 implements DateLapse{
	private LocalDate from;
	private LocalDate to;
	
	public DateLapseTarea1(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
		
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays() {
		return (int)this.from.until(this.to, ChronoUnit.DAYS);
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.equals(this.from) || other.isAfter(this.from)) 
				&& (other.equals(this.to) || other.isBefore(this.to));
	}
	
	public boolean overlaps(DateLapse other) {
		return (this.includesDate(other.getFrom()) || this.includesDate(other.getTo()))
				|| (this.from.isAfter(other.getFrom()) && this.to.isBefore(other.getTo()));
	}
}
