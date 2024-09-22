package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Users;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private static int CAR_COUNT;
    private List<Users> users;

    {
        users = new ArrayList<>();

        users.add(new Users(++CAR_COUNT, "Name1", "surName1", 2001));
        users.add(new Users(++CAR_COUNT, "Name2", "surName2", 2002));
        users.add(new Users(++CAR_COUNT, "Name3", "surName3", 2003));
        users.add(new Users(++CAR_COUNT, "Name4", "surName4", 2004));
        users.add(new Users(++CAR_COUNT, "Name5", "surName5", 2005));
    }

    public List<Users> index() {
        return users;
    }


public Users show(int id){
        return users.stream().filter(users->users.getId()==id).findAny().orElse(null);
}

}
