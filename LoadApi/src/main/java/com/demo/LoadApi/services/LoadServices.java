package com.demo.LoadApi.services;

import java.util.List;
import java.util.Optional;
import com.demo.LoadApi.entities.Load;

public interface LoadServices {
	public List<Load> getLoad();
	public Optional<Load> getLoad(int loadId);
	public void addLoad(Load load);
	public Load updateLoad(int loadId,Load load);
	public void deleteLoad(int loadId);
	public List<Load>getAll();
}
