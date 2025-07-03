package ge.tsu.demo.service;

import ge.tsu.demo.model.User;
import ge.tsu.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    @Captor
    private ArgumentCaptor<User> userCaptor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRegisterUser_success() {
        // Arrange
        String username = "testuser";
        String rawPassword = "mypassword";
        String encodedPassword = "encodedpass";

        when(passwordEncoder.encode(rawPassword)).thenReturn(encodedPassword);

        // Act
        userService.registerUser(username, rawPassword);

        // Assert
        verify(userRepository).save(userCaptor.capture());

        User savedUser = userCaptor.getValue();
        assertEquals(username, savedUser.getUsername());
        assertEquals(encodedPassword, savedUser.getPassword());
    }
}
