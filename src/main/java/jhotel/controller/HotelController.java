package jhotel.controller;
import jhotel.Hotel;
import jhotel.DatabaseHotel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelController {

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelList()
    {
        ArrayList<Hotel> HOTEL_DATABASE = DatabaseHotel.getHotelDatabase();
        return HOTEL_DATABASE;
    }

    @RequestMapping(value = "/hotel/{id_hotel}", method = RequestMethod.GET)
    public Hotel getHotel(@PathVariable int id)
    {
        Hotel hotel = DatabaseHotel.getHotel(id);
        return hotel;
    }
}
