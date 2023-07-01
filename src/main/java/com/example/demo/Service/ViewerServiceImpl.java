package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Viewers;
import com.example.demo.Repository.ViewerRepository;

@Service
public class ViewerServiceImpl implements ViewerService {
	
	@Autowired
	private ViewerRepository viewerrepository;
	
	public Viewers saveViewers(Viewers viewers) {
		return viewerrepository.save(viewers);
	}
	
	public List<Viewers>getAllViewers(){
	return viewerrepository.findAll(); 	
		
	}

}
