package Demo.MainDemo.ServiceImp;

import Demo.MainDemo.Models.HotelPhoto;
import Demo.MainDemo.Repositories.HotelPhotorepos;

import Demo.MainDemo.Services.HotelPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HotelPhotoServiceImp implements HotelPhotoService{
    @Autowired

    private HotelPhotorepos repository;
    public List<HotelPhoto> listAllHotelPhotos(){
        return repository.findAll();
    }
}
