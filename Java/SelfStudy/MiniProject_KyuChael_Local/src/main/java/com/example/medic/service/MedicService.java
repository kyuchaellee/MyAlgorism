package main.java.com.example.medic.service;

import main.java.com.example.medic.model.dao.MedicDao;
import main.java.com.example.medic.model.dto.Medic;

public class MedicService {
    MedicDao medicDao = new MedicDao();
    public void create(Medic medic) {
        medicDao.insert(medic);
    }
}
