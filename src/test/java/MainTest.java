import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : MainTest
 * author         : yebin
 * date           : 2024-04-13
 * description    :
 */
class MainTest {
    @Test
    void main() {
        // Given
        String[] args = {"3", "1", "2"};

        // When & Then
        Main.main(args);

    }
}