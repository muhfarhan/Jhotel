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

    @RequestMapping(value = "/room/{id_hotel}/{nomor_kamar}", method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String nomor_kamar)
    {
        Room kamar = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar);
        return kamar;
    }
}

