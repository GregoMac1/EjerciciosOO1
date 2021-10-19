package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;

public interface DateLapse {
	public LocalDate getFrom();
	
	public LocalDate getTo();
	
	public int sizeInDays();
	
	public boolean includesDate(LocalDate other);
	
	public boolean overlaps(DateLapse other);
}
