package com.mbusa.atop.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mbusa.atop.db.model.Load;


public interface CreateLoadRepo extends JpaRepository<Load, Serializable>{ 

}
