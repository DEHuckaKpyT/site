package nocom.den.site.config;

import lombok.RequiredArgsConstructor;
import nocom.den.site.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
//import study.taxi.service.userService.UserService;

@Component
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

//    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

//        study.taxi.data.entity.User user = userService.getUserByUsername(username);
//
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }

//        List<SimpleGrantedAuthority> authorities = ;

//        return new User(username, user.getPassword(), user.getAuthorities());
        return new User(username, "123", new HashSet<>());
    }
}
