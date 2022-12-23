package mk.finki.ukim.mk.lab.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ROLE USER, ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
