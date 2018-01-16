package si.fri.tabletop.auth;


import java.util.ArrayList;
import java.util.List;

public class AuthDatabase {

    private static List<Auth> auths = new ArrayList<>();

    public static List<Auth> getAuth() {
        return auths;
    }

    public static Auth getAuth(String reservationId) {
        for (Auth auth : auths) {
            if (auth.getId().equals(reservationId))
                return auth;
        }

        return null;
    }

    public static Auth addAuth(Auth auth) {
        auths.add(auth);

        return auth;
    }

    public static void deleteAuth(String authId) {
        for (Auth auth : auths) {
            if (auth.getId().equals(authId)) {
                auths.remove(auth);
                break;
            }
        }
    }
}

