package si.fri.tabletop.auth;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class AuthBean {

    public static List<Auth> getAuth(){
        return AuthDatabase.getAuth();
    }
    public static Auth addAuth(Auth auth) { return AuthDatabase.addAuth(auth); }
}
