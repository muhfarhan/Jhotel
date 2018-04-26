package jhotel.controller;
import jhotel.DatabaseHotel;
import jhotel.DatabaseRoom;
import jhotel.Room;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RoomController {

    @RequestMapping(value = "/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms()
    {
        ArrayList<Room> ROOM_DATABASE = DatabaseRoom.getVacantRoom();
        return ROOM_DATABASE;
    }

    @RequestMapping(value = "/room/{id_hotel}/{room_no}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel, String room_no)
    {
        Room kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),room_no);
        return kamar;
    }
}

