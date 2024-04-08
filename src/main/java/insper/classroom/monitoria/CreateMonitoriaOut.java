package insper.classroom.monitoria;

import lombok.Builder;
import lombok.experimental.Accessors;


@Builder
@Accessors(fluent = true, chain = true)
public record CreateMonitoriaOut (
    String id
){
    
}
