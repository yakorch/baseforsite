package withoutexample.noart.abuser;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "some-path")
public class AbuserController {
    private AbuserService abs;

    @Autowired
    public AbuserController (AbuserService abuserService){
        this.abs = abuserService;
    }

    @GetMapping
    public List<Abuser> getAbusers(){
        return abs.getAbusers();
    }

    @PostMapping
    public void addAbuser (@RequestBody Abuser abuser){
        abs.add(abuser);
    }



}
