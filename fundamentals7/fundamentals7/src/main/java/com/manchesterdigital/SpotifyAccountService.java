package com.manchesterdigital;

public class SpotifyAccountService {
    private AuthenticationService authenticateService;

    public SpotifyAccountService(AuthenticationService authenticateService) {

        this.authenticateService = authenticateService;
    }

    public SpotifyAccount verify(String username, String password) {
        if(!authenticateService.authenticate(username, password)) {
            throw new SpotifyAccountNotValidException();
        }
        return new SpotifyAccount(username, password);
    }
}
