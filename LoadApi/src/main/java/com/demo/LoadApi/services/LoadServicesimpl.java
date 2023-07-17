package com.demo.LoadApi.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LoadApi.dao.LoadDao;
import com.demo.LoadApi.entities.Load;
@Service
public class LoadServicesimpl implements LoadServices {
	@Autowired
	private LoadDao loadDao;
	@Override
	public List<Load> getLoad() {
		
		return loadDao.findAll();
	}

	public LoadServicesimpl() {}

	@Override
	public Optional<Load> getLoad(int loadId) {
		return loadDao.findById(loadId);
	}

	@Override
	public void addLoad(Load load) {
		loadDao.save(load);
	}

	@Override
	public Load updateLoad(int loadId,Load load) {
		load.setLoadId(loadId);
		loadDao.save(load);
		return load;
	}

	@Override
	public void deleteLoad(int loadId) {
		loadDao.deleteById(loadId);
	}

	@Override
	public List<Load> getAll() {
		return loadDao.findAll();
	}

}
