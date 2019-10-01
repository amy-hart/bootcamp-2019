package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

// Validate user login credentials
public class SpotifyAccountServiceTest {

    @Test
    public void whenUsernameAndPasswordValidThenAccountReturned() {
        // Arrange
        // Call object being instantiated subject so we know which is being tested
        SpotifyAccountService subject = new SpotifyAccountService(authenticationService);
        String username = "john@test.com";
        String password = "78hfge6";

        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(true);

        // Act
        SpotifyAccount result = subject.verify(username, password);

        // Assert
        Assertions.assertThat(result.getUsername()).isEqualTo(expectedAccount.getUsername());

    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    //
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    // When AuthenticationService authenticationService is called, don't use the real one, use our mock one further down
    // authenticateService is the fake class name we're going to call instead of AuthenticationService
    @Mock
    private AuthenticationService authenticationService;

    // Do this setup before running tests
    // Call object being instantiated subject so we know which is being tested
    private SpotifyAccountService subject;

    @Before
    public void setUp() {
        subject = new SpotifyAccountService(authenticationService);
    }

    @After
    public void tearDown() throws Exception {
        // Close connections, delete things, tidy up
    }

    @Test
    public void whenUsernameAndPasswordInvalidThenExceptionThrown() {
        // Arrange
        String username = "john@test.com";
        String password = "78hfge6";

        // Setting up Mock
        // When authenticationService
        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false);

        expectedException.expect(SpotifyAccountNotValidException.class); // Assert

        // Do this to trigger authenticationService
        subject.verify(username, password);

        // Assert
        // Verify that authenticationService and authenticate method is called
        // .verify in italics is a method that belongs to Mockito for checking calls
        BDDMockito.verify(authenticationService).authenticate(username, password);

    }
}
