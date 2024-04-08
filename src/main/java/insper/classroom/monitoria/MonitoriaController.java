package insper.classroom.monitoria;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("classroom-monitoria")
public interface MonitoriaController {

    @PostMapping("/monitorias/register")
    ResponseEntity<?> create (
        @RequestBody(required = true) CreateMonitoriaIn in
    );

    @GetMapping("monitorias/{id}")
    ResponseEntity<?> get (
        @PathVariable(required = true) String id
        
    );
    
   
}