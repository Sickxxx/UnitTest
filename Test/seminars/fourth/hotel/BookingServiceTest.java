package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    @Test
    public void hotelTestTrue() {
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);
        when(bookingService.bookRoom(4)).thenReturn(true);
        boolean value = bookingService.bookRoom(4);
        assertTrue(value);
    }

    @Test
    public void hotelTestFalse() {
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);
        when(bookingService.bookRoom(3)).thenReturn(false);
        boolean value = bookingService.bookRoom(3);
        assertFalse(value);
    }
}