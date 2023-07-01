package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Viewers;
import com.example.demo.Service.ViewerServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/viewer")
public class ViewerController {
	@Autowired
	private ViewerServiceImpl viewerserviceimpl;
	
	@PostMapping("/addviewer")
	public Viewers addViewers(@RequestBody Viewers viewers) {
	return viewerserviceimpl.saveViewers(viewers);
   }
	
	@GetMapping("/getviewer")
	public List<Viewers>getAllViewers(){
		return viewerserviceimpl.getAllViewers();
	}
}

   
