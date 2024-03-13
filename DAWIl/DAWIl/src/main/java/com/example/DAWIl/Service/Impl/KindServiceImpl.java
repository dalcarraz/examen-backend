package com.example.DAWIl.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAWIl.Model.Kind;
import com.example.DAWIl.Repo.KindRepo;
import com.example.DAWIl.Service.KindService;

@Service
public class KindServiceImpl implements KindService {

    @Autowired
    KindRepo kindRepo;
    
	@Override
	public List<Kind> list() {
		// TODO Auto-generated method stub
        return kindRepo.findAll();
	}

	@Override
	public Kind add(Kind k) {
		// TODO Auto-generated method stub
        return kindRepo.save(k);
	}

	@Override
	public Kind update(Kind k) {
		// TODO Auto-generated method stub
        return kindRepo.save(k);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
        kindRepo.deleteById(id);

	}
	
	
}