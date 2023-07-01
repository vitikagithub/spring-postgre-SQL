package com.example.demo.Service;
import java.util.List;
import com.example.demo.Entity.Viewers;

public interface ViewerService {

	public Viewers saveViewers(Viewers viewers);
	public List<Viewers>getAllViewers();
}
