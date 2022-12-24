package withoutexample.noart.abuser;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbuserService {
    private AbuserRepo repository;

    @Autowired
    public AbuserService(AbuserRepo repository){
        this.repository = repository;
    }

    public List<Abuser> getAbusers(){
        return repository.findAll();

    }

    public void add(Abuser abuser){
        // check if exists already
        if (repository.findAbuserByEmail(abuser.getEmail()).isEmpty()){
            repository.save(abuser);
        }
    }
}
