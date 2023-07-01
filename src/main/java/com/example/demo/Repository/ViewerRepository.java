package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Viewers;

public interface ViewerRepository extends JpaRepository<Viewers,Integer> {
	

}
