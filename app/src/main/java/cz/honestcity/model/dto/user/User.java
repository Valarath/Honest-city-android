package cz.honestcity.model.dto.user;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class User {
    private long id;
    private String username;
    private int score;
}
